package com.epam1.Remove_first2char_if_A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;


import org.junit.Test;

public class RemoveFirst2CharifATest {

	
	/*TODO List 
	 *  "A" => "" (if single A remove it)
	 *  "B" => "B" (if single B print it as it is)
	 *  "AA" => ""  (if first characters are A's remove them)
	 *  "AB" => "B" 
	 *  "BA" => "B"
	 *  "AACD" => "CD"
	 *  "ABCD" => "BCD"
	 *  "BACD" => "BCD";
	 *  "BBAA" => "BBAA"
	 *  "BCDE" => "BCDE"
	 *  "AABAA" => "AABAA"
	 *  "BCDAB" => "BCDAB"
	 *  "AAAAAAA" => "AAAAA" (if all are A's then remove first 2 char)
	 *  ""   =>   ""
	 */  
	
	RemoveFirst2CharsifA removeFirst2CharsifA;
	
	@BeforeEach
	public void setUp() {
		RemoveFirst2CharsifA removeFirst2CharsifA = new RemoveFirst2CharsifA();
	}


	@Test
	public void test1CharRemoveA() {
		assertEquals("", removeFirst2CharsifA.remove("A"));
	}
	
	@Test
	public void test1CharNoAAtFirst() {
		assertEquals("B", removeFirst2CharsifA.remove("B"));
	}
	
	@Test
	public void test2CharsRemove2AChars() {
		assertEquals("", removeFirst2CharsifA.remove("AA"));
	}
	
	@Test
	public void test2CharsRemove1AAtFirst() {
		assertEquals("B", removeFirst2CharsifA.remove("AB"));
	}
	
	@Test
	public void test2CharsRemove1AAtSecond() {
		assertEquals("B", removeFirst2CharsifA.remove("BA"));
	}
	
	@Test
	public void test4CharsRemove2As() {
		assertEquals("CD", removeFirst2CharsifA.remove("AACD"));
	}
	
	@Test
	public void test4CharsRemove1AAtFirst() {
		assertEquals("BCD", removeFirst2CharsifA.remove("ABCD"));
	}
	
	@Test
	public void test4CharsRemove1AAtSecond() {
		assertEquals("BCD", removeFirst2CharsifA.remove("BACD"));
	}
	
	@Test
	public void test4CharsNoAAtFirstSecondPosition() {
		assertEquals("BBAA", removeFirst2CharsifA.remove("BBAA"));
	}
	
	@Test
	public void test4CharsNoA() {
		assertEquals("BCDE", removeFirst2CharsifA.remove("BCDE"));
	}
	
	@Test
	public void testNChars() {
		assertEquals("BAA", removeFirst2CharsifA.remove("AABAA"));
	}
	
	@Test
	public void testNCharsNoAAtFirstSecondPosition() {
		assertEquals("BCDAB", removeFirst2CharsifA.remove("BCDAB"));
	}
	
	@Test
	public void testNCharsOfAllACharacters() {
		assertEquals("AAAAA", removeFirst2CharsifA.remove("AAAAAAA"));
	}
	@Test
	public void test0Chars() {
		assertEquals("", removeFirst2CharsifA.remove(""));
	}
	


	}