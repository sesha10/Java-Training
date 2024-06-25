package com.techmojo.beans;

public class DiskPlayer implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("Play the player");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause the player");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("Increase volume");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Decrease volume");
		
	}
	
	public void changeDisk() {
		System.out.println("Change disk");
	}
	
}
