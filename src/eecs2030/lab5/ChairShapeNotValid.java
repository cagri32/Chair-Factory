package eecs2030.lab5;

/**
 * 
 *  The ChairShapeNotValid exception class 
 *
 */

public class ChairShapeNotValid extends RuntimeException {

	private static final long serialVersionUID = 1L;


	/**
	 * Initializes a <code>ChairShapeNotValid</code> with no 
	 * detail message.
	 */
	
	public ChairShapeNotValid() {
        super();
    }
	
	
	/**
	 * Initializes a <code>ChairColorNotValid</code> with the 
	 * specified detail message.
	 * 
	 * @param message the detail message
	 */
    public ChairShapeNotValid(String message) {
        super(message);
    } 


}
