package by.epam.jwdTestTask.exception;

public class ComputerServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public ComputerServiceException() {
		super();
	}

	public ComputerServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ComputerServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ComputerServiceException(String message) {
		super(message);
	}

	public ComputerServiceException(Throwable cause) {
		super(cause);
	}
}
