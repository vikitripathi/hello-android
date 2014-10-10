package com.example.mdglecture;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;

public class Day3 extends Activity implements SensorEventListener{

	Bitmap ball;
	Sensor sensor;
	SensorManager sm;
	float x,y,sensorX,sensorY;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView( new myView(this));
		
		sm = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
		Sensor sensor = sm.getSensorList(Sensor.TYPE_ACCELEROMETER).get(0);
		sm.registerListener(this, sensor, SensorManager.SENSOR_DELAY_GAME);
			
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		sensorX = event.values[0];
		sensorY = event.values[1];
		
	}
   class myView extends View{

	public myView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		ball = BitmapFactory.decodeResource(getResources(),
				R.drawable.ball);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		x = canvas.getWidth()/2-sensorX*50;
		y = canvas.getHeight()/2+sensorY*80;
		
		canvas.drawBitmap(ball,x,y, null);
		
		invalidate();
		
	}
	   
   }
	
	
}
