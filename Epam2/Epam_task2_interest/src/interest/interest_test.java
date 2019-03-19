package interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class interest_test {
	@Test
	void SimpleInterest() {
		interest i=new interest();
		assertEquals(270.0,i.simple_interest(1000, 9, 3));
		assertEquals(10800.0,i.simple_interest(18000, 12, 5));
	}
	@Test
	void CompoundInterest() {
		interest i=new interest();
		assertEquals(5468.425898710139,i.compound_interest(5000, 9, 1));
		assertEquals(9307.965491541247,i.compound_interest(6000, 9, 5));
	}
}
