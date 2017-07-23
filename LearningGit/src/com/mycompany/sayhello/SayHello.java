package com.mycompany.sayhello;

public class SayHello {

	public static void main(String[] args) {
		String [] friends = {"John", "Carlos", "Janet", "Atif, br05_b"};
		
		// say hi to my friends
		for (String friend : friends) {
			System.out.println("Hi " +  friend + "!");
			System.out.println("Bye " +  friend + "!");
		}

	}

}
