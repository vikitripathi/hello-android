package com.example.mdglecture;



import java.io.IOException;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Day2 extends Activity {

	Button play,pause,stop ;
	MediaPlayer song ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day2);
		play = (Button)findViewById(R.id.play);
		pause = (Button)findViewById(R.id.pause);
		stop = (Button)findViewById(R.id.stop);
		
		song = MediaPlayer.create(this, R.raw.my_song);
		if(song.isPlaying()){
			song.stop();
		}
		
		     play.setOnClickListener(new View.OnClickListener() {
		    
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//song.reset();
				song.start();
				
			}
		});
		     
		     pause.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				song.pause();
			}
		});
		     
				
		     stop.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				song.stop();
			}
		});
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.stop();
		song.release();
	}

}
