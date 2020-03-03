package eecs2030.lab5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * <p> The Computer Chair class </p>
 * 
 *<p> The chair color for <strong> <code>Computer Chair</code></strong>  
 * should be one of the following choices <code>empty String (""), black, red, or gray</code>.  </p> 
 * 	<p>The default value for color  is <strong> <code>empty String ("")</code></strong> </p>
 * <p> The computer chair shape has only two shapes which is <strong> <code>empty String (""),Round</code></strong></p>
 *<p>The default value for shape  is <strong> <code>empty String ("")</code></strong> </p>
 *<p> <strong> Any computer chair has initial manufacturing cost equal to positive 
 *real number, with default value equal to 0.0$ </strong></p>
 *
 *
 * <p> <strong> NOTE: In this class,  all string comparisons are carried out with case insensitive </strong> </p> 
 */


public class ComputerChair extends Chair {
	
	
	/**
	 * The computer chair category  can be one of the following choices 
	 * 	<strong><code>Basic</code> , <code>Normal</code> or <code>Super</code></strong>
	 * 	<p>The default value is <strong> <code>Basic</code></strong> </p> 
	 *  	
	 * 
	 */
	private String chairCategory;
	
	/**
	 * this field store the number of wheels for this computer chair.
	 * The number of wheel can be any  odd integer value between 3 and 7. i.e., 
	 * can be one of the  following choices 3, 5, or 7.
	 * <p> <strong>The  default value is 5</strong></p>
	 */
	private int numberofWheels; 

	
	
	
		

	/**
	 * the default constructor 
	 * 
	 */
	public ComputerChair() {
		this.chairCategory = "";
		this.numberofWheels = 0;

		// COMPLETE THIS
		
		
		
	}





	/**
	 * Custom constructor to initialize fields of this computer chair 
	 * 
	 * 
	 * @param chairManufCost : the manufacturing cost of this manufacturing
	 * @param chairShape : the shape of this computer chair
	 * @param chairColor : the color of this computer chair 
	 * @param chairCategory : The  category of this computer chair
	 * @param numberofWheels : the number of wheels for this computer chair
	 * 
	 * 
	 * @throws  IllegalArgumentException
	 * 			<p> if the manufacturing Cost of this computer chair is negative  </p>
	 * 			or 
	 * 			<p>if the number of wheel of this computer chair  is not an odd integer value between 3 and 7.
	 * 
	 * @throws ChairColorNotValid 
	 *  		<p>if the chair color is not one of possible computer chair colors</p>.
	 * 			
	 * 	@throws ChairShapeNotValid 
	 * 		<p> if the chair shape is not one of the possible  computer chair shapes </p>
	 * 
	 *  @throws  ChairCategoryNotValid
	 * 
	 *  		<p>if the chair category is not one of the following choices 
	 * 			<strong><code>Basic</code> , <code>Normal</code> or <code>Super</code></strong></p>.
	 * 			
	 * 		
	 */
	public ComputerChair(double chairManufCost, String chairShape, String chairColor,
			String chairCategory, int numberofWheels ) {
		

		// COMPLETE THIS
		
		
		
		
		
	}
	
	
	/**
	 * 
	 * 
	 * 
	 * This method compute the computer chair price  for this computer chair object.
	 * The manufacturing cost  depends on the computer chair  chairCategory  field value and
	 * the color chair 
	 *  
	 * <p> The <strong><em> computer chair price  cost</em></strong> 
	 * can be computed   using the following rules: </p>
	 * 
	 * 		<p>If the category  of chair is <strong>Basic </strong>then the price is (manufacturing cost+ <strong>85$</strong>).</p>
	 * 		<p>If the category of chair is <strong>Normal </strong>then the price is (manufacturing cost+ <strong>95$</strong>).</p>
	 *      <p>If the category of chair is <strong>Super </strong>then the price is (manufacturing cost+ <strong>100$</strong>).</p>
	 * 
	 * Also, 
	 * 		<p> If the color of chair is <strong>"" </strong>then  add  <strong>0$</strong>) to the chair price.</p>
	 * 		<p> If the color of chair is <strong>black </strong>then  add  <strong>15$</strong>) to the chair price.</p>
	 * 		<p>If the color of chair is <strong>red </strong>then add <strong>25$</strong>) to the chair price.</p>
	 * 		<p>If the color of chair is <strong>gray </strong>then add <strong>30$</strong>) to the chair price.</p>
	 * 
	 * 
	 * @return The  computer chair price for this computer chair  object
	 */
	

