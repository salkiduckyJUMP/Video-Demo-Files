package com.collabera.polymorphism;

public class Cafeteria {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		
		Wolf wolf = new Wolf();
		wolf.eat();
		
		Dog dog = new Dog();
		dog.eat();
	}

}
