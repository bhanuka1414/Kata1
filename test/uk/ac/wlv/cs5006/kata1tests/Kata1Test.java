package uk.ac.wlv.cs5006.kata1tests;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.ac.wlv.cs5006.kata1.Kata1;

public class Kata1Test {

	@Test
	public void testNulls() {
		assertFalse(Kata1.areAnagrams("ziggy", null));
		assertFalse(Kata1.areAnagrams(null, "stardust"));
		assertFalse(Kata1.areAnagrams(null, null));
	}
	
	@Test
	public void testEmpties() {
		assertFalse(Kata1.areAnagrams("", "word2"));
		assertFalse(Kata1.areAnagrams("word1", ""));
		assertTrue(Kata1.areAnagrams("", ""));
	}
	
	@Test
	public void testAnagrams() {
		assertTrue(Kata1.areAnagrams("a", "a"));
		assertTrue(Kata1.areAnagrams("aa", "aa"));
		assertTrue(Kata1.areAnagrams("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxzy"));
		assertFalse(Kata1.areAnagrams("abcdef ghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxzy"));
		assertFalse(Kata1.areAnagrams("a", " a"));
	}
	
	@Test
	public void testNumbers() {
		assertFalse(Kata1.areAnagrams("123", "321"));
	}

}
