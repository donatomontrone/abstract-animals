package org.lessons.animals;

import org.lessons.actions.Swimming;

public class Dolphin extends Animal implements Swimming{
	@Override
	public void call() {
		System.out.println("ANDSNINCVIEVIEVMN");
		
	}

	@Override
	public void eat() {
		System.out.println("piccoli pesci");
		
	}

	@Override
	public void swim() {
		System.out.println("Sto nuotando!!!");
		
	}
}
