package com.farhan.happytrip.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.farhan.happytrip.R;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_trip);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
