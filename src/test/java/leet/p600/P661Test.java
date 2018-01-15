package leet.p600;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P661Test {
	
	int[][] input ,output; 
	P661 p661 = new P661();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	    
		input = new int[][]{
				 {1,1,1},
				 {1,0,1},
				 {1,1,1}};
		output = new int[][]{
				 {0,0,0},
				 {0,0,0},
				 {0,0,0}};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[][] result = p661.imageSmoother(input);
		assertArrayEquals(output ,result);
	}

}
