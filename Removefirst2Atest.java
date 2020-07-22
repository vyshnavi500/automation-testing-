package com.qwerty.tester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirst2ATest {

	RemoveFirst2A test;	
	@BeforeEach
	void runFirst() {
		test = new RemoveFirst2A();
	}
	
	@Test
	void test1() {
		assertEquals("BCD",test.remove("ABCD"));
	}
	
	@Test
	void test2() {
		assertEquals("CD",test.remove("AACD"));
	}
	
	@Test
	void test3() {
		assertEquals("BCD",test.remove("BACD"));
	}

	@Test
	void test4() {
		assertEquals("BBAA",test.remove("BBAA"));
	}
	
	@Test
	void test5() {
		assertEquals("BAA",test.remove("AABAA"));
	}
	
}
