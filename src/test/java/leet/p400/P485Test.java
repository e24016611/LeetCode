package leet.p400;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P485Test {

	int[] input ;
	int output;
	P485 p485 = new P485();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		input = new int[] {1,1,0,1,1,1};
		output = 3;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int result = p485.findMaxConsecutiveOnes(input);
		assertEquals(output,result);
	}

}
