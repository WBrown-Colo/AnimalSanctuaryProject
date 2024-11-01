package com.skill.distillery.sanctuary.entities;

public class Gorilla extends Animal {
	private static String noise = "ROOAAR";
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		makeNoise();
		System.out.println("WHERE'S THE BEEF?" + " Gorilla eats " + amount + " heads of lettuce.");
	}
}
