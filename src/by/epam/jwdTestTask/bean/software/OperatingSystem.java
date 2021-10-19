package by.epam.jwdTestTask.bean.software;

public class OperatingSystem extends SystemSoftware {

	private byte bitness;

	public byte getBitness() {
		return bitness;
	}

	public void setBitness(byte bitness) {
		this.bitness = bitness;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + bitness;
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
		OperatingSystem other = (OperatingSystem) obj;
		if (bitness != other.bitness)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OperatingSystem [name=" + super.getName() + ", osFamily=" + super.getOsFamily() + ", version="
				+ super.getVersion() + ", releaseDate=" + super.getReleaseDate() + ", size=" + super.getSize()
				+ ", price=" + super.getPrice() + ", bitness=" + bitness + "]";
	}

}
