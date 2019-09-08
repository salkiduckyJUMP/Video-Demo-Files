package com.collabera.inheritance;

public class GameSystem {

	public static void main(String[] args) {
		
		Mario mario = new Mario();
		mario.jump();
		mario.runForward();
		mario.throwFire();
		
		AdventureIsland adventure = new AdventureIsland();
		adventure.jump();
		adventure.walkForward();
		adventure.throwAxe();
		
		
	}

}
