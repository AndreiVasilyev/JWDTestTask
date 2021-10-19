package by.epam.jwdTestTask.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import by.epam.jwdTestTask.bean.computer.Computer;
import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.exception.ComputerServiceException;
import by.epam.jwdTestTask.exception.SoftwareServiceException;
import by.epam.jwdTestTask.service.ComputerService;
import by.epam.jwdTestTask.service.ServiceProvider;
import by.epam.jwdTestTask.service.SoftwareService;

public class ComputerController {

	private static final Logger LOGGER = Logger.getLogger(ComputerController.class.getName());

	static {
		try {
			LogManager.getLogManager().readConfiguration(new FileInputStream("logging.properties"));
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
	}

	private ServiceProvider serviceProvider = ServiceProvider.getInstance();

	public List<Software> createSoftwareList(Computer computer) {
		SoftwareService softwareService = serviceProvider.getSoftwareService();
		List<Software> resultList = new ArrayList<>();
		String computerType = computer.getComputerType().toString();
		try {
			switch (computerType) {
			case "GAMING":
				resultList.add(softwareService.findSoftwareByName("Windows 10"));
				resultList.add(softwareService.findSoftwareByName("Avast"));
				resultList.add(softwareService.findSoftwareByName("Chess"));
				resultList.add(softwareService.findSoftwareByName("Solitaire"));
				resultList.add(softwareService.findSoftwareByName("Grand Theft"));
				resultList.add(softwareService.findSoftwareByName("Far Cry"));
				resultList.add(softwareService.findSoftwareByName("Fallout"));
				resultList.add(softwareService.findSoftwareByName("Need for Speed"));
				break;
			case "ENTERTAINMENT":
				resultList.add(softwareService.findSoftwareByName("Windows 11"));
				resultList.add(softwareService.findSoftwareByName("Norton"));
				resultList.add(softwareService.findSoftwareByName("LibreOffice"));
				resultList.add(softwareService.findSoftwareByName("Solitaire"));
				resultList.add(softwareService.findSoftwareByName("Chess"));
				resultList.add(softwareService.findSoftwareByName("Fallout"));
				break;
			case "BUSINESS":
				resultList.add(softwareService.findSoftwareByName("Mac"));
				resultList.add(softwareService.findSoftwareByName("Mac"));
				resultList.add(softwareService.findSoftwareByName("WPS Office"));
				resultList.add(softwareService.findSoftwareByName("Solitaire"));
				break;
			case "EDUCATIONAL":
				resultList.add(softwareService.findSoftwareByName("Windows 10"));
				resultList.add(softwareService.findSoftwareByName("McAfee"));
				resultList.add(softwareService.findSoftwareByName("Microsoft Office"));
				resultList.add(softwareService.findSoftwareByName("Oracle"));
				break;
			case "DEVELOPMENT":
				resultList.add(softwareService.findSoftwareByName("Linux"));
				resultList.add(softwareService.findSoftwareByName("Sophos"));
				resultList.add(softwareService.findSoftwareByName("IntelliJ"));
				resultList.add(softwareService.findSoftwareByName("PhpStorm"));
				resultList.add(softwareService.findSoftwareByName("OpenOffice"));
				resultList.add(softwareService.findSoftwareByName("MongoDB"));
				resultList.add(softwareService.findSoftwareByName("MySQL"));
				resultList.add(softwareService.findSoftwareByName("PostgreSQL"));
				break;
			}
		} catch (SoftwareServiceException e) {
			LOGGER.log(Level.SEVERE, "Error finding software", e);
			return null;
		}
		return resultList;
	}

	public long calculateComputerSoftwareSize(Computer computer) {
		long result = 0;
		for (Software software : computer.getComputerSoftware()) {
			result += software.getSize();
		}
		return result;
	}

	public int calculateComputerSoftwarePrice(Computer computer) {
		int result = 0;
		for (Software software : computer.getComputerSoftware()) {
			result += software.getPrice();
		}
		return result;
	}

	public boolean saveComputerToXML(Computer computer, Map<String, String> parameters) {
		ComputerService computerService = serviceProvider.getComputerService();
		try {
			computerService.writeComputer(computer, parameters);
		} catch (ComputerServiceException e) {
			LOGGER.log(Level.SEVERE, "Error save computer", e);
			return false;
		}
		return true;
	}

}
