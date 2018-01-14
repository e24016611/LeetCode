package leet.p700;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class P747Test {

	int[] input ,input1;
	int output ,output1;
	P747 p747 = new P747();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		input = new int[] {3, 6, 1, 0};
		output = 1;
		
		input1 = new int[] {1, 2, 3, 4};
		output1 = -1;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int result = p747.dominantIndex(input);
		assertEquals(output ,result);
		
		result = p747.dominantIndex(input1);
		assertEquals(output1 ,result);
	}

}
