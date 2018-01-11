package leet.p200;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class P217Test {
	
	int[] input ,input1;
	boolean output ,output1;
	
	P217 p217 = new P217();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		input = new int[] {1,2,3,4,5,6,7};
		input1 = new int[] {1,2,4,4,5,6,7};
		
		output = false;
		output1 = true;
	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	void test() {
		boolean result = p217.containsDuplicate(input);
		assertEquals(output ,result);
		result = p217.containsDuplicate(input1);
		assertEquals(output1 ,result);
	}

}
