package by.epam.jwdTestTask.bean.software;

public class VirusSoftware extends SystemSoftware {

	private String virusType;

	public String getVirusType() {
		return virusType;
	}

	public void setVirusType(String virusType) {
		this.virusType = virusType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((virusType == null) ? 0 : virusType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		VirusSoftware other = (VirusSoftware) obj;
		if (virusType == null) {
			if (other.virusType != null)
				return false;
		} else if (!virusType.equals(other.virusType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "VirusSoftware [name=" + super.getName() + ", osFamily=" + super.getOsFamily() + ", version="
				+ super.getVersion() + ", releaseDate=" + super.getReleaseDate() + ", size=" + super.getSize()
				+ ", price=" + super.getPrice() + ", virusType=" + virusType + "]";
	}

}
