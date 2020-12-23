package com.gmail.theslavahero;

public class Dock {
	private int speedOfUnload;
	private boolean isFree;
	private int amountOfContainers;

	public Dock(int speedOfUnload, boolean isFree, int amountOfContainers) {
		super();
		this.speedOfUnload = speedOfUnload;
		this.isFree = isFree;
		this.amountOfContainers = amountOfContainers;
	}

	public Dock() {
		super();
	}

	public int getSpeedOfUnload() {
		return speedOfUnload;
	}

	public void setSpeedOfUnload(int speedOfUnload) {
		this.speedOfUnload = speedOfUnload;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public int getAmountOfContainers() {
		return amountOfContainers;
	}

	public void setAmountOfContainers(int amountOfContainers) {
		this.amountOfContainers = amountOfContainers;
	}

	@Override
	public String toString() {
		return "Dock [speedOfUnload=" + speedOfUnload + ", isFree=" + isFree + ", amountOfContainers="
				+ amountOfContainers + "]";
	}

}
