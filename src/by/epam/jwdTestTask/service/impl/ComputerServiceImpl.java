package by.epam.jwdTestTask.service.impl;

import java.util.Map;

import by.epam.jwdTestTask.bean.computer.Computer;
import by.epam.jwdTestTask.dao.DAOProvider;
import by.epam.jwdTestTask.exception.ComputerServiceException;
import by.epam.jwdTestTask.exception.XMLComputerDAOException;
import by.epam.jwdTestTask.service.ComputerService;

public class ComputerServiceImpl implements ComputerService {

	private DAOProvider daoProvider = DAOProvider.getInstance();

	@Override
	public void writeComputer(Computer computer, Map<String, String> parameters) throws ComputerServiceException {
		try {
			daoProvider.getComputerDAO().writeComputer(computer, parameters);
		} catch (XMLComputerDAOException e) {
			throw new ComputerServiceException("Error writting computer", e);
		}

	}

}
