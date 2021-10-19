package by.epam.jwdTestTask.bean.software;

public class Database extends ApplicationSoftware {

	private String baseType;

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((baseType == null) ? 0 : baseType.hashCode());
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
		Database other = (Database) obj;
		if (baseType == null) {
			if (other.baseType != null)
				return false;
		} else if (!baseType.equals(other.baseType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Database [name=" + super.getName() + ", osFamily=" + super.getOsFamily() + ", version="
				+ super.getVersion() + ", releaseDate=" + super.getReleaseDate() + ", size=" + super.getSize()
				+ ", price=" + super.getPrice() + ", baseType=" + baseType + "]";
	}

}
