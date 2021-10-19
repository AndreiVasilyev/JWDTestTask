package by.epam.jwdTestTask.bean.software;

public class IDE extends DevelopmentSystem {

	private String supportLanguages;

	public String getSupportLanguages() {
		return supportLanguages;
	}

	public void setSupportLanguages(String supportLanguages) {
		this.supportLanguages = supportLanguages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((supportLanguages == null) ? 0 : supportLanguages.hashCode());
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
		IDE other = (IDE) obj;
		if (supportLanguages == null) {
			if (other.supportLanguages != null)
				return false;
		} else if (!supportLanguages.equals(other.supportLanguages))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IDE [name=" + super.getName() + ", osFamily=" + super.getOsFamily() + ", version=" + super.getVersion()
				+ ", releaseDate=" + super.getReleaseDate() + ", size=" + super.getSize() + ", price="
				+ super.getPrice() + ", supportLanguages=" + supportLanguages + "]";
	}

}
