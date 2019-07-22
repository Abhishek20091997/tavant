package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarksValidatorTest {

	@Test
	void test() {
		MarksValidator mark= new MarksValidator();
		Boolean actual = mark.isPass(20);
		Boolean expect = false;
		assertEquals(actual,expect);

	}
	void test1() {
		MarksValidator mark= new MarksValidator();
		Boolean actual = mark.isPass(50);
		Boolean expect = true;
		assertEquals(actual,expect);

	}
	void test2() {
		MarksValidator mark= new MarksValidator();
		String actual = mark.markGrade(61);
		String expect = "C";
		assertEquals(actual,expect);

	}
	void test3() {
		MarksValidator mark= new MarksValidator();
		String actual = mark.markGrade(9);
		String expect = "D";
		assertEquals(actual,expect);

	}
	void test4() {
		MarksValidator mark= new MarksValidator();
		String actual = mark.Switcher(61);
		String expect = "C";
		assertEquals(actual,expect);

	}
	void test5() {
		MarksValidator mark= new MarksValidator();
		String actual = mark.Switcher(9);
		String expect = "D";
		assertEquals(actual,expect);

	}


}
