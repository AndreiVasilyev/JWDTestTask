package by.epam.jwdTestTask.dao;

import java.util.List;

import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.exception.XMLSoftwareDAOException;

public interface SoftwareDAO {

	List<Software> readSoftware() throws XMLSoftwareDAOException;

}
