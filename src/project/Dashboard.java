package project;

import java.util.Random;

public class Dashboard {

	/**
	 * Array storing the player's ship board
	 */
	char[][] DASHBOARDS_SHIPS_PLAYER = new char[5][5];
	
	/**
	 * Array that stores the player's shot board
	 */
	char[][] DASHBOARDS_SHOOTS_PLAYER = new char[5][5];
	
	/**
	 * Array storing machine ship board
	 */
	char[][] DASHBOARDS_SHIPS_MACHINE = new char[5][5];
	
	/**
	 * Array that stores the machine's trigger board
	 */
	char[][] DASHBOARDS_SHOOTS_MACHINE = new char[5][5];
	
	/**
	 * Attribute that stores the number of player's ships
	 */
	int playerShips = 4;
	
	/**
	 *  Attribute that stores the number of machine's ships
	 */
	int machineShips = 4;
	
	
	void setShips() {
		
		int x;
		
		int y;
		
		for (int i = 0; i < machineShips; i++) {
			
			x = genRandom();
			y = genRandom();
			
			/* Para obtener el valor absoluto
			 * Math.abs 
			 */
			
			do {
				
			} while (!isHere(x,y));
			
			System.out.println(x + " " + y);
		}
	}
	
	/**
	 * Method that checks if a ship is in the current position
	 * @param x Coordinated X
	 * @param y Coordinated Y
	 * @return True if a ship is there or false if there isn't
	 */
	boolean isHere(int x, int y) {
		// Variable that stores if a ship is in the current position or not
		boolean found = false;
		
		// Condition that check if a ship is in this position
		if (DASHBOARDS_SHIPS_MACHINE[x][y] == 'S') {
			found = true;
		}
		
		// Return the boolean
		return found;
	}
	
	/**
	 * Method that generates a random number
	 * @return Random number
	 */
	int genRandom() {
		// Create the Random object
		Random rand = new Random();
		
		// Variable that stores the random position
		int pos;
		
		// Generates a random position and save it
		pos = rand.nextInt(0, DASHBOARDS_SHIPS_MACHINE.length);
		
		// Return random position
		return pos;
	}
	
}
