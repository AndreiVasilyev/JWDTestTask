package by.epam.jwdTestTask.dao;

import java.util.Map;

import by.epam.jwdTestTask.bean.computer.Computer;
import by.epam.jwdTestTask.exception.XMLComputerDAOException;

public interface ComputerDAO {

	void writeComputer(Computer computer, Map<String, String> parameters) throws XMLComputerDAOException;
}
