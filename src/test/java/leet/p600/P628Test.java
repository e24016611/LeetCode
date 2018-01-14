package leet.p600;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import leet.p600.P628;

class P628Test {
	
	int[] input ,input1;
	int output ,output1;

	P628 p628 = new P628();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {

		input = new int[] {100, 50, 125, 150, 110 ,160};
		output = 160*150*125;
		
		input1 = new int[] {1,2,3,4};
		output1 = 24;
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		int result = p628.maximumProduct(input);
		assertEquals(output ,result);
		int result1 = p628.maximumProduct(input1);
		assertEquals(output1 ,result1);
		
	}

}
