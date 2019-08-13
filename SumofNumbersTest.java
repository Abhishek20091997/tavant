package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumofNumbersTest {

	@Test
	void testSumeven20to45() {
		SumofNumbers SoN=new SumofNumbers();
        int actual= SoN.Sum0fEven(20, 45);
        int expect=416;
		assertEquals(actual,expect);
	}
	void testSumodd20to45() {
		SumofNumbers SoN=new SumofNumbers();
        int actual= SoN.Sum0fOdd(20, 45);
        int expect=429;
		assertEquals(actual,expect);
	}
}
