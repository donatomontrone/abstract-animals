package org.lessons.animals;

import org.lessons.actions.Swimming;

public class Dog extends Animal implements Swimming{

	@Override
	public void call() {
		System.out.println("Bau Bau");
		
	}

	@Override
	public void eat() {
		System.out.println("carne o croccantini");
		
	}

	@Override
	public void swim() {
		System.out.println("Sto nuotando!!!");		
	}

}
