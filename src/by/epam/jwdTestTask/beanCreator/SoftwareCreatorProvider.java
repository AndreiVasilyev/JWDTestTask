package by.epam.jwdTestTask.beanCreator;

import java.util.HashMap;
import java.util.Map;

import by.epam.jwdTestTask.beanCreator.impl.AntivirusSoftwareCreator;
import by.epam.jwdTestTask.beanCreator.impl.DatabaseCreator;
import by.epam.jwdTestTask.beanCreator.impl.GameCreator;
import by.epam.jwdTestTask.beanCreator.impl.IDECreator;
import by.epam.jwdTestTask.beanCreator.impl.OfficePackageCreator;
import by.epam.jwdTestTask.beanCreator.impl.OperatingSystemCreator;
import by.epam.jwdTestTask.beanCreator.impl.VirusSoftwareCreator;

public class SoftwareCreatorProvider {

	private Map<String, SoftwareCreator> softwareCreators = new HashMap<String, SoftwareCreator>();

	public SoftwareCreatorProvider() {
		softwareCreators.put("OperatingSystem", new OperatingSystemCreator());
		softwareCreators.put("VirusSoftware", new VirusSoftwareCreator());
		softwareCreators.put("AntivirusSoftware", new AntivirusSoftwareCreator());
		softwareCreators.put("IDE", new IDECreator());
		softwareCreators.put("OfficePackage", new OfficePackageCreator());
		softwareCreators.put("Database", new DatabaseCreator());
		softwareCreators.put("Game", new GameCreator());
	}

	public SoftwareCreator getSoftwareCreator(String name) {
		return softwareCreators.get(name);
	}
}
