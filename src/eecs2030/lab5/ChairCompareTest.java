package eecs2030.lab5;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;



import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ChairCompareTest {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	

	
	public static List<Chair> sorted_test1(){
		List <Chair> objs  =  new ArrayList<Chair>();
		objs.add( new ComputerChair (120.0, "round","black","basic",3));
		objs.add( new ComputerChair (120.0, "round","black","basic",5));
		return objs;
		
	}
	
	
	@Test
	public void test00_CompareTOComputerChair() {
		
		List <Chair> objs  =  new ArrayList<Chair>();
		objs.add( new ComputerChair (120.0, "round","black","basic",3));
		objs.add( new ComputerChair (120.0, "round","black","basic",5));
		
		Collections.sort(objs);
		
		assertEquals("compareTO  did not correctly",
				ChairCompareTest.sorted_test1(), objs);
		
		
	}
	
	public static  List<Chair> sorted_test2 (){
		List<Chair> objs = new ArrayList<Chair>();
		List<String> argsCategory = new ArrayList<String>();
		List<Integer> argsnumberofWheels = new ArrayList<Integer>();
		List<String> argscolor = new ArrayList<String>();
		List<Double> argsPrice = new ArrayList<Double>();
		argsCategory.add("Normal");argsnumberofWheels.add(3);argscolor.add(""); argsPrice.add(105.0);
		
		argsCategory.add("Basic");argsnumberofWheels.add(3);argscolor.add("black"); argsPrice.add(110.0);
		
		
		argsCategory.add("Normal");argsnumberofWheels.add(5);argscolor.add("black");argsPrice.add(120.0);
		argsCategory.add("Basic");argsnumberofWheels.add(7);argscolor.add("red");argsPrice.add(120.0);
		
		argsCategory.add("Super");argsnumberofWheels.add(3);argscolor.add("black"); argsPrice.add(125.0);
		argsCategory.add("Basic");argsnumberofWheels.add(5);argscolor.add("gray");argsPrice.add(125.0);
		
		
		
		argsCategory.add("Normal");argsnumberofWheels.add(7);argscolor.add("red");argsPrice.add(130.0);
		
		argsCategory.add("Super");argsnumberofWheels.add(7);argscolor.add("red");argsPrice.add(135.0);
		argsCategory.add("Super");argsnumberofWheels.add(5);argscolor.add("gray");argsPrice.add(140.0);
		
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			objs.add(new ComputerChair (120.0, "round",argscolor.get(i),argsCategory.get(i), argsnumberofWheels.get(i)));
		}
		
		return objs;
		
	
}


	@Test
	public void test01_CompareTOComputerChair() {
		List<Chair> objs = new ArrayList<Chair>();
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
		
		
			
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			objs.add(new ComputerChair (120.0, "round",argscolor.get(i),argsCategory.get(i), argsnumberofWheels.get(i)));
		}
		
		Collections.sort(objs); 
		
		assertEquals("compareTO  did not correctly",
				ChairCompareTest.sorted_test2(), objs);
		
		
		
			
	}
	
	
	public static  List<Chair> sorted_test3 (){
		
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
		argsCategory.add("delux");argsnumberofWheels.add(4);argscolor.add("blue"); argsPrice.add(115.0);
		
		argsCategory.add("Normal");argsnumberofWheels.add(8);argscolor.add("green");argsPrice.add(115.0);
		
		
		
		argsCategory.add("delux");argsnumberofWheels.add(6);argscolor.add("brown");argsPrice.add(125.0);
		argsCategory.add("delux");argsnumberofWheels.add(8);argscolor.add("green");argsPrice.add(130.0);
		
		
		
		for (int i=0 ; i < argsCategory.size(); i++) {
			
			objs.add(new ConferenceChair (15.0, "oval",argscolor.get(i),argsCategory.get(i), argsnumberofWheels.get(i)));
		}
		
		return objs;
		
	}
	
	@Test
	public void test02_CompareTOConferenceChair() {
		
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
		Collections.sort(objs); 
		
		assertEquals(" compareTO  did not correctly ",
				ChairCompareTest.sorted_test3(), objs);
		
	}
	
		

}
