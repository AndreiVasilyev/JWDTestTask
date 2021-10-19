package by.epam.jwdTestTask.beanCreator.impl;

import javax.xml.namespace.QName;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;

import by.epam.jwdTestTask.bean.software.Game;
import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.beanCreator.SoftwareCreator;

public class GameCreator implements SoftwareCreator {

	@Override
	public Software createSoftware(StartElement startElement) {
		Game software = new Game();
		Attribute gameType = startElement.getAttributeByName(new QName("gameType"));
		if (gameType != null) {
			software.setGameType(gameType.getValue());
		}
		return SoftwareFieldsReader.readFields(software, startElement);
	}

}
