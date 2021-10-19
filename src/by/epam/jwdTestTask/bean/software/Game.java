package by.epam.jwdTestTask.bean.software;

public class Game extends ApplicationSoftware {

	private String gameType;

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((gameType == null) ? 0 : gameType.hashCode());
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
		Game other = (Game) obj;
		if (gameType == null) {
			if (other.gameType != null)
				return false;
		} else if (!gameType.equals(other.gameType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Game [name=" + super.getName() + ", osFamily=" + super.getOsFamily() + ", version=" + super.getVersion()
				+ ", releaseDate=" + super.getReleaseDate() + ", size=" + super.getSize() + ", price="
				+ super.getPrice() + ", gameType=" + gameType + "]";
	}

}
