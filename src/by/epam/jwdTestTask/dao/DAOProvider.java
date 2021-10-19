package by.epam.jwdTestTask.dao;

import by.epam.jwdTestTask.dao.impl.XMLComputerDAOImpl;
import by.epam.jwdTestTask.dao.impl.XMLSoftwareDAOImpl;

public class DAOProvider {

	private static final DAOProvider instance = new DAOProvider();

	private SoftwareDAO softwareDAO = new XMLSoftwareDAOImpl();
	private ComputerDAO computerDAO = new XMLComputerDAOImpl();

	private DAOProvider() {

	}

	public static DAOProvider getInstance() {
		return instance;
	}

	public SoftwareDAO getSoftwareDAO() {
		return softwareDAO;
	}

	public void setSoftwareDAO(SoftwareDAO softwareDAO) {
		this.softwareDAO = softwareDAO;
	}

	public ComputerDAO getComputerDAO() {
		return computerDAO;
	}

	public void setComputerDAO(ComputerDAO computerDAO) {
		this.computerDAO = computerDAO;
	}

}
