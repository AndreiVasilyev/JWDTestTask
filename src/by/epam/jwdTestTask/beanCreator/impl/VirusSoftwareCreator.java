package by.epam.jwdTestTask.beanCreator.impl;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;

import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.bean.software.VirusSoftware;
import by.epam.jwdTestTask.beanCreator.SoftwareCreator;

public class VirusSoftwareCreator implements SoftwareCreator {

	@Override
	public Software createSoftware(StartElement startElement) {
		VirusSoftware software = new VirusSoftware();
		Attribute virusType = startElement.getAttributeByName(new QName("virusType"));
		if (virusType != null) {
			software.setVirusType(virusType.getValue());
		}
		return SoftwareFieldsReader.readFields(software, startElement);
	}

}
