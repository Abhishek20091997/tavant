package day2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		Factorial f=new Factorial();
        int a = f.calculateFact(3);
        int b = 6;
        assertEquals(a,b);
	}
	void test1() {
		Factorial f=new Factorial();
        int a = f.calculateFact(4);
        int b = 24;
        assertEquals(a,b);
	}
	void test2() {
		Factorial f=new Factorial();
        int a = f.calculateFact(5);
        int b = 120;
        assertEquals(a,b);
	}

}
