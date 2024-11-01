package com.skill.distillery.sanctuary.entities;

public class Duck extends Animal {
	private static String noise = "QUACK QUACK";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.println("Duck eats " + amount + " pellets of food.");
	}
}
