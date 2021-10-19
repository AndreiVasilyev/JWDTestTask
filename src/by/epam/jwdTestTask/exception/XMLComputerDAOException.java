package by.epam.jwdTestTask.exception;

public class XMLComputerDAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public XMLComputerDAOException() {
		super();
	}

	public XMLComputerDAOException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public XMLComputerDAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public XMLComputerDAOException(String message) {
		super(message);
	}

	public XMLComputerDAOException(Throwable cause) {
		super(cause);
	}

}
