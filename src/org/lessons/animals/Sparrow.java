package org.lessons.animals;

import org.lessons.actions.Flying;

public class Sparrow extends Animal implements Flying{
	
	@Override
	public void call() {
		System.out.println("Cip Cip");
		
	}

	@Override
	public void eat() {
		System.out.println("cereali o semi");
		
	}
	
	@Override
	public void fly() {
		System.out.println("Sto volando!!!");
		
	}


}
