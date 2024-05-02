package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Dashboard dashboard = new Dashboard();
		
		Dashboard.dashboardInit(dashboard.DASHBOARDS_SHIPS_MACHINE);
		Dashboard.dashboardInit(dashboard.DASHBOARDS_SHIPS_PLAYER);
		
		dashboard.setShips();
		
		System.out.println("---------------------------------");
		
		Dashboard.seeDashboard(dashboard.DASHBOARDS_SHIPS_MACHINE);
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < dashboard.DASHBOARDS_SHIPS_PLAYER.length; i++) {
			int x = 0;
			int y = 0;
			
			do {

				do {
					System.out.println("Pon la X");
					x = sc.nextInt();
					
					System.out.println("Pon la Y");
					y = sc.nextInt();
					
				} while (!dashboard.canPutIt(x, y, dashboard.DASHBOARDS_SHIPS_PLAYER));
				
			} while (!dashboard.setShip(x, y, dashboard.DASHBOARDS_SHIPS_PLAYER));
			
			Dashboard.seeDashboard(dashboard.DASHBOARDS_SHIPS_PLAYER);
			
		}
		
	}

}
