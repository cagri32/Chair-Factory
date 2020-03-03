package eecs2030.lab5;

import java.util.*;



/**
 * 
 * Abstract base class for simple chair. The Chair is a Furniture item
 * that has some fields (attributes). 
 * <strong>This class store the color, manufacturing cost and shape of a chair </strong>.
 * 
 * 
 *  <p> <strong> NOTE: In this class,  all string comparisons are carried out with case insensitive </strong> </p>
 *
 */



public abstract class Chair implements Comparable<Chair>{
	
	
	
	/**
     * The total number of Chairs created ( or manufactured) using the Chair Class
     * numChairs is a static variable that will be incremented each time a new Chair  object is 
     * created and keeps track of the total number of Chair objects that have been created.
     * 
     * 
     */
	// COMPLETE THIS
	
    
    
    
    /**
     * The Id of chair  object 
     * 
     * All instances of a chair are given a unique int id. 
     * These are to be assigned by the chair constructor. 
     * The first instance of a chair  that is created is assigned an id of 0 (zero); 
     * the next is assigned 1.
     * 
     */
    private int id;
	
	/**
	 * The Chair manufacturing cost .  
	 * The manufacturing cost chair is positive value 
	 * 
	 * This manufacturing cost  does not represent the 
	 * actual chair cost( or selling price). The actual chair cost will be determined based 
	 * on the type of the chair and other additional factors
	 * 
	 * 
	 * 
	 */
	private  double chairManufCost;
	
	/**
	 * The chair shape. 
	 * The chair shape can be one of the following shapes
	 * {Empty String (""), Rectangle, Round, Square, Oval}
	 * <p><strong>It should be noted that shapes
	 * 	string comparisons are  carried out with case insensitive 
	 *  For example, these strings are equals "Rectangle", "RECtangle", "RECTANGLE",...</strong> </p>
	 */
	private   String chairShape;
	
	
	/**
	 * The chair Color 
	 * The chair color can be one of the following colors 
	 *  {empty String (""), black,  blue,  brown,  gray,  green,  orange,  pink,  red,  white, yellow} 
	 * <p><strong>It should be noted that color  
	 * string comparisons are carried out with case insensitive
	 * For example, these strings are equals "black", "Black", "BLACK",...</strong> </p>
	 * 
	 */
	private    String chairColor;
	
	
	/**
	 * Initializes this chair with color and shape to an  empty string.
	 * and initialize the chair initial manufacturing cost to zero dollar.
	 * 
	 * <p><strong>Notes: The numChairs field variable is incremented each time a new chair object created </strong> </p>
	 */
	public Chair() {
		// COMPLETE THIS
		this.chairColor = "";
		this.chairShape = "";
		this.chairManufCost = 0;
		
		
	}


	
	
	
	
