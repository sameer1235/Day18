package junit5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssertionDemo {
	@Test
	public void simple(){
		int A = 1;
		int B = 1;
		assertEquals(A, B);
	}
		@Test
	public void simple1(){
		String A = "Sameer";
		String B = "Ameer";
		assertEquals(A, B);
	}
		@Test
	public void simple3(){
		int A = 1;
		int B = 3;
		assertEquals(A, B);
	}

}
