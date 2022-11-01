package com.coupling.TightCoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.coupling.TightCoupling.game.GameRunner;
import com.coupling.TightCoupling.game.GamingConsole;
import com.coupling.TightCoupling.game.MarioGame;
import com.coupling.TightCoupling.game.SuperMarioGame;

@SpringBootApplication
public class TightCouplingApplication {

	private static ConfigurableApplicationContext context;
	private static GameRunner gameRunner;
	

	public static void main(String[] args) {
		 context = SpringApplication.run(TightCouplingApplication.class, args);
		 
		 gameRunner = context.getBean(GameRunner.class);
		//GamingConsole game = new MarioGame();
		//GameRunner gameRunner = new GameRunner(game);
		gameRunner.runGame();
		
		
	}

}
