package com.farhan.happytrip.activities;

import com.farhan.happytrip.R;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MemberActivity extends MainActivity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.member_add_edit);
		init();
	}
	
	private void init()
	{
		setTitle("Add Member", true);
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		getMenuInflater().inflate(R.menu.member, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		
		return super.onOptionsItemSelected(item);
	}

}
