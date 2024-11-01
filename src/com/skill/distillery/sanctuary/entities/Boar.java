package com.skill.distillery.sanctuary.entities;

public class Boar extends Animal {
	private static String noise = "OINK OINK";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.println("I LOVE MEAL TIME!" + " Boar eats " + amount + " corn on the cob.");
	}

}
