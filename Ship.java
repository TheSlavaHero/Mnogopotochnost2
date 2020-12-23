package com.gmail.theslavahero;

public class Ship {
	private int amountOfContainers;

	public Ship(int amountOfContainers) {
		super();
		this.amountOfContainers = amountOfContainers;
	}

	public Ship() {
		super();
	}

	public int getAmountOfContainers() {
		return amountOfContainers;
	}

	public void setAmountOfContainers(int amountOfContainers) {
		this.amountOfContainers = amountOfContainers;
	}
	
	public synchronized int unloadToDock(Dock dock) {
		if (dock.isFree()) {
			dock.setFree(false);
			int time = this.getAmountOfContainers() / dock.getSpeedOfUnload();
			dock.setAmountOfContainers(this.getAmountOfContainers() + dock.getAmountOfContainers());
			this.setAmountOfContainers(0);
			return time;
		} else {
			System.out.println("The Dock is busy right now.");
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "Ship [amountOfContainers=" + amountOfContainers + "]";
	}

	
}
