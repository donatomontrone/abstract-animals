package org.lessons.main;

import org.lessons.animals.Animal;
import org.lessons.animals.Dog;
import org.lessons.animals.Dolphin;
import org.lessons.animals.Eagle;
import org.lessons.animals.Sparrow;

public class Main {
	
	public static void main(String[] args) {
		Dog dg = new Dog();
		
		System.out.print("Il cane fa questo verso:");
		
		dg.call();
		
		System.out.print("Il cane mangia: ");
		
		dg.eat();
		
		System.out.print("E poi...");
		
		dg.sleep();
		
		System.out.println("\n-------------------------\n");
				
		Eagle e = new Eagle();
		
		System.out.print("L'aquila fa questo verso:");
		
		e.call();
		
		System.out.print("L'aquila mangia: ");
		
		e.eat();
		
		System.out.print("E poi...");
		
		e.sleep();
		
		System.out.println("\n-------------------------\n");
				
		Dolphin df = new Dolphin();
		
		System.out.print("Il delfino fa questo verso:");
		
		df.call();
		
		System.out.print("Il delfino mangia: ");
		
		df.eat();
		
		System.out.print("E poi...");
		
		df.sleep();
		
		System.out.println("\n-------------------------\n");
				
		Sparrow s = new Sparrow();
		
		System.out.print("Il passerotto fa questo verso:");
		
		s.call();
		
		System.out.print("Il passerotto mangia: ");
		
		s.eat();
		
		System.out.print("E poi...");
		
		s.sleep();
		
		System.out.println("\n-------------------------\n");
		
		
		Animal[] animals = {dg, e, df, s};
		
		for (int i = 0; i < animals.length; i++) {
			
			Animal animal = animals[i];
			
			System.out.println(animal.getClass().getSimpleName() + ": ");
			animal.sleep();
			animal.eat();
			animal.call();
			System.out.println("\n-------------------------\n");
			
		}
		
		
		System.out.println("\nParte 2\n");
		
		
		AnimalManager am = new AnimalManager();
		
		am.makeSwim(df);
		System.out.println("\n-------------------------\n");
		am.makeSwim(dg);
		System.out.println("\n-------------------------\n");
		am.makeFly(s);
		System.out.println("\n-------------------------\n");
		am.makeFly(e);
		
	}
}
