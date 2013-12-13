package de.scrum_master.tu_bs;

public class HelloWorld {
	String createGreeting(String name) {
		return "Hello " + name + "!";
	}

    String sayGoodbye(String name) {
        return "Goodbye " + name + "!";
    }

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.createGreeting("Master"));
        System.out.println(hello.sayGoodbye("Master"));
	}
}
