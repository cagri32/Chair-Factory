package eecs2030.lab5;


/**
 * 
 *  The ChairCategoryNotValid exception class 
 *
 */

public class ChairCategoryNotValid extends RuntimeException {

	private static final long serialVersionUID = 1L;


	/**
	 * Initializes a <code>ChairColorNotValid</code> with no 
	 * detail message.
	 */
	
	public ChairCategoryNotValid() {
        super();
    }
	
	
	/**
	 * Initializes a <code>ChairColorNotValid</code> with the 
	 * specified detail message.
	 * 
	 * @param message the detail message
	 */
    public ChairCategoryNotValid(String message) {
        super(message);
    } 

}
