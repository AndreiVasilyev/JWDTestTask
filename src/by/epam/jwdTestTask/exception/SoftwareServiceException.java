package by.epam.jwdTestTask.exception;

public class SoftwareServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public SoftwareServiceException() {
		super();
	}

	public SoftwareServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SoftwareServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public SoftwareServiceException(String message) {
		super(message);
	}

	public SoftwareServiceException(Throwable cause) {
		super(cause);
	}
}
