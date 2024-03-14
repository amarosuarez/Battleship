package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable that collects the user's name
		String nickname = "";

		int tabla[] = new int[5];
		// Boolean variable that checks if the name is correct
		boolean correctNickname = false;
		// We create a new Scanner
		Scanner sc = new Scanner(System.in);
		// Introductory message to the game
		System.out.println("Hello, welcome to Battleship.");

		do {
			// We ask the user for their username
			System.out.println("To start your game select a nickname:");
			// We read the username from the keyboard
			nickname = sc.nextLine();

			if (nickname.matches("[a-zA-Z]+")) {
				System.out.println("¡Hi, " + nickname + "!");
				correctNickname = true;
			} else {
				System.out.println("El nombre solo debe contener letras.");
			}
		} while (!correctNickname);

		System.out.println("Starting the game...");

		System.out.println("----------------------------------------------------------------------------");

		System.out.println("Place your ships (1 x 1) on the board:");

		System.out.println("Aqui llamamos a la funcion tablero");
		sc.close();
	}

}
