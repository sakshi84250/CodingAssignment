package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void testCase1() {
		Assignment test = new Assignment();
		int output = test.details1("init 12");
		assertEquals(12, output);
	}}
	
	