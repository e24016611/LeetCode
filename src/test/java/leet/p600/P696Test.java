package leet.p600;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P696Test {
	
	String input ,input1;
	int output ,output1;
	P696 p696 ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		p696 = new P696();
		input = "1010001";
		output = 4;
		
		input1 = "10101";
		output1 = 4;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int result = p696.countBinarySubstrings(input);
		assertEquals(output ,result);
		result = p696.countBinarySubstrings(input1);
		assertEquals(output1 ,result);
	}

}
