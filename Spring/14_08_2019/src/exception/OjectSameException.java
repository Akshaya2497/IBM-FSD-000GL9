package exception;

public class OjectSameException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8655708810239051731L;
	private String message;
	public OjectSameException() {
		
	}
	public OjectSameException(String msg) {
		this.setMessage(msg);
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
