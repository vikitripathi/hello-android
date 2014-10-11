package com.example.mdglecture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button[] module = new Button[4];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		module[0] = (Button) findViewById(R.id.btn_layout);
		module[1] = (Button) findViewById(R.id.btn_animation);
		module[2] = (Button) findViewById(R.id.btn_accel);
		module[3] = (Button) findViewById(R.id.btn_media);


		module[0].setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,BasicLayout.class);
				startActivity(i);
			}
		});
		module[1].setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this , AnimationClass.class);
				startActivity(i);
			}
		});
		module[2].setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this , BasicAccelerometer.class);
				startActivity(i);
			}
		});
		module[3].setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this , BasicMediaPlayer.class);
				startActivity(i);
			}
		});
	}

}
