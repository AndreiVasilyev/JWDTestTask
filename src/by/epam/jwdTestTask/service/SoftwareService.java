package by.epam.jwdTestTask.service;

import java.util.List;

import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.exception.SoftwareServiceException;

public interface SoftwareService {

	List<Software> readAllSoftware() throws SoftwareServiceException;

	Software findSoftwareByName(String name) throws SoftwareServiceException;
}
