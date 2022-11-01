package com.practice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.practice1.games.ContraGame;
import com.practice1.games.MarioGame;

@SpringBootApplication
@ComponentScan("com.practice1")
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		
		//MarioGame marioGame = new MarioGame();
		//ContraGame contraGame = new ContraGame();
		//GameRunner gameRunner = new GameRunner(contraGame);
		//gameRunner.run();
		
		runner.run();
		
	}

}
