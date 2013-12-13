package de.scrum_master.tu_bs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class VowelRotatorTest {
	static VowelRotator vowelRotator = new VowelRotator();

	@Test
	public void testEncode() throws Exception {
		assertEquals("Alexander", vowelRotator.encode("Elixendir"));
		assertEquals("Mama", vowelRotator.encode("Meme"));
		assertEquals("AEIOUaeiou", vowelRotator.encode("EIOUAeioua"));
		assertEquals("Wrztlbrnft", vowelRotator.encode("Wrztlbrnft"));
	}

	@Test
	public void testDecode() throws Exception {
		assertEquals("Elixendir", vowelRotator.decode("Alexander"));
		assertEquals("Meme", vowelRotator.decode("Mama"));
		assertEquals("EIOUAeioua", vowelRotator.decode("AEIOUaeiou"));
		assertEquals("Wrztlbrnft", vowelRotator.decode("Wrztlbrnft"));
	}
}
