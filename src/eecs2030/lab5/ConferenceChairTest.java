package eecs2030.lab5;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ConferenceChairTest {
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	
	

	@Test
	public void test00_CtrAAfull() {
		List<Chair> objs = new ArrayList<Chair>();
		List<String> argsCategory = new ArrayList<String>();
		List<Integer> argsnumberofWheels = new ArrayList<Integer>();
		
		
		argsCategory.add("Basic");argsnumberofWheels.add(4);
		argsCategory.add("Basic");argsnumberofWheels.add(6);
		argsCategory.add("Basic");argsnumberofWheels.add(8);
		
		argsCategory.add("Normal");argsnumberofWheels.add(4);
		argsCategory.add("Normal");argsnumberofWheels.add(6);
		argsCategory.add("Normal");argsnumberofWheels.add(8);
		
		argsCategory.add("Delux");argsnumberofWheels.add(4);
		argsCategory.add("Delux");argsnumberofWheels.add(6);
		argsCategory.add("Delux");argsnumberofWheels.add(8);
		
		assertEquals("Number of chair created is not  correct", 0,
				Chair.getNumberofChairCreated());
		
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			objs.add(new ConferenceChair (15.0, "rectangle","blue",argsCategory.get(i), argsnumberofWheels.get(i)));
		}
		
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			assertEquals("The args constructor implemented wrongly ", argsCategory.get(i).toUpperCase(),
					objs.get(i).getChairCategory());
			assertTrue("The  args constructor implemented wrongly ", Integer.compare( argsnumberofWheels.get(i),
					objs.get(i).getNumberofWheels())==0);
		}
		
		assertEquals("Number of chair created is not  correct", 9,
				Chair.getNumberofChairCreated());
			
	}
	
	
	
	
	
	
	@Test
	public void test01a_ctor() {
		Chair cmch=new ConferenceChair();
		
		
		assertEquals("no arg ctor did not set this.chairColor correctly", "blue".toUpperCase(),
				cmch.getChairColor());
		assertEquals("no arg ctor did not set this.chairShape correctly", "Oval".toUpperCase(),
				cmch.getChairShape());

		assertEquals("no arg ctor did not set this.getChairInitialCost correctly",Double.doubleToLongBits(15.0), 
				Double.doubleToLongBits(cmch.getChairManufCost()));
		
		
		assertEquals("no arg ctor did not set this.chairCategory correctly", "BASIC".toUpperCase(),
				cmch.getChairCategory());
		assertEquals("no arg ctor did not set this.numberofWheels correctly", 4,
				cmch.getNumberofWheels());
		assertEquals("Number of chair created is not  correct", 10,
				Chair.getNumberofChairCreated());
		
	}

	
	
	@Test
	public void test01b_ctor() {
		Chair cmch=new ConferenceChair(15.0, "oval","green","basic",4);
		
		assertEquals("no arg ctor did not set this.chairColor correctly", "green".toLowerCase(),
				cmch.getChairColor().toLowerCase());
		assertEquals("no arg ctor did not set this.chairShape correctly", "oval".toLowerCase(),
				cmch.getChairShape().toLowerCase());

		assertEquals("no arg ctor did not set this.getChairInitialCost correctly",Double.doubleToLongBits(15.0), 
				Double.doubleToLongBits(cmch.getChairManufCost()));
		
		
		assertEquals("no arg ctor did not set this.chairCategory correctly", "BASIC".toLowerCase(),
				cmch.getChairCategory().toLowerCase());
		assertEquals("no arg ctor did not set this.numberofWheels correctly", 4,
				cmch.getNumberofWheels());
		assertEquals("Number of chair created is not  correct", 11,
				Chair.getNumberofChairCreated());
		
	}
	
	
	
	@Test(expected = ChairShapeNotValid.class)
	public void test03a_ctor() {
		Chair cmch=new ConferenceChair(15.0, "Cylinder","blue","basic",4);
		
	}
	
	
	@Test(expected = ChairColorNotValid.class)
	public void test03b_ctor() {
		Chair cmch=new ConferenceChair(15.0, "oval","BBblack","basic",6);
		
		
	}
	
	@Test(expected = ChairShapeNotValid.class)
	public void test03c_ctor() {
		Chair cmch=new ConferenceChair(15.0, "Square","green","basic",8);
		
	}
	
	@Test(expected = ChairColorNotValid.class)
	public void test03d_ctor() {
		Chair cmch=new ConferenceChair(15.0, "oval","red","basic",4);
		
		
	}
	
	@Test(expected = ChairCategoryNotValid.class)
	public void test03e_ctor() {
		Chair cmch=new ConferenceChair(15.0, "oval","blue","BBbasic",4);
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test03f_ctor() {
		Chair cmch=new ConferenceChair(15.0, "rectangle","green","basic",5);
		
		
	}
	
	
	@Test
	public void test04_0_calChairCostfull() {
		List<Chair> objs = new ArrayList<Chair>();
		List<String> argsCategory = new ArrayList<String>();
		List<Integer> argsnumberofWheels = new ArrayList<Integer>();
		List<String> argscolor = new ArrayList<String>();
		List<Double> argsPrice = new ArrayList<Double>();
		
		argsCategory.add("Basic");argsnumberofWheels.add(4);argscolor.add("blue"); argsPrice.add(80.0);
		argsCategory.add("Basic");argsnumberofWheels.add(6);argscolor.add("brown");argsPrice.add(90.0);
		argsCategory.add("Basic");argsnumberofWheels.add(8);argscolor.add("green");argsPrice.add(95.0);
		
		argsCategory.add("Normal");argsnumberofWheels.add(4);argscolor.add("blue"); argsPrice.add(100.0);
		argsCategory.add("Normal");argsnumberofWheels.add(6);argscolor.add("brown");argsPrice.add(110.0);
		argsCategory.add("Normal");argsnumberofWheels.add(8);argscolor.add("green");argsPrice.add(115.0);
		
		argsCategory.add("delux");argsnumberofWheels.add(4);argscolor.add("blue"); argsPrice.add(115.0);
		argsCategory.add("delux");argsnumberofWheels.add(6);argscolor.add("brown");argsPrice.add(125.0);
		argsCategory.add("delux");argsnumberofWheels.add(8);argscolor.add("green");argsPrice.add(130.0);
		
		assertEquals("Number of chair created is not  correct", 11,
				Chair.getNumberofChairCreated());
		
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			objs.add(new ConferenceChair (15.0, "oval",argscolor.get(i),argsCategory.get(i), argsnumberofWheels.get(i)));
		}
		
		for (int i=0 ; i < argsCategory.size(); i++) {
					
			
			assertTrue("The getChairPrice  implemented wrongly ", 
					Double.compare(objs.get(i).getChairPrice(),argsPrice.get(i) ) ==0);
		}
		
		
		
		
	}
	
	
	
	
	@Test
	public void test05a_toString() {
		Chair cmch=new ConferenceChair(15.0, "oval","brown","basic",8);
		assertEquals("toString did not return the correct string", "(oval, brown, 15.0, basic, 8)".toUpperCase(),
				cmch.toString());
	}
	


	@Test
	public void test06_0_calChairDeliveryCostfull() {
		List<Chair> objs = new ArrayList<Chair>();
		List<String> argsCategory = new ArrayList<String>();
		List<Integer> argsnumberofWheels = new ArrayList<Integer>();
		List<String> argscolor = new ArrayList<String>();
		List<Double> argsPrice = new ArrayList<Double>();
		
		argsCategory.add("Basic");argsnumberofWheels.add(4);argscolor.add("blue"); argsPrice.add(80.0);
		argsCategory.add("Basic");argsnumberofWheels.add(6);argscolor.add("brown");argsPrice.add(90.0);
		argsCategory.add("Basic");argsnumberofWheels.add(8);argscolor.add("green");argsPrice.add(95.0);
		
		argsCategory.add("Normal");argsnumberofWheels.add(4);argscolor.add("blue"); argsPrice.add(100.0);
		argsCategory.add("Normal");argsnumberofWheels.add(6);argscolor.add("brown");argsPrice.add(110.0);
		argsCategory.add("Normal");argsnumberofWheels.add(8);argscolor.add("green");argsPrice.add(115.0);
		
		argsCategory.add("delux");argsnumberofWheels.add(4);argscolor.add("blue"); argsPrice.add(115.0);
		argsCategory.add("delux");argsnumberofWheels.add(6);argscolor.add("brown");argsPrice.add(125.0);
		argsCategory.add("delux");argsnumberofWheels.add(8);argscolor.add("green");argsPrice.add(130.0);
		
		
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			objs.add(new ConferenceChair (15.0, "oval",argscolor.get(i),argsCategory.get(i), argsnumberofWheels.get(i)));
		}
		
		for (int i=0 ; i < argsCategory.size(); i++) {
					
			
			assertTrue("The getChairPrice  implemented wrongly ", 
					Double.compare(objs.get(i).getChairPrice(),argsPrice.get(i) ) ==0);
			
			assertTrue("The  getDeliveryCost  implemented wrongly ", 
					Double.compare(objs.get(i).getDeliveryCost("Edmonton"), argsPrice.get(i)+55.0 ) ==0);
			assertTrue("The  getDeliveryCost  implemented wrongly ", 
					Double.compare(objs.get(i).getDeliveryCost("Winnipeg"), argsPrice.get(i)+65.0 ) ==0);
			assertTrue("The  getDeliveryCost  implemented wrongly ", 
					Double.compare(objs.get(i).getDeliveryCost("Halifax"), argsPrice.get(i)+85.0 ) ==0);
			
		}
				
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void test07a_InvalidDeliveryCity() {
		
		Chair cmch=new ConferenceChair(15.0, "oval","brown","basic",8);
		cmch.getDeliveryCost("Helifax");
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test07b_InvalidDeliveryCity() {
		
		Chair cmch=new ConferenceChair(15.0, "rectangle","green","basic",4);
		cmch.getDeliveryCost("Winnipig");
		
		
	}
	

}
