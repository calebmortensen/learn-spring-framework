package com.calebproject.learnspringframework;

import com.calebproject.learnspringframework.game.GameRunner;
import com.calebproject.learnspringframework.game.MarioGame;
import com.calebproject.learnspringframework.game.PacManGame;
import com.calebproject.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		
		var game = new PacManGame(); //1. Object Creation
		
		var gameRunner = new GameRunner(game); //2. Object Creation + Wiring of Dependencies
		
		gameRunner.run();

	}

}
