package by.epam.jwdTestTask.beanCreator.impl;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;

import by.epam.jwdTestTask.bean.software.Database;
import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.beanCreator.SoftwareCreator;

public class DatabaseCreator implements SoftwareCreator {

	@Override
	public Software createSoftware(StartElement startElement) {
		Database software = new Database();
		Attribute baseType = startElement.getAttributeByName(new QName("baseType"));
		if (baseType != null) {
			software.setBaseType(baseType.getValue());
		}
		return SoftwareFieldsReader.readFields(software, startElement);
	}

}
