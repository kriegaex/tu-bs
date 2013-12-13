package de.scrum_master.tu_bs;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
	private final HelloWorld helloWorld = new HelloWorld();

	@Test
	public void testCreateGreeting() throws Exception {
		assertEquals("Hello world!", helloWorld.createGreeting("world"));
		assertEquals("Hello Alexander!", helloWorld.createGreeting("Alexander"));
		assertEquals("Hello Braunschweig!", helloWorld.createGreeting("Braunschweig"));
	}
	
	@Test
	public void testSayGoodbye() throws Exception {
		assertEquals("Goodbye world!", helloWorld.sayGoodbye("world"));
		assertEquals("Goodbye Alexander!", helloWorld.sayGoodbye("Alexander"));
		assertEquals("Goodbye Braunschweig!", helloWorld.sayGoodbye("Braunschweig"));
	}
}
