package leet.p600;

import static org.junit.Assert.*;
import leet.p400.P485;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P695Test {
	
	int[][] input ;
	int output;
	P695 p695 = new P695();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		input = new int[][]{
		    {0,0,1,0,0,0,0,1,0,0,0,0,0},
		    {0,0,0,0,0,0,0,1,1,1,0,0,0},
		    {0,1,1,0,1,0,0,0,0,0,0,0,0},
		    {0,1,0,0,1,1,0,0,1,0,1,0,0},
		    {0,1,0,0,1,1,0,0,1,1,1,0,0},
		    {0,0,0,0,0,0,0,0,0,0,1,0,0},
		    {0,0,0,0,0,0,0,1,1,1,0,0,0},
		    {0,0,0,0,0,0,0,1,1,0,0,0,0}};
		
		output = 6 ;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int result = p695.maxAreaOfIsland(input);
		assertEquals(output ,result);
	}

}
