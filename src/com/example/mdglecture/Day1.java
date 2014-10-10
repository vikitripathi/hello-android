package com.example.mdglecture;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Day1 extends Activity{

	Button add,sub ;
	TextView display;
	int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day1);
        
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        display = (TextView)findViewById(R.id.display);
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				count++;
				display.setText(""+count);
			}
		});
       sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				count--;
				display.setText(""+count);
			}
		});
    }


   
    
}


