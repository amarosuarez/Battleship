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
	 * Attribute that stores the number of machine's ships
	 */
	int machineShips = 4;

	/**
	 * 
	 *  
	 */
	void setShips() {

		int x;

		int y;

		for (int i = 0; i < machineShips; i++) {
			
			do {
				do {
					x = genRandom();
					y = genRandom();
				} while (!canPutIt(x, y, DASHBOARDS_SHIPS_MACHINE));
			} while (!setShip(x, y, DASHBOARDS_SHIPS_MACHINE));
			
		}
	}

	boolean canPutIt(int i, int j, char[][] dashboard) {
		// Variable that store if the ship can be placed
		boolean can = true;

		// We check that we do not go to the left
		if ((i - 1) >= 0) {
			if (dashboard[i-1][j] == 'S') {
				can = false;
			}
		}

		// We check that we don't go out on top
		if ((i + 1) < dashboard.length) {
			if (dashboard[i+1][j] == 'S') {
				can = false;
			}
		}

		// We check that we do not go to the rigth
		if ((j - 1) >= 0) {
			if (dashboard[i][j-1] == 'S') {
				can = false;
			}
		}

		// We check that we don't go out on bottom
		if ((j + 1) < dashboard[0].length) {
			if (dashboard[i][j+1] == 'S') {
				can = false;
			}
		}

		return can;
	}

	boolean setShip(int x, int y, char[][] dashboard) {
		boolean putted = false;
		
		if (dashboard[x][y] == '*') {
			dashboard[x][y] = 'S';
			 putted = true;
		 }
		
		return putted;
	}
	
	/**
	 * Method that checks if a ship is in the current position
	 * 
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
	 * 
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
	
	public static void dashboardInit(char[][] dashboard) {
		for (int i = 0; i < dashboard.length; i++) {
			for (int j = 0; j < dashboard[i].length; j++) {
				dashboard[i][j] = '*';
			}
		}
	}

	public static void seeDashboard(char[][] dashboard) {
		for (int i = 0; i < dashboard.length; i++) {
			for (int j = 0; j < dashboard[i].length; j++) {
				System.out.print(dashboard[i][j] + " ");
			}
			System.out.println();
		}
	}
}
