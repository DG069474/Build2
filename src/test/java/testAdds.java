

import org.junit.Test;

import static org.junit.Assert.*;

public class testAdds {
	@Test
	public void testAdd1Plus1() {
		int answer = 2;
		
		AddsNum add = new AddsNum();
		assertEquals(answer, add.adds(1,1));
	}
	
	@Test
	public void testAddwrong() {
		int answer = 1;
		
		AddsNum add = new AddsNum();
		assertFalse(answer == add.adds(1,1));
	}
}
