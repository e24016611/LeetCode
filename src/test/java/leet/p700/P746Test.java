package leet.p700;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class P746Test {

	int[] input ,input1;
	int output ,output1;
	P746 p746 = new P746();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		input = new int[] {0 , 1, 2, 2};
		output = 2;
		
		input1 = new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		output1 = 6;
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
	    int result = p746.minCostClimbingStairs(input);
	    assertEquals(output ,result);
	    result = p746.minCostClimbingStairs(input1);
	    assertEquals(output1 ,result);
	}

}
