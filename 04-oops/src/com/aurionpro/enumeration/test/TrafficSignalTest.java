package com.aurionpro.enumeration.test;

import com.aurionpro.enumeration.model.TrafficLight;

public class TrafficSignalTest {
	 public static void trafficSignal(TrafficLight signal) {
	        switch (signal) {
	            case RED:
	                System.out.println("Action: Stop");
	                break;
	            case YELLOW:
	                System.out.println("Action: Get Ready");
	                break;
	            case GREEN:
	                System.out.println("Action: Go");
	                break;
	          
	        }
	    }


	public static void main(String[] args) {
		trafficSignal(TrafficLight.RED);
		trafficSignal(TrafficLight.YELLOW);
		trafficSignal(TrafficLight.GREEN);
	}
}