	@Override
	public double getChairPrice() {

		// COMPLETE THIS
		
		
	}

	
	
	
	/**
	 * 
	 * 
	 * 
	 * This method compute the delivery cost for this computer chair object 
	 * given the city of delivery as input argument 
	 * 
	 * <p> The computer chair can be sent out for delivery to 
	 *  three different cities. The cities are <strong>Toronto, Ottawa</strong> 
	 * and <strong>Montreal</strong>.</p>
	 * <p>The cost of delivery can be computed using these rules: </p>
	 * 
	 * <p> If the delivery city is <strong> Toronto </strong> then
	 *  the delivery cost is equal to 
	 *  <strong><code> (the computer chair price )+ (35$)</code> </strong>.</p>
	 *  
	 *  <p>If the delivery city is <strong> Ottawa </strong>then 
	 *  the delivery cost is equal to 
	 *  <strong><code> (the computer chair price )+ (45$)</code> </strong>.</p>
	 *  
	 *  <p>If the delivery city is <strong> Montreal </strong> then 
	 *  the delivery cost is equal to  
	 *  <strong><code> (the computer chair price )+ (65$)</code> </strong>.</p>
	 * 
	 * 
	 * @param nameofCity  name of delivery city 
	 * 
	 * @return The delivery cost for the given delivery  city 
	 * 
	 * @pre.
	 * 		 <p> <strong> Precondition </strong> </p>
	 * 		 <p> The given delivery city (input city)  should be one of the following cities 
	 * 		 <strong> Toronto, Ottawa</strong> and <strong>Montreal</strong>.</p>
	 * 
	 * @throws  IllegalArgumentException
	 *  	<p> If the given delivery city (input city)  was not one of the following cities
	 *  	<strong> Toronto, Ottawa</strong> and <strong> Montreal</strong>.</p>
	 */
	
	@Override
	public double getDeliveryCost(String nameofCity) {
		

		// COMPLETE THIS
		
		
		
	}

	
	

	/**
	 * 
	 * 
	 * check the number of wheel of this computer chair, 
	 * the number of wheel of this computer chair can be  any  odd integer value between 3 and 7. i.e., 
	 * can be one of the  following choices 3, 5, or 7.
	 * 
	 * 
	 * @param numberofWheels  the number of wheel of this computer chair 
	 *
	 * 
	 *  @pre.
	 * 		 <p> <strong> Precondition </strong> </p>
	 * 			<p> the number of wheel of this computer chair should be any  odd integer value between 3 and 7. i.e., 
	 * can be one of the  following choices 3, 5, or 7.
	 * 			
	 * @throws  IllegalArgumentException
	 * 
	 *  		<p>if the number of wheel of this computer chair  is not an odd integer value between 3 and 7.
	 *  	    
	 */
	
	private void checkChairNumberofWheels (int  numberofWheels) throws IllegalArgumentException {
		
		
		// COMPLETE THIS
		
		
		
			
		
	}


	
	
	/**
	 * 
	 * 
	 * check the computer chair category, 
	 * the computer chair category  can be one of the following choices 
	 * 	<strong><code>Basic</code> , <code>Normal</code> or <code>Super</code></strong>
	 *
	 * @param chairCategory  Is one of the chair category choices  
	 *
	 * 
	 *  @pre.
	 * 		 <p> <strong> Precondition </strong> </p>
	 * 			<p> The chair category should be one of the following choices 
	 * 			<strong><code>Basic</code> , <code>Normal</code> or <code>Super</code></strong></p>
	 * 			
	 * 			
	 * @throws  ChairCategoryNotValid
	 * 
	 *  		<p>if the chair category is not one of the following choices 
	 * 			<strong><code>Basic</code> , <code>Normal</code> or <code>Super</code></strong></p>.
	 * 			    
	 */
	
	private void checkChairCategory (String chairCategory) throws ChairCategoryNotValid {

		// COMPLETE THIS
		
		
	
		
		
		
	}





	/**
	 * Get the computer chair category
	 * The returned string contains all capital letter
	 * @return the computer chair category 
	 */
	public  String getChairCategory() {
		// COMPLETE THIS
		
	}





	/**
	 * get the number of wheels of this computer chair
	 * @return the number of wheels of this computer chair
	 */
	public  int getNumberofWheels() {
		// COMPLETE THIS
		
		
	}




	/**
	 * Get the string representation of the computer chair. The string is 
	 * (chair Shape, chair shape, chair initial cost , chair category, number of wheels).  
	 * 
	 * The return string contains only  capital letters
	 * 
	 * @return the string representation of the computer chair
	 */
	

	@Override
	public String toString() {
		// COMPLETE THIS
		
		
	}





	
	/**
	 * Generate Hashcode of this computer chair 
	 */
	@Override
	public int hashCode() {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((chairCategory == null) ? 0 : chairCategory.hashCode());
		result = prime * result + numberofWheels;
		return result;
	}




	/**
	 * 
	 * Equals method for computer chair 
	 */

	@Override
	public boolean equals(Object obj) {
		// ALREADY IMPLEMENTED; DO NOT MODIFY
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComputerChair other = (ComputerChair) obj;
		if (chairCategory == null) {
			if (other.chairCategory != null)
				return false;
		} else if (!chairCategory.equals(other.chairCategory))
			return false;
		if (numberofWheels != other.numberofWheels)
			return false;
		return true;
	}

	
	
	
	
	
	
}
