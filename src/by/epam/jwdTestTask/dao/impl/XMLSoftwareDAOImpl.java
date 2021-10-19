package by.epam.jwdTestTask.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.beanCreator.SoftwareCreator;
import by.epam.jwdTestTask.beanCreator.SoftwareCreatorProvider;
import by.epam.jwdTestTask.dao.SoftwareDAO;
import by.epam.jwdTestTask.exception.XMLSoftwareDAOException;

public class XMLSoftwareDAOImpl implements SoftwareDAO {

	private final String FILE_PATH = "./resource/Software.xml";
	private SoftwareCreatorProvider softwareCreatorProvider = new SoftwareCreatorProvider();

	@Override
	public List<Software> readSoftware() throws XMLSoftwareDAOException {
		List<Software> result = new ArrayList<Software>();
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		Software software = null;
		try {
			XMLEventReader reader = xmlInputFactory.createXMLEventReader(new FileInputStream(new File(FILE_PATH)));
			while (reader.hasNext()) {
				XMLEvent xmlEvent = reader.nextEvent();
				if (xmlEvent.isStartElement()) {
					StartElement startElement = xmlEvent.asStartElement();
					String elementName = startElement.getName().getLocalPart();
					SoftwareCreator softwareCreator = softwareCreatorProvider.getSoftwareCreator(elementName);
					if (softwareCreator != null) {
						software = softwareCreator.createSoftware(startElement);
					}
				}
				if (xmlEvent.isEndElement() && software != null) {
					result.add(software);
					software = null;
				}
			}

		} catch (FileNotFoundException e) {
			throw new XMLSoftwareDAOException("Source file not found", e);
		} catch (XMLStreamException e) {
			throw new XMLSoftwareDAOException("Error reading xml file", e);
		}
		return result;
	}

}
