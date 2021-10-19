package by.epam.jwdTestTask.beanCreator.impl;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;

import by.epam.jwdTestTask.bean.software.IDE;
import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.beanCreator.SoftwareCreator;

public class IDECreator implements SoftwareCreator {

	@Override
	public Software createSoftware(StartElement startElement) {
		IDE software = new IDE();
		Attribute supportLanguages = startElement.getAttributeByName(new QName("supportLanguages"));
		if (supportLanguages != null) {
			software.setSupportLanguages(supportLanguages.getValue());
		}
		return SoftwareFieldsReader.readFields(software, startElement);
	}

}
