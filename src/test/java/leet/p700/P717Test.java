package leet.p700;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P717Test {

	int[] input = new int[]{1, 1, 0} ,input1 = new int[]{1, 1, 1, 0};
	P717 p717 = new P717();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		boolean result = p717.isOneBitCharacter(input1);
		assertEquals(result ,false);
		result = p717.isOneBitCharacter(input);
		assertEquals(result ,true);
	}

}
