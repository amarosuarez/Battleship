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

}
