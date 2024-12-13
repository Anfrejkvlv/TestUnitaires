package com.loubah.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		int a=4;
		int b=8;
		//
		Calculator calculator=new Calculator();
		int somme =calculator.add(a,b);
		//
		assertEquals(12,somme);
	}

}
