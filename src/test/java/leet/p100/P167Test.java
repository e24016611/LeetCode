package leet.p100;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class P167Test {

	int[] input,output;
	int target;
	
    int search ,index;
    
	
	P167 p167 = new P167();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		input = new int[] {5 ,25 ,75};
		output = new int[] {2,3};
		target = 100;
		search = 7;
		index = 2;
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
//	@Test
//	void binarySearchTest() {
//		int result = p167.binarySearch(input, search);
//		assertEquals(index,result);
//	}

	@Test
	void test() {
		int[] result = p167.twoSum(input, target);
		assertArrayEquals(output, result);
	}
	

}
