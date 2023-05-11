package org.lessons.main;

import org.lessons.animals.Animal;
import org.lessons.animals.Dog;
import org.lessons.animals.Dolphin;
import org.lessons.animals.Eagle;
import org.lessons.animals.Sparrow;

public class Main {
	
	public static void main(String[] args) {
		Dog dg = new Dog();
		
		System.out.println("Il cane fa questo verso:");
		
		dg.call();
		
		System.out.println("Il cane mangia: ");
		
		dg.eat();
		
		System.out.print("E poi...");
		
		dg.sleep();
		
		System.out.println("\n-------------------------\n");
				
		Eagle e = new Eagle();
		
		System.out.println("L'aquila fa questo verso:");
		
		e.call();
		
		System.out.println("L'aquila mangia: ");
		
		e.eat();
		
		System.out.print("E poi...");
		
		e.sleep();
		
		System.out.println("\n-------------------------\n");
				
		Dolphin df = new Dolphin();
		
		System.out.println("Il delfino fa questo verso:");
		
		df.call();
		
		System.out.println("Il delfino mangia: ");
		
		df.eat();
		
		System.out.print("E poi...");
		
		df.sleep();
		
		System.out.println("\n-------------------------\n");
				
		Sparrow s = new Sparrow();
		
		System.out.println("Il passerotto fa questo verso:");
		
		s.call();
		
		System.out.println("Il passerotto mangia: ");
		
		s.eat();
		
		System.out.print("E poi...");
		
		s.sleep();
		
		System.out.println("\n-------------------------\n");
		
		
		Animal[] animals = {dg, e, df, s};
		
		for (int i = 0; i < animals.length; i++) {
			
			Animal animal = animals[i];
			
			animal.call();
			
		}
		
		
	}
}
