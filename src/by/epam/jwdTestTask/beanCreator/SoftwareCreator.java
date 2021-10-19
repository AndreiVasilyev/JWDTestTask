package by.epam.jwdTestTask.beanCreator;

import javax.xml.stream.events.StartElement;

import by.epam.jwdTestTask.bean.software.Software;

public interface SoftwareCreator {

	Software createSoftware(StartElement startElement);
}
