package com.aurionpro.LSP.Vehicle.solution.Test;

import com.aurionpro.LSP.Vehicle.solution.model.TataNexon;
import com.aurionpro.LSP.Vehicle.solution.model.Tesla;

public class Vehicle {
public static void main(String[] args) {
	TataNexon tata=new TataNexon();
	tata.getFuel();
	Tesla ev=new Tesla();
	ev.recharge();
}
}
