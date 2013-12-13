package de.scrum_master.tu_bs;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
	@Test
	public void testCreateGreeting() throws Exception {
		assertEquals("Hello world!", new HelloWorld().createGreeting("world"));
		assertEquals("Hello Alexander!", new HelloWorld().createGreeting("Alexander"));
		assertEquals("Hello Braunschweig!", new HelloWorld().createGreeting("Braunschweig"));
	}
}
