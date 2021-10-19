package by.epam.jwdTestTask.main;

import java.util.HashMap;
import java.util.Map;

import by.epam.jwdTestTask.bean.computer.Computer;
import by.epam.jwdTestTask.bean.computer.ComputerType;
import by.epam.jwdTestTask.controller.ComputerController;

public class Main {
	public static void main(String[] args) {
		ComputerController controller = new ComputerController();
		Computer computer = new Computer(ComputerType.DEVELOPMENT);
		computer.setComputerSoftware(controller.createSoftwareList(computer));
		Map<String, String> parameters = new HashMap<>();
		parameters.put("SoftwarePrice", String.valueOf(controller.calculateComputerSoftwarePrice(computer)));
		parameters.put("SoftwareSize", String.valueOf(controller.calculateComputerSoftwareSize(computer)));
		controller.saveComputerToXML(computer, parameters);
	}
}
