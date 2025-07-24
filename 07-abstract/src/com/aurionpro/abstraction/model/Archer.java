package com.aurionpro.abstraction.model;

public class Archer extends GameCharacter {
int archerPowerLevel=getPowerLevel();
	public Archer(String name, int powerLevel) {
		super(name, powerLevel);
		
	}

	@Override
	public void attack() {
		archerPowerLevel-=5;
		
	}
	public void updatedPowerLevel() {
		System.out.println("----------------------UPDATEDPOWERLEVEL----------------------");
		super.display();
		System.out.println("ArcherPowerLevel after 2 attacks:"+archerPowerLevel);
		System.out.println("--------------------------------------------------------------");
	}

}
