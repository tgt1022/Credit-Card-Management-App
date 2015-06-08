// This is an Academic Project, and was published after finishing the lecture.
// @author Joao Elvas @ FCT/UNL
// @author Rodolfo Simoes @ FCT/UNL

package exceptionPackage;

public class TextIdAlreadyInUseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TextIdAlreadyInUseException() {
		super();
	}
	
	public TextIdAlreadyInUseException(String msg) {
		super(msg);
	}
	
}
