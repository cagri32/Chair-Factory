package eecs2030.lab5;

/**
 * 
 *  The ChairColorNotValid exception class 
 *
 */

public class ChairColorNotValid extends RuntimeException {

	private static final long serialVersionUID = 1L;


	/**
	 * Initializes a <code>ChairColorNotValid</code> with no 
	 * detail message.
	 */
	
	public ChairColorNotValid() {
        super();
    }
	
	
	/**
	 * Initializes a <code>ChairColorNotValid</code> with the 
	 * specified detail message.
	 * 
	 * @param message the detail message
	 */
    public ChairColorNotValid(String message) {
        super(message);
    } 

}
