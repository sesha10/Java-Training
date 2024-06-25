package com.techmojo.beans;

public class Walkman implements MediaPlayer {

	@Override
	public void play() {
		System.out.println("Play the walk player");
		
	}

	@Override
	public void pause() {
		System.out.println("Pause the walk player");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("Increase walk volume");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Decrease walk volume");
		
	}
	
	public void equalizer() {
		System.out.println("Tune equalizer");
	}

}
