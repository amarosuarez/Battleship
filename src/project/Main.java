package project;

public class Main {

	public static void main(String[] args) {
		Dashboard dashboard = new Dashboard();
		
		Dashboard.dashboardInit(dashboard.DASHBOARDS_SHIPS_MACHINE);
		
		dashboard.setShips();
		
		System.out.println("---------------------------------");
		
		Dashboard.seeDashboard(dashboard.DASHBOARDS_SHIPS_MACHINE);
		
	}

}
