package by.epam.jwdTestTask.beanCreator.impl;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;

import by.epam.jwdTestTask.bean.software.AntivirusSoftware;
import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.beanCreator.SoftwareCreator;

public class AntivirusSoftwareCreator implements SoftwareCreator {

	@Override
	public Software createSoftware(StartElement startElement) {
		AntivirusSoftware software = new AntivirusSoftware();
		Attribute license = startElement.getAttributeByName(new QName("license"));
		if (license != null) {
			software.setLicense(license.getValue());
		}
		return SoftwareFieldsReader.readFields(software, startElement);
	}

}
