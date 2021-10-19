package by.epam.jwdTestTask.service;

import by.epam.jwdTestTask.service.impl.ComputerServiceImpl;
import by.epam.jwdTestTask.service.impl.SoftwareServiceImpl;

public class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();

	private SoftwareService softwareService = new SoftwareServiceImpl();
	private ComputerService computerService = new ComputerServiceImpl();

	private ServiceProvider() {

	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public SoftwareService getSoftwareService() {
		return softwareService;
	}

	public void setSoftwareService(SoftwareService softwareService) {
		this.softwareService = softwareService;
	}

	public ComputerService getComputerService() {
		return computerService;
	}

	public void setComputerService(ComputerService computerService) {
		this.computerService = computerService;
	}

}
