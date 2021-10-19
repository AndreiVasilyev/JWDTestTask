package by.epam.jwdTestTask.service;

import java.util.Map;

import by.epam.jwdTestTask.bean.computer.Computer;
import by.epam.jwdTestTask.exception.ComputerServiceException;

public interface ComputerService {

	void writeComputer(Computer computer, Map<String, String> parameters) throws ComputerServiceException;
}
