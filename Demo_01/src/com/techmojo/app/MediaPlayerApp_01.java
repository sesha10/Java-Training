package com.techmojo.app;

import com.techmojo.beans.DiskPlayer;
import com.techmojo.beans.MediaPlayer;
import com.techmojo.beans.Walkman;

public class MediaPlayerApp_01 {

	public static void main(String[] args) {
//		DiskPlayer player = new DiskPlayer();
//		player.play();
//		player.pause();
//		player.volumeUp();
//		player.volumeDown();
//		player.play();
//		player.changeDisk();
//		player.volumeUp();
//		player.pause();
		
		Walkman player = new Walkman();
		player.play();
		player.pause();
		player.volumeUp();
		player.volumeDown();
		player.play();
		player.equalizer();
		player.volumeUp();
		player.pause();

	}

}
