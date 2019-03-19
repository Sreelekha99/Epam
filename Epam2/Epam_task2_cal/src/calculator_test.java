import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculator_test {

	@Test
	void testaddition() {
		calculator c=new calculator();
		assertEquals(22,c.Add(11, 11));
		assertEquals(6,c.Add(12,-5, -1));
		assertEquals(50,c.Add(20, 30));
	}
	@Test
	void testsubtract() {
		calculator c=new calculator();
		assertEquals(10,c.Sub(20, 10));
		assertEquals(235,c.Sub(265,30));
		assertEquals(-2,c.Sub(8,10));
	}
	@Test
	void testmultiply() {
		calculator c=new calculator();
		assertEquals(121,c.Mul(11,11));
		assertEquals(-144,c.Mul(2,-8,9));
		assertEquals(160,c.Mul(80,2));
	}
	
	@Test
	void testdivision() {
		calculator c=new calculator();
		assertEquals(4,c.Div(28,7));
		assertEquals(25,c.Div(50,2));
		assertEquals(33,c.Div(99,3));
	}

}
