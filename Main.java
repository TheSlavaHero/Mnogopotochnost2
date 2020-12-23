package com.gmail.theslavahero;

public class Main {

	public static void main(String[] args) {
		Ship ship1 = new Ship(10);
		Ship ship2 = new Ship(10);
		Ship ship3 = new Ship(10);
		Dock dock1 = new Dock(2, true, 0);
		Dock dock2 = new Dock(2, true, 0);
		Dock[] docks = new Dock[] {dock1, dock2};
		ThreadShipUnload upload1 = new ThreadShipUnload(ship1, docks);
		ThreadShipUnload upload2 = new ThreadShipUnload(ship2, docks);
		ThreadShipUnload upload3 = new ThreadShipUnload(ship3, docks);
		
		upload1.start();
		upload2.start();
		upload3.start();
		try {
			upload1.join();
			upload2.join();
			upload3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(ship1);
		System.out.println(ship2);
		System.out.println(ship3);
		System.out.println(dock1);
		System.out.println(dock2);
		
	}

}
