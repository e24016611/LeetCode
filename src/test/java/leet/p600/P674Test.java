package leet.p600;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P674Test {

	int[] input ,input1;
	int output ,output1;
	P674 p674 ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		input = new int[]{1,3,5,4,7};
		output = 3;
		
		input1 = new int[]{2,2,2,2,2};
		output1 = 1;
		
		p674 = new P674();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int result = p674.findLengthOfLCIS(input);
		assertEquals(output ,result);
		
		result = p674.findLengthOfLCIS(input1);
		assertEquals(output1 ,result);
	}

}
