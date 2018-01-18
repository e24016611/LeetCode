package leet.p100;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P121Test {

	int[] input ,input1;
	int output ,output1;
	
	P121 p121 ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
		p121 = new P121();
		input = new int[]{  7, 1, 5, 3, 6, 4};
		output = 5;
		
		input1 = new int[]{7, 6, 4, 3, 1};
		output1 = 0;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int result = p121.maxProfit(input);
		assertEquals(output ,result);
		
		result = p121.maxProfit(input1);
		assertEquals(output1 ,result);
	}

}
