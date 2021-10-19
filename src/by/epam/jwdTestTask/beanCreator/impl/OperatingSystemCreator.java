package by.epam.jwdTestTask.beanCreator.impl;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;

import by.epam.jwdTestTask.bean.software.OperatingSystem;
import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.beanCreator.SoftwareCreator;

public class OperatingSystemCreator implements SoftwareCreator {

	@Override
	public Software createSoftware(StartElement startElement) {
		OperatingSystem software = new OperatingSystem();
		Attribute bitness = startElement.getAttributeByName(new QName("bitness"));
		if (bitness != null) {
			software.setBitness(Byte.parseByte(bitness.getValue()));
		}
		return SoftwareFieldsReader.readFields(software, startElement);
	}

}
