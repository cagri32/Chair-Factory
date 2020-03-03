package eecs2030.lab5;
import static org.junit.Assert.*;

import java.util.SortedSet;
import java.util.TreeSet;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class ChairTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	private static class SimpleChair extends Chair {
		private String chairType;
		
		SimpleChair() {
			super();
			this.chairType = "Simple";
		}
		

		public SimpleChair(double chairPrice, String chairShape, String chairColor) {
			super(chairPrice, chairShape, chairColor);
			this.chairType = "Simple";
		}


		@Override
		public double getChairPrice() {
			
			return 0;
		}


		@Override
		public double getDeliveryCost(String nameofCity) {
			
			return 0;
		}


		@Override
		public int compareTo(Chair o) {
			// TODO Auto-generated method stub
			return 0;
		}


		@Override
		public String getChairCategory() {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public int getNumberofWheels() {
			// TODO Auto-generated method stub
			return 0;
		}




	}
	
	
	
	@Test
	public void test01_noArgCtor() {
		Chair ch = new SimpleChair();
		assertEquals("no arg ctor did not set this.chairColor correctly", "",
						ch.getChairColor());
		assertEquals("no arg ctor did not set this.chairShape correctly", "",
				ch.getChairShape());
		
		assertEquals("no arg ctor did not set this.getChairInitialCost correctly",Double.doubleToLongBits(0.0), 
				Double.doubleToLongBits(ch.getChairManufCost()));
	}
	
	
	@Test
	public void test02a_ctor() {
		Chair ch = new SimpleChair(1.2,"Round", "black" );
		assertEquals("no arg ctor did not set this.chairColor correctly", "black".toUpperCase(),
				ch.getChairColor().toUpperCase());
		assertEquals("no arg ctor did not set this.chairShape correctly", "round".toUpperCase(),
				ch.getChairShape().toUpperCase());

		assertEquals("no arg ctor did not set this.getChairInitialCost correctly",Double.doubleToLongBits(1.2), 
				Double.doubleToLongBits(ch.getChairManufCost()));
	}
	
	
	@Test
	public void test02b_ctor() {
		
		
		
		Chair ch = new SimpleChair(120,"RECtangle", "black" );
		assertEquals("no arg ctor did not set this.chairColor correctly", "black".toUpperCase(),
				ch.getChairColor().toUpperCase());
		assertEquals("no arg ctor did not set this.chairShape correctly", "Rectangle".toUpperCase(),
				ch.getChairShape().toUpperCase());

		assertEquals("no arg ctor did not set this.chairInitialcost correctly",Double.doubleToLongBits(120), 
				Double.doubleToLongBits(ch.getChairManufCost()));
	}
	
	
	@Test(expected = ChairShapeNotValid.class)
	public void test03a_ctor() {
		Chair ch = new SimpleChair(120,"Cylinder", "black" );
		
	}
	
	@Test(expected = ChairColorNotValid.class)
	public void test03b_ctor() {
		Chair ch = new SimpleChair(120,"", "bbblack" );
		
	}
	
	@Test
	public void test05a_toString() {
		Chair ch = new SimpleChair(120,"Rectangle", "black" );
		assertEquals("toString did not return the correct string", "RECTANGLE, BLACK, 120.0".toUpperCase(),
						ch.toString());
	}
	
	

}