	/**
	 * Initializes this chair  to the specified fields 
	 * 
	 * 
	 * @param chairManufCost  the chair manufacturing  cost   
	 * @param chairShape  the chair shape 
	 * @param chairColor  the chair color
	 * 
	 * @pre.
	 * 		 <p> <strong> Precondition </strong> </p>
	 * 			<p> The chair color should be one of the following choices ,  
	 * 			<strong><code>{empty String (""), black,  blue,  brown,  gray,  green,  
	 * 			orange,  pink,  red,  white, yellow} </code></strong>,</p>
	 * <p><strong>It should be noted that colors  
	 * string comparisons are carried out with  case insensitive
	 * For example, these strings are equals "black", "Black", "BLACK",...</strong> </p>
	 * 			
	 * 			<p> 
	 * 			The chair shape should be one of the following choices
	 * 			<strong><code>{Empty String (""), Rectangle, Round, Square, Oval} </code></strong>,</p> 
	 * 			<p><strong>It should be noted that shapes
	 * 			string comparisons are carried out with  case insensitive 
	 *  		 For example, these strings are equals "Rectangle", "RECtangle", "RECTANGLE",...</strong> </p>
	 * 			<p> and, the chair manufacturing cost should be positive real number 
	 * 			 </p>
	 * 			
	 * @throws  IllegalArgumentException
	 * 			<p> if the manufacturing Cost of chair is negative value </p>
	 * 
	 * 
	 * @throws ChairColorNotValid 
	 *  		<p>if the chair color is not one of possible chair colors</p>.
	 * 			
	 * 	@throws ChairShapeNotValid 
	 * 		<p> if the chair shape is not one of the possible  chair shapes </p>
	 * 		
	 * 			
	 * 
	 * 
	 * 
	 *  
	 *  
	 */
	public Chair(double chairManufCost, String chairShape, String chairColor) {
		
		
		this.setChairColor(chairColor);
		
		this.setChairManufCost(chairManufCost);
		
		this.setChairShape(chairShape);

	}


	
	/**
     * Return the number of chairs that have been created 
     *  
     * @return numChairs The total number of Chair  created so far
     */
    public static int getNumberofChairCreated() {
    	
    	// COMPLETE THIS
    	
    	

 
    }
	
    
    /**
     * This method decrement ( reduce )  the number of chairs  that have been created by 1 
     * 
     * 
     */
    public static void decrementNumberofChairCreated() {
    	
    	// COMPLETE THIS
    	
    	
    	
 
    }
    
    /**
     * getId method
     * @return id The ID of created Chair  object
     */ 
    public final  int getId()    {
    	// COMPLETE THIS
      return this.id;
    	
    }
    
    
	
	/**
	 * This method calculate/compute the price of the chair  
	 *  
	 * @return the chair price  
	 */
	public abstract double getChairPrice();
	
	/**
	 * This method calculate/compute  the delivery cost of the chair 
	 * @return the delivery cost of the chair 
	 */
	public abstract double getDeliveryCost(String nameofCity);
	
	/**
	 * Get the  chair category
	 * The returned string contains all capital letter
	 * @return the  chair category 
	 */	
	public abstract String getChairCategory();
	
	
	/**
	 * get the number of wheels of this  chair
	 * @return the number of wheels of this  chair
	 */
	public abstract int getNumberofWheels(); 
	
	
	/**
	 * This method set chair color  
	 * @param chairColor  the chair color
	 * 
	 * @throws ChairColorNotValid 
	 *  		<p>if the chair color is not one of possible chair colors</p>.
	 */
	protected  void setChairColor (String chairColor) throws ChairColorNotValid {
		
		switch(chairColor.toLowerCase()) {
			
		case "black":
			this.chairColor = "black";
			break;
		case "blue":
			this.chairColor = "blue";
			break;
		case "brown":
			this.chairColor = "brown";
			break;
		case "gray":
			this.chairColor = "gray";
			break;
		case "green":
			this.chairColor = "green";
			break;
		case "orange":
			this.chairColor = "pink";
			break;
		case "red":
			this.chairColor = "red";
			break;
		case "white":
			this.chairColor = "white";
			break;
		case "yellow":
			this.chairColor = "yellow";
			break;
		case "":
			this.chairColor = "";
			break;
		default:
			throw new ChairColorNotValid();
		}
		
	}
	
