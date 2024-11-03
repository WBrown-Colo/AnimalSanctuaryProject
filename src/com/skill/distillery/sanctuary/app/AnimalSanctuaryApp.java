package com.skill.distillery.sanctuary.app;

import java.util.Scanner;

import com.skill.distillery.sanctuary.entities.Attendant;
import com.skill.distillery.sanctuary.entities.Sanctuary;
import com.skill.distillery.sanctuary.entities.Animal;
import com.skill.distillery.sanctuary.entities.Gorilla;
import com.skill.distillery.sanctuary.entities.Boar;
import com.skill.distillery.sanctuary.entities.Duck;

public class AnimalSanctuaryApp {
	private Sanctuary sanctuary;

	private Scanner kb;

	public static void main (String[] args) {

		AnimalSanctuaryApp app = new AnimalSanctuaryApp();

		app.launchApp();

	}

	private void launchApp() {
		sanctuary = new Sanctuary();

		Attendant attend = new Attendant();

		sanctuary.setAttendant(attend);

		kb = new Scanner(System.in);

		boolean functionRunning = true;

		while (functionRunning) {
			printMenu();
			String response = kb.next();
			if (response.equals("1"))
			{
				sanctuary.listAnimals();
			} else if (response.equals("2"))
			{
				System.out.println("Which of the following animals would you like to add?");
				System.out.println("1. Gorilla");
				System.out.println("2. Boar");
				System.out.println("3. Duck");
				response = kb.next();

				if (response.equals("1")) {
					Animal animalAdd = new Gorilla();
					System.out.println("What is the gorilla's name?");
					String name = kb.next();
					animalAdd.setName(name);
					sanctuary.addAnimal(animalAdd);

				}
				if (response.equals("2")) {
					Animal animalAdd = new Boar();
					System.out.println("What is the boar's name?");
					String name = kb.next();
					animalAdd.setName(name);
					sanctuary.addAnimal(animalAdd);

				}
				if (response.equals("3")) {
					Animal animalAdd = new Duck();
					System.out.println("What is the duck's name?");
					String name = kb.next();
					animalAdd.setName(name);
					sanctuary.addAnimal(animalAdd);

				}
			}

			else if (response.equals("3")) {
				sanctuary.makeRounds();

			} else if (response.equals("4")) {
				System.out.println("Exiting Program");
				break;
			}
			
			else {
				System.out.println("Invalid entry. Please try again.");
			}
		}
	}

	public void printMenu() {
		System.out.println("===================================");
		System.out.println("* 1. List animals                 *");
		System.out.println("* 2. Add new animal               *");
		System.out.println("* 3. Start the attendant's rounds *");
		System.out.println("* 4. Quit                         *");
		System.out.println("===================================");
		
	}
}