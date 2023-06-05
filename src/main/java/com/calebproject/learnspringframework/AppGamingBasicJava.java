package com.calebproject.learnspringframework;

import com.calebproject.learnspringframework.game.GameRunner;
import com.calebproject.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
