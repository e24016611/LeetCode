package leet.p500;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class P566Test {
	
	int[][] input,input1 ;
	int[][] output,output1 ;
	int c,r,c1,r1;
	P566 p566 = new P566();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		input = new int[][] {{1,2}
		                    ,{3,4}};
		output = new int[][] {{1,2,3,4}};
		c = 4;
		r = 1;
		input1 = new int[][] {{1,2}
                           ,{3,4}};
        output1 = new int[][] {{1,2}
                           ,{3,4}};
        c1 = 4;
        r1 = 2;		
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		int[][] result;
		result = p566.matrixReshape(input, r, c);
		assertArrayEquals(output,result);
		result = p566.matrixReshape(input1, r1, c1);
		assertArrayEquals(output1,result);
	}

}
