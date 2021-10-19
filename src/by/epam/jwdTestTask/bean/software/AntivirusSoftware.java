package by.epam.jwdTestTask.bean.software;

public class AntivirusSoftware extends SystemSoftware {

	private String license;

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((license == null) ? 0 : license.hashCode());
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
		AntivirusSoftware other = (AntivirusSoftware) obj;
		if (license == null) {
			if (other.license != null)
				return false;
		} else if (!license.equals(other.license))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AntivirusSoftware [name=" + super.getName() + ", osFamily=" + super.getOsFamily() + ", version="
				+ super.getVersion() + ", releaseDate=" + super.getReleaseDate() + ", size=" + super.getSize()
				+ ", price=" + super.getPrice() + ", license=" + license + "]";
	}

}
