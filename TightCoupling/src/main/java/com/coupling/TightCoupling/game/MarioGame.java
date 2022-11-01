package com.coupling.TightCoupling.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
	
	
	@Override
	public void up() {
		System.out.println("Mario is jumping");
	}
	
	@Override
	public void down() {
		System.out.println("Mario is climbing");
	}
	
	@Override
	public void left() {
		System.out.println("Mario is walking left");
	}
	
	@Override
	public void right() {
		System.out.println("Mario is walking right");
	}
}
