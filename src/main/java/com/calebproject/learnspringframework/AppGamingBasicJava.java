package com.calebproject.learnspringframework;

import com.calebproject.learnspringframework.game.GameRunner;
import com.calebproject.learnspringframework.game.MarioGame;
import com.calebproject.learnspringframework.game.PacManGame;
import com.calebproject.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
