package com.farhan.happytrip.activities;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public abstract class MainActivity extends FragmentActivity {

	protected Context context;
	protected Menu menu;
	private ActionBar actionBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		this.context = MainActivity.this;		
		this.actionBar = getActionBar();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		this.menu = menu;
		return true;
	}
	
	protected void setTitle(int resId,boolean showHomeEnabled)
	{
		if(this.actionBar == null)
			return;
		
		actionBar.setTitle(resId);
		actionBar.setDisplayHomeAsUpEnabled(showHomeEnabled);
	}
	
	protected void setTitle(String title,boolean showHomeEnabled)
	{
		if(this.actionBar == null)
			return;
		
		actionBar.setTitle(title);
		actionBar.setDisplayHomeAsUpEnabled(showHomeEnabled);
	}
	
	

}
