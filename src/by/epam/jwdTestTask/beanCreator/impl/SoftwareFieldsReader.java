package by.epam.jwdTestTask.beanCreator.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;

import by.epam.jwdTestTask.bean.software.OSFamily;
import by.epam.jwdTestTask.bean.software.Software;

public class SoftwareFieldsReader {

	public static Software readFields(Software software, StartElement startElement) {
		Attribute attribute = startElement.getAttributeByName(new QName("name"));
		if (attribute != null) {
			software.setName(attribute.getValue());
		}
		attribute = startElement.getAttributeByName(new QName("osFamily"));
		if (attribute != null) {
			software.setOsFamily(OSFamily.valueOf(attribute.getValue().toUpperCase()));
		}
		attribute = startElement.getAttributeByName(new QName("version"));
		if (attribute != null) {
			software.setVersion(attribute.getValue());
		}
		attribute = startElement.getAttributeByName(new QName("releaseDate"));
		if (attribute != null) {
			String stringDate = attribute.getValue().replaceAll("\\.", "-");
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
			try {
				software.setReleaseDate(formatter.parse(stringDate));
			} catch (ParseException e) {
				software.setReleaseDate(null);
			}
		}
		attribute = startElement.getAttributeByName(new QName("size"));
		if (attribute != null) {
			software.setSize(Long.parseLong(attribute.getValue()));
		}
		attribute = startElement.getAttributeByName(new QName("price"));
		if (attribute != null) {
			software.setPrice(Integer.parseInt(attribute.getValue()));
		}
		return software;
	}

}
