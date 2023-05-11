package org.lessons.main;

import org.lessons.actions.Flying;
import org.lessons.actions.Swimming;

public class AnimalManager{

	

	public void makeSwim(Swimming animal ) {
		 animal.swim();
	}

	public void makeFly(Flying animal) {
		animal.fly();
	}
}

