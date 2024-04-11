package project;

public class Dashboard {

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
}
