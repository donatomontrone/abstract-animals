package org.lessons.animals;

import org.lessons.actions.Flying;

public class Eagle extends Animal implements Flying{
	
	
	@Override
	public void call() {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAA");
		
	}

	@Override
	public void eat() {
		System.out.println("carne");
		
	}

	@Override
	public void fly() {
		System.out.println("Sto volando!!!");
		
	}

	
}
