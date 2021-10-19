package by.epam.jwdTestTask.dao.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import by.epam.jwdTestTask.bean.computer.Computer;
import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.dao.ComputerDAO;
import by.epam.jwdTestTask.exception.XMLComputerDAOException;

public class XMLComputerDAOImpl implements ComputerDAO {

	private final String FILE_PATH = "./resource/Computer.xml";
	private final String NEW_LINE = "\n";
	private final String TAB = "\t";

	@Override
	public void writeComputer(Computer computer, Map<String, String> parameters) throws XMLComputerDAOException {

		XMLOutputFactory output = XMLOutputFactory.newInstance();
		XMLStreamWriter writer;
		try {
			writer = output.createXMLStreamWriter(new FileWriter(new File(FILE_PATH)));
			writer.writeStartDocument("UTF-8", "1.0");
			writer.writeCharacters(NEW_LINE);
			writer.writeStartElement("Computer");
			writer.writeCharacters(NEW_LINE + TAB);
			writer.writeStartElement("ComputerType");
			writer.writeCharacters(computer.getComputerType().toString());
			writer.writeEndElement();
			writer.writeCharacters(NEW_LINE + NEW_LINE + TAB);
			writer.writeStartElement("Parameters");
			writer.writeEndElement();
			writer.writeCharacters(NEW_LINE + NEW_LINE + TAB);
			writer.writeStartElement("Software");
			for (Software software : computer.getComputerSoftware()) {
				writer.writeCharacters(NEW_LINE + TAB + TAB);
				writer.writeEmptyElement(software.getClass().getSimpleName());
				List<Field> fields = getAllFields(software.getClass());
				for (Field field : fields) {
					field.setAccessible(true);
					String value = String.valueOf(field.get(software));
					writer.writeAttribute(field.getName(), value);
					field.setAccessible(false);
				}
			}
			writer.writeCharacters(NEW_LINE + TAB);
			writer.writeEndElement();
			for (Map.Entry<String, String> entry : parameters.entrySet()) {
				writer.writeCharacters(NEW_LINE + NEW_LINE + TAB);
				writer.writeStartElement(entry.getKey());
				writer.writeCharacters(entry.getValue());
				writer.writeEndElement();
			}
			writer.writeCharacters(NEW_LINE);
			writer.writeEndElement();
			writer.writeEndDocument();
			writer.flush();
		} catch (XMLStreamException e) {
			throw new XMLComputerDAOException("Error parsing xml file", e);
		} catch (IOException e) {
			throw new XMLComputerDAOException("Error writing xml file", e);
		} catch (IllegalArgumentException e) {
			throw new XMLComputerDAOException("Error parsing xml file", e);
		} catch (IllegalAccessException e) {
			throw new XMLComputerDAOException("Error parsing xml file", e);
		}

	}

	private List<Field> getAllFields(Class<?> clazz) {
		List<Field> fields = new ArrayList<Field>();
		fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
		if (!"Software".equalsIgnoreCase(clazz.getSimpleName())) {
			fields.addAll(getAllFields(clazz.getSuperclass()));
		}
		return fields;
	}
}
