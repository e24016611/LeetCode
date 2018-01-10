package leet.p400;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P448Test {
	
	int[] input ;
	List<Integer> output;
	P448 p448 = new P448();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		input = new int[]{5,4,6,7,9,3,10,9,5,6};
		output = new ArrayList<Integer>();
		output.add(1);
		output.add(2);
		output.add(8);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<Integer> result = p448.findDisappearedNumbers(input);
		assertEquals(output,result);
	}

}
