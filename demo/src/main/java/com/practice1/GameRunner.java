package com.practice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice1.games.ContraGame;
import com.practice1.games.GameConsole;
import com.practice1.games.MarioGame;

@Component
public class GameRunner {
	
	@Autowired
	private GameConsole  gameConsole;
//	public GameRunner(GameConsole gameConsole) {
//		// TODO Auto-generated constructor stub
//		this.gameConsole=gameConsole;
//	}
	
	public void run() {
		gameConsole.up();
		gameConsole.down();
		gameConsole.left();
		gameConsole.right();
	}

//	@Autowired
//	public void setGameConsole(GameConsole gameConsole) {
//		this.gameConsole = gameConsole;
//	}
}
