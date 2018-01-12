package leet.p100;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P169Test {

	int[] input ,input1 ;
	int output ,output1;
	
	P169 p169 = new P169();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
		input = new int[]{-1,-1,2147483647};
		input1 = new int[]{1,2,2,3,4,2,2,2,2};
	
		output = -1;
		output1 = 2;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int result = p169.majorityElement(input);
		assertEquals(output ,result);
		result = p169.majorityElement(input1);
		assertEquals(output1 ,result);
	}

}
