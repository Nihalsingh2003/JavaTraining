package com.aurionpro.abstraction.model;

public class Warrior extends GameCharacter {
private int warriorPowerLevel=getPowerLevel();
	public Warrior(String name, int powerLevel) {
		super(name, powerLevel);
		
	}

	@Override
	public void attack() {
		warriorPowerLevel-=10;
		
		
	}
	public void updatedPowerLevel() {
		System.out.println("----------------------UPDATEDPOWERLEVEL----------------------");
		super.display();
		System.out.println("WarrirPoweLevel after 2 attacks:"+warriorPowerLevel);
		System.out.println("--------------------------------------------------------------");
	}

}
