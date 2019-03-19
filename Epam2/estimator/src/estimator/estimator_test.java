package estimator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class estimator_test {
	@Test
	void test() {
		estimator e=new estimator();
		assertEquals(655000.0, e.cost("high",262,true));
		assertEquals(106800.0, e.cost("low",89,false));
		assertEquals(34500.0, e.cost("medium",23,false));
	}
}
