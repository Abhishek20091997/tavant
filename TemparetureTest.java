package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {

	@Test
	void testConvert0FarenheittoCelsius() {

		Temperature tem=new Temperature();
		double actual = tem.convertToCelsius(0);
		double expect= -17.77777777777778;
		assertEquals(actual,expect);

	}
	void testConvert10FarenheittoCelsius() {

		Temperature tem=new Temperature();
		double actual = tem.convertToCelsius(10);
		double expect= -12.222222222222223;
		assertEquals(actual,expect);

	}
	void testConvert0CelsiusToFarenheit() {
		
		Temperature tem=new Temperature();
		double actual = tem.convertToFarenheit(0);
		double expect = 32;
		assertEquals(actual,expect);

	}
    void testConvert10CelsiusToFarenheit() {
		
		Temperature tem=new Temperature();
		double actual = tem.convertToFarenheit(10);
		double expect = 50;
		assertEquals(actual,expect);

	}
}
