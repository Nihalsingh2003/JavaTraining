package com.aurionpro.abstraction.model;

public abstract class GameCharacter {
private String name;
private int powerLevel;
 GameCharacter(String name,int powerLevel) {
	this.name=name;
	this.powerLevel=powerLevel;
}
public void display() {
	System.out.println("Name: "+ name);
	System.out.println("powerLevel: "+ powerLevel);
}
abstract void attack();
public int getPowerLevel() {
	return powerLevel;
}
}
