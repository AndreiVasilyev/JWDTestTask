package by.epam.jwdTestTask.beanCreator.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;

import by.epam.jwdTestTask.bean.software.OfficePackage;
import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.beanCreator.SoftwareCreator;

public class OfficePackageCreator implements SoftwareCreator {

	@Override
	public Software createSoftware(StartElement startElement) {
		OfficePackage software = new OfficePackage();
		Attribute programs = startElement.getAttributeByName(new QName("programs"));
		if (programs != null) {
			List<String> programList = new ArrayList<>(Arrays.asList(programs.getValue().split(",")));
			software.setPrograms(programList);
		}
		return SoftwareFieldsReader.readFields(software, startElement);
	}

}
