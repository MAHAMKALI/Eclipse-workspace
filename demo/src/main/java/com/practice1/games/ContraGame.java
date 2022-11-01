package com.practice1.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ContraGame implements GameConsole{
	
		public void up() {
			System.out.println("contra going up");
		}
		
		public void down() {
			System.out.println("contra going down");
		}
		
		public void left() {
			System.out.println("contra going left");
		}
		
		public void right() {
			System.out.println("contra going right");
		}
}
