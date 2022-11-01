package com.practice1.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GameConsole {
	
		@Override
		public void up() {
			System.out.println("going up");
		}
		
		@Override
		public void down() {
			System.out.println("going down");
		}
		
		@Override
		public void left() {
			System.out.println("going left");
		}
		
		@Override
		public void right() {
			System.out.println("going right");
		}
}
