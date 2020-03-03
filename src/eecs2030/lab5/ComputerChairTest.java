package eecs2030.lab5;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ComputerChairTest {
	
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	
	
	

	@Test
	public void test00_CtrAAfull() {
		List<Chair> objs = new ArrayList<Chair>();
		List<String> argsCategory = new ArrayList<String>();
		List<Integer> argsnumberofWheels = new ArrayList<Integer>();
		
		
		argsCategory.add("Basic");argsnumberofWheels.add(3);
		argsCategory.add("Basic");argsnumberofWheels.add(5);
		argsCategory.add("Basic");argsnumberofWheels.add(7);
		
		argsCategory.add("Normal");argsnumberofWheels.add(3);
		argsCategory.add("Normal");argsnumberofWheels.add(5);
		argsCategory.add("Normal");argsnumberofWheels.add(7);
		
		argsCategory.add("Super");argsnumberofWheels.add(3);
		argsCategory.add("Super");argsnumberofWheels.add(5);
		argsCategory.add("Super");argsnumberofWheels.add(7);
		
		assertEquals("Number of chair created is not  correct", 0,
				Chair.getNumberofChairCreated());
		
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			objs.add(new ComputerChair (120.0, "round","black",argsCategory.get(i), argsnumberofWheels.get(i)));
		}
		
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			assertEquals("The two args constructor implemented wrongly ", argsCategory.get(i).toUpperCase(),
					objs.get(i).getChairCategory());
			assertTrue("The two args constructor implemented wrongly ", Integer.compare( argsnumberofWheels.get(i),
					objs.get(i).getNumberofWheels())==0);
		}
		
		assertEquals("Number of chair created is not  correct", 9,
				Chair.getNumberofChairCreated());
		
		
			
	}
	
	
	
	
	@Test
	public void test01a_ctor() {
		
		assertEquals("Number of chair created is not  correct", 9,
				Chair.getNumberofChairCreated());
		Chair cmch=new ComputerChair();
		
		assertEquals("no arg ctor did not set this.chairColor correctly", "",
				cmch.getChairColor());
		assertEquals("no arg ctor did not set this.chairShape correctly", "",
				cmch.getChairShape());

		assertEquals("no arg ctor did not set this.getChairInitialCost correctly",Double.doubleToLongBits(0.0), 
				Double.doubleToLongBits(cmch.getChairManufCost()));
		
		
		assertEquals("no arg ctor did not set this.chairCategory correctly", "BASIC".toUpperCase(),
				cmch.getChairCategory());
		assertEquals("no arg ctor did not set this.numberofWheels correctly", 5,
				cmch.getNumberofWheels());
		assertEquals("Number of chair created is not  correct", 10,
				Chair.getNumberofChairCreated());
	}

	
	@Test
	public void test01b_ctor() {
		
		Chair cmch=new ComputerChair(120.0, "round","black","basic",5);
		
		assertEquals("no arg ctor did not set this.chairColor correctly", "black".toLowerCase(),
				cmch.getChairColor().toLowerCase());
		assertEquals("no arg ctor did not set this.chairShape correctly", "round".toLowerCase(),
				cmch.getChairShape().toLowerCase());

		assertEquals("no arg ctor did not set this.getChairInitialCost correctly",Double.doubleToLongBits(120.0), 
				Double.doubleToLongBits(cmch.getChairManufCost()));
		
		
		assertEquals("no arg ctor did not set this.chairCategory correctly", "BASIC".toLowerCase(),
				cmch.getChairCategory().toLowerCase());
		assertEquals("no arg ctor did not set this.numberofWheels correctly", 5,
				cmch.getNumberofWheels());
		
		assertEquals("Number of chair created is not  correct", 11,
				Chair.getNumberofChairCreated());
		
			
		
	}
	
	
	
	@Test(expected = ChairShapeNotValid.class)
	public void test03a_ctor() {
		Chair cmch=new ComputerChair(120.0, "Cylinder","black","basic",5);
		
	}
	
	
	@Test(expected = ChairColorNotValid.class)
	public void test03b_ctor() {
		
		Chair cmch=new ComputerChair(120.0, "round","BBblack","basic",5);
		
		
	}
	
	@Test(expected = ChairShapeNotValid.class)
	public void test03c_ctor() {
		Chair cmch=new ComputerChair(120.0, "Square","black","basic",5);
		
	}
	
	@Test(expected = ChairColorNotValid.class)
	public void test03d_ctor() {
		Chair cmch=new ComputerChair(120.0, "round","green","basic",5);
		
		
	}
	
	@Test(expected = ChairCategoryNotValid.class)
	public void test03e_ctor() {
		Chair cmch=new ComputerChair(120.0, "round","gray","BBbasic",5);
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test03f_ctor() {
		
		Chair cmch=new ComputerChair(120.0, "round","gray","basic",4);
		
		
	}
	
	
	@Test
	public void test04_0_calChairCostfull() {
		List<Chair> objs = new ArrayList<Chair>();
		List<String> argsCategory = new ArrayList<String>();
		List<Integer> argsnumberofWheels = new ArrayList<Integer>();
		List<String> argscolor = new ArrayList<String>();
		List<Double> argsPrice = new ArrayList<Double>();
		
		assertEquals("Number of chair created is not  correct", 11,
				Chair.getNumberofChairCreated());
		
		argsCategory.add("Basic");argsnumberofWheels.add(3);argscolor.add("black"); argsPrice.add(110.0);
		argsCategory.add("Basic");argsnumberofWheels.add(5);argscolor.add("gray");argsPrice.add(125.0);
		argsCategory.add("Basic");argsnumberofWheels.add(7);argscolor.add("red");argsPrice.add(120.0);
		
		argsCategory.add("Normal");argsnumberofWheels.add(3);argscolor.add(""); argsPrice.add(105.0);
		argsCategory.add("Normal");argsnumberofWheels.add(5);argscolor.add("black");argsPrice.add(120.0);
		argsCategory.add("Normal");argsnumberofWheels.add(7);argscolor.add("red");argsPrice.add(130.0);
		
		argsCategory.add("Super");argsnumberofWheels.add(3);argscolor.add("black"); argsPrice.add(125.0);
		argsCategory.add("Super");argsnumberofWheels.add(5);argscolor.add("gray");argsPrice.add(140.0);
		argsCategory.add("Super");argsnumberofWheels.add(7);argscolor.add("red");argsPrice.add(135.0);
		
		
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			objs.add(new ComputerChair (10.0, "round",argscolor.get(i),argsCategory.get(i), argsnumberofWheels.get(i)));
		}
		
		for (int i=0 ; i < argsCategory.size(); i++) {
					
			
			assertTrue("The calChairManufacturingCost  implemented wrongly ", 
					Double.compare(objs.get(i).getChairPrice(),argsPrice.get(i) ) ==0);
		}
		
		
		assertEquals("Number of chair created is not  correct", 20,
				Chair.getNumberofChairCreated());
		
	}
	
	@Test
	public void test05a_toString() {
		Chair cmch=new ComputerChair(120.0, "round","black","basic",5);
		assertEquals("toString did not return the correct string", "(round, BLACK, 120.0, basic, 5)".toUpperCase(),
				cmch.toString());
		assertEquals("Number of chair created is not  correct", 21,
				Chair.getNumberofChairCreated());
	}
	
	
	
	

	@Test
	public void test06_0_calChairDeliveryCostfull() {
		List<ComputerChair> objs = new ArrayList<ComputerChair>();
		List<String> argsCategory = new ArrayList<String>();
		List<Integer> argsnumberofWheels = new ArrayList<Integer>();
		List<String> argscolor = new ArrayList<String>();
		List<Double> argsPrice = new ArrayList<Double>();
		
		argsCategory.add("Basic");argsnumberofWheels.add(3);argscolor.add("black"); argsPrice.add(110.0);
		argsCategory.add("Basic");argsnumberofWheels.add(5);argscolor.add("gray");argsPrice.add(125.0);
		argsCategory.add("Basic");argsnumberofWheels.add(7);argscolor.add("red");argsPrice.add(120.0);
		
		argsCategory.add("Normal");argsnumberofWheels.add(3);argscolor.add(""); argsPrice.add(105.0);
		argsCategory.add("Normal");argsnumberofWheels.add(5);argscolor.add("black");argsPrice.add(120.0);
		argsCategory.add("Normal");argsnumberofWheels.add(7);argscolor.add("red");argsPrice.add(130.0);
		
		argsCategory.add("Super");argsnumberofWheels.add(3);argscolor.add("black"); argsPrice.add(125.0);
		argsCategory.add("Super");argsnumberofWheels.add(5);argscolor.add("gray");argsPrice.add(140.0);
		argsCategory.add("Super");argsnumberofWheels.add(7);argscolor.add("red");argsPrice.add(135.0);
		
		assertEquals("Number of chair created is not  correct", 21,
				Chair.getNumberofChairCreated());
		
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			objs.add(new ComputerChair (10.0, "round",argscolor.get(i),argsCategory.get(i), argsnumberofWheels.get(i)));
		}
		
		for (int i=0 ; i < argsCategory.size(); i++) {
					
			
			assertTrue("The getChairPrice  implemented wrongly ", 
					Double.compare(objs.get(i).getChairPrice(),argsPrice.get(i) ) ==0);
			
			assertTrue("The  getDeliveryCost  implemented wrongly ", 
					Double.compare(objs.get(i).getDeliveryCost("Montreal"), argsPrice.get(i)+65.0 ) ==0);
			assertTrue("The  getDeliveryCost  implemented wrongly ", 
					Double.compare(objs.get(i).getDeliveryCost("toronto"), argsPrice.get(i)+35.0 ) ==0);
			assertTrue("The  getDeliveryCost  implemented wrongly ", 
					Double.compare(objs.get(i).getDeliveryCost("ottawa"), argsPrice.get(i)+45.0 ) ==0);
			
		}
				
		
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void test07a_InvalidDeliveryCity() {
		
		Chair cmch=new ComputerChair(120.0, "round","gray","basic",3);
		cmch.getDeliveryCost("attawa");
		
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test07b_InvalidDeliveryCity() {
		
		Chair cmch=new ComputerChair(120.0, "round","gray","basic",3);
		cmch.getDeliveryCost("Montreall");
		
		
	}

}
