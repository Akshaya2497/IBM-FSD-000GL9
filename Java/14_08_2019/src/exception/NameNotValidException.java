package exception;

public class NameNotValidException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4196944437080348900L;
	private String message;
	public NameNotValidException() {
		
	}
	public NameNotValidException(String msg) {
		this.setMessage(msg);
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
