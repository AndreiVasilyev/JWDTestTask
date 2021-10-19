package by.epam.jwdTestTask.bean.computer;

import java.util.ArrayList;
import java.util.List;

import by.epam.jwdTestTask.bean.software.Software;

public class Computer {

	private ComputerType computerType;
	private List<Software> computerSoftware;

	public Computer() {
	}

	public Computer(ComputerType computerType) {
		this.computerType = computerType;
	}

	public ComputerType getComputerType() {
		return computerType;
	}

	public void setComputerType(ComputerType computerType) {
		this.computerType = computerType;
	}

	public List<Software> getComputerSoftware() {
		return computerSoftware;
	}

	public void setComputerSoftware(List<Software> computerSoftware) {
		this.computerSoftware = computerSoftware;
	}

	public void addComputerSoftware(Software software) {
		if (computerSoftware == null)
			computerSoftware = new ArrayList<Software>();
		computerSoftware.add(software);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((computerSoftware == null) ? 0 : computerSoftware.hashCode());
		result = prime * result + ((computerType == null) ? 0 : computerType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (computerSoftware == null) {
			if (other.computerSoftware != null)
				return false;
		} else if (!computerSoftware.equals(other.computerSoftware))
			return false;
		if (computerType != other.computerType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Computer [computerType=" + computerType + ", computerSoftware=" + computerSoftware + "]";
	}
}
