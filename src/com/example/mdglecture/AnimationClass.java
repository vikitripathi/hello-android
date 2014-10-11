package com.example.mdglecture;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class AnimationClass extends Activity{

	private AnimationDrawable frameAnimation;
	private ImageView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.animation_view);

		// Type casting the Image View
		view = (ImageView) findViewById(R.id.imageAnimation);

		// Setting animation_list.xml as the background of the image view
		view.setBackgroundResource(R.drawable.frame_animation_list);

		// Type casting the Animation drawable
		frameAnimation = (AnimationDrawable) view.getBackground();
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		if (hasFocus) {
			// Start animation when in Focus
			frameAnimation.start();
		} else {
			// stop animation when not in Focus
			frameAnimation.stop();
		}
	}
}