	/**
	 * This method set chair Shape  
	 * @param chairShape  the chair shape 
	 * 
	 * @throws ChairShapeNotValid 
	 *  		<p>if the chair color is not one of possible chair colors</p>.
	 * 
	 */
	protected  void setChairShape (String chairShape) throws ChairShapeNotValid{
		
		
		String chairs= this.chairShape.substring(0, 1).toUpperCase() + this.chairShape.substring(1).toLowerCase();;
		
		switch(chairs) {
			
		case "Rectangle":
			this.chairColor = "Rectangle";
			break;
		case "Round":
			this.chairColor = "Round";
			break;
		case "Square":
			this.chairColor = "Square";
			break;
		case "Oval":
			this.chairColor = "Oval";
			break;
		case "":
			this.chairColor = "";
			break;
		default:
			throw new ChairShapeNotValid();
		}		
	}
	
	
	/**
	 * 
	 * @param chairManufCost the chair manufacturing  cost 
	 * 
	 * @throws  IllegalArgumentException
	 * 			<p> if the manufacturing Cost of chair is negative value </p>
	 * 
	 * 
	 */
	protected void setChairManufCost (double chairManufCost) {
		
		if(this.chairManufCost < 0) {
			this.chairManufCost = chairManufCost;
		} 

		
		
	}
	
	
	/**
	 * Set the chair color and shape to the given values 
	 * 
	 * @param chairColor the chair color
	 * @param chairShape   the chair shape
	 * 
	 * 
	 * @throws ChairColorNotValid 
	 *  		<p>if the chair color is not one of possible chair colors</p>.
	 * @throws ChairShapeNotValid 
	 *  		<p>if the chair color is not one of possible chair colors</p>.
	 */
	private void set (String chairColor, String chairShape) {
		
		this.setChairColor(chairColor);
		this.setChairShape(chairShape);
		// COMPLETE THIS
		
		
	}
	

	/**
	 * Get the chair initial cost 
	 * @return the chair initial cost
	 */
	public final double getChairManufCost() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		return this.chairManufCost;
	}


	/**
	 * Get the chair shape 
	 * @return the chair shape,  the String  converted to uppercase
	 */
	public final String getChairShape() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		return this.chairShape.toUpperCase();
	}

	/**
	 * Get the chair color  
	 * @return the chair color, the String  converted to uppercase
	 */
	public final String getChairColor() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		return this.chairColor.toUpperCase();
	}
	
	
	/**
	 * Get the string representation of the chair. The string is 
	 * chair Shape, chair shape, chair initial cost .  
	 * 
	 * The return string contains only  capital letters
	 * 
	 * @return the string representation of the chair
	 */
	public String toString() {
		// COMPLETE THIS
		String s = "";
		
		s +=  this.chairColor.toUpperCase() + " "
				+ this.chairShape.toUpperCase() + " "
				+ this.chairManufCost;
		
		return s;
		
		
	}
	
	
	
	  /**
     * compareTo method
     * this method compares the current object with passed object.
     * If price of current chair  less than price of passed object return -1.
     * If price of current chair  greater than price of passed object return 1.
     * 
     * If price of current chair equals price of passed object then
     * the number of wheels  of the object compared.
     * If number of wheels  of current object less than number of wheels  of passed object return -1.
     * If number of wheels  of current object greater than number of wheels  of passed object return 1. 
     * If number of wheels  of current object equals number of wheels  of passed object return 0.
     * 
     * @param other  Object of type Chair, to be compared with this Chair  object 
     * @return -1 if this  comes before other , 0 if they are equal or 1 otherwise
     */ 
    public int compareTo (Chair other ) {
    	
    	// COMPLETE THIS
    	
    	
    	
    	
    	
    	
    }





    /**
     * 
     * Generate the Hash code 
     * 
     * 
     */
	@Override
	public int hashCode() {
		
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chairColor == null) ? 0 : chairColor.hashCode());
		long temp;
		temp = Double.doubleToLongBits(chairManufCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((chairShape == null) ? 0 : chairShape.hashCode());
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chair other = (Chair) obj;
		if (chairColor == null) {
			if (other.chairColor != null)
				return false;
		} else if (!chairColor.equals(other.chairColor))
			return false;
		if (Double.doubleToLongBits(chairManufCost) != Double.doubleToLongBits(other.chairManufCost))
			return false;
		if (chairShape == null) {
			if (other.chairShape != null)
				return false;
		} else if (!chairShape.equals(other.chairShape))
			return false;
		return true;
	}
    
    
    
    
    
    
    
    
    
    
    
    






	
    
	
	
	
	
	

}
