package project;

import java.util.Random;
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

		int x = 0;
		int y = 0;

		for (int i = 0; i < dashboard.playerShips; i++) {

			do {

				do {
					System.out.println("Pon la X");
					x = sc.nextInt();

					System.out.println("Pon la Y");
					y = sc.nextInt();

				} while (!dashboard.canPutIt(y, x, dashboard.DASHBOARDS_SHIPS_PLAYER));

			} while (!dashboard.setShip(y, x, dashboard.DASHBOARDS_SHIPS_PLAYER));

			Dashboard.seeDashboard(dashboard.DASHBOARDS_SHIPS_PLAYER);

		}

		int shipsPlayer = dashboard.playerShips;
		int shipsMachine = dashboard.machineShips;

		do {

			System.out.println("¿Dónde quieres atacar?");
			System.out.println("Coloca la X");
			x = sc.nextInt();
			System.out.println("Coloca la Y");
			y = sc.nextInt();

			int hit = dashboard.attack(y, x, dashboard.DASHBOARDS_SHIPS_MACHINE);

			if (hit == 0) {
				System.out.println("Fallaste");
			} else if (hit == 1) {
				System.out.println("¡Hundido!");
				shipsMachine--;
			} else {
				System.out.println("Ya has atacado ahí");
			}

			System.out.println("La máquina está pensando...");
			Random rand = new Random();
			int xM = rand.nextInt(dashboard.DASHBOARDS_SHIPS_PLAYER.length);
			int yM = rand.nextInt(dashboard.DASHBOARDS_SHIPS_PLAYER.length);

			hit = dashboard.attack(yM, xM, dashboard.DASHBOARDS_SHIPS_PLAYER);

			if (hit == 0) {
				System.out.println("Falló");
			} else if (hit == 1) {
				System.out.println("La máquina acertó...");
			shipsPlayer--;
			} else {
				System.out.println("Ya has atacado ahí, maquinita");
			}
			
			Dashboard.seeDashboard(dashboard.DASHBOARDS_SHIPS_PLAYER);

		} while (shipsPlayer > 0 && shipsMachine > 0);

		
	}

}
