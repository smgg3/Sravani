package com.test.Interface;

public class Car  implements Vehicle {

	final int tyres=4;
	String make;
	String engine_type;
	public void move(){
		System.out.println("Car is moving");
	}
	public void moveForward(){
		System.out.println("Move Forward");
	}
	public void moveBackward(){
		System.out.println("Move Backward");
	}
	

}
