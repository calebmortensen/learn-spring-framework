package com.calebproject.learnspringframework.game;

public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Squat - down hole");
	}
	
	public void left() {
		System.out.println("Accelerate Left");
	}
	
	public void right() {
		System.out.println("Accelerate Right");
	}

}
