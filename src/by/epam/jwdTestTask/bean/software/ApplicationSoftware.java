package by.epam.jwdTestTask.bean.software;

public abstract class ApplicationSoftware extends Software {

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override	
	public String toString() {
		return "ApplicationSoftware [name=" + super.getName() + ", osFamily=" + super.getOsFamily() + ", version="
				+ super.getVersion() + ", releaseDate=" + super.getReleaseDate() + ", size=" + super.getSize()
				+ ", price=" + super.getPrice() + "]";
	}
	
}
