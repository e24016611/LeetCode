package leet.p200;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class P283Test {
	
	int[] input;
	int[] output;
	
	P283 p283 = new P283();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		input = new int[] {0, 1, 0, 3, 12};
		output = new int[] {1, 3, 12, 0, 0};
	}

	@AfterEach
	void tearDown() throws Exception {

	}

	@Test
	void test() {
	    int[] result = p283.moveZeroes(input);
	    assertArrayEquals(output,result);
	}

}
