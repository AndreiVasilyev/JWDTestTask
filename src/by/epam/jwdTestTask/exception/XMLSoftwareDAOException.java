package by.epam.jwdTestTask.exception;

public class XMLSoftwareDAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public XMLSoftwareDAOException() {
		super();
	}

	public XMLSoftwareDAOException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public XMLSoftwareDAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public XMLSoftwareDAOException(String message) {
		super(message);
	}

	public XMLSoftwareDAOException(Throwable cause) {
		super(cause);
	}
}
