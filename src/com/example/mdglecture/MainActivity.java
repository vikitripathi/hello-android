package com.example.mdglecture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button[] day = new Button[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        day[0] = (Button)findViewById(R.id.day1);
        day[1] = (Button)findViewById(R.id.day2);
        day[2] = (Button)findViewById(R.id.day3);
        
        day[2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent("com.example.mdglecture.DAY3");
				startActivity(i);
			}
		});
        day[0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent("com.example.mdglecture.DAY1");
				startActivity(i);
			}
		});
day[1].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent("com.example.mdglecture.DAY2");
				startActivity(i);
			}
		});
    }


   
    
}
