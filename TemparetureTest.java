package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void test() {

		Temperature tem=new Temperature();
		double actual = tem.convertToCelsius(0);
		double expect= -17.77777777777778;
		assertEquals(actual,expect);

	}
	void test1() {

		Temperature tem=new Temperature();
		double actual = tem.convertToCelsius(10);
		double expect= -12.222222222222223;
		assertEquals(actual,expect);

	}
	void test2() {
		
		Temperature tem=new Temperature();
		double actual = tem.convertToFarenheit(0);
		double expect = 32;
		assertEquals(actual,expect);

	}
    void test3() {
		
		Temperature tem=new Temperature();
		double actual = tem.convertToFarenheit(10);
		double expect = 50;
		assertEquals(actual,expect);

	}
}
