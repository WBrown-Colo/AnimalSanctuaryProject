package com.skill.distillery.sanctuary.entities;

public class Attendant {

	public void makeRounds(Animal[] animals) {

		System.out.println("Dum de dum, I love taking care of my Animal friends...");

		for (Animal animal : animals) {
			if (animal != null) {
				int amount = 4;
				System.out.println("I will feed " + animal.getName() + " " + amount + " units of food.");
				animal.eat(amount);
				System.out.println();
			} else {
				System.out.println("This enclosure is empty, on to the next one.");
			}
		}

		System.out.println("Everyone's fed now, I can take a break.");

	}
}
