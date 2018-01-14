package leet.p700;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class P762Test {

	int L1 = 6 ,R1 = 10 ,L2 = 10 ,R2 = 15;
	int output = 4 ,output1 = 5;
	P762 p762 = new P762();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int result = p762.countPrimeSetBits(L1, R1);
		assertEquals(output ,result);
		
		result = p762.countPrimeSetBits(L2, R2);
		assertEquals(output1 ,result);
	}

}
