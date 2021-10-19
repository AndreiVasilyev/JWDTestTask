package by.epam.jwdTestTask.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import by.epam.jwdTestTask.bean.software.Software;
import by.epam.jwdTestTask.dao.DAOProvider;
import by.epam.jwdTestTask.exception.SoftwareServiceException;
import by.epam.jwdTestTask.exception.XMLSoftwareDAOException;
import by.epam.jwdTestTask.service.SoftwareService;

public class SoftwareServiceImpl implements SoftwareService {

	private DAOProvider daoPrivider = DAOProvider.getInstance();

	@Override
	public List<Software> readAllSoftware() throws SoftwareServiceException {
		List<Software> allSoftware = null;
		try {
			allSoftware = daoPrivider.getSoftwareDAO().readSoftware();
		} catch (XMLSoftwareDAOException e) {
			throw new SoftwareServiceException("Error read all Software", e);
		}
		return allSoftware;
	}

	@Override
	public Software findSoftwareByName(String name) throws SoftwareServiceException {
		List<Software> allSoftware = readAllSoftware();
		List<Software> resultList = allSoftware.stream().filter(soft -> soft.getName().contains(name))
				.collect(Collectors.toList());
		if (resultList == null || resultList.isEmpty())
			return null;
		Software result = resultList.stream().filter(soft -> soft.getName().equalsIgnoreCase(name)).findFirst()
				.orElse(resultList.get(0));
		return result;
	}

}
