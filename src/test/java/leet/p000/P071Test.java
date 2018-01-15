package leet.p000;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P071Test {

	int input ,input1 ,output ,output1;
	P071 p071 ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
		input = 2;
		output = 2;
		
		input1 = 3;
		output1 = 3;
		
		p071 = new P071();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int result = p071.climbStairs(input);
		assertEquals(output ,result);
		result = p071.climbStairs(input1);
		assertEquals(output1 ,result);
	}

}
