package leet.p600;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class P697Test {

	int[] input ,input1;
	int output ,output1;
	P697 p697 = new P697();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		input = new int[] {1, 2, 2, 3, 1};
		input1 = new int[] {1,2,2,3,1,4,2};
		
		output = 2;
		output1 = 6;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int result = p697.findShortestSubArray(input);
		assertEquals(output ,result);
		result = p697.findShortestSubArray(input1);
		assertEquals(output1 ,result);
	}

}
