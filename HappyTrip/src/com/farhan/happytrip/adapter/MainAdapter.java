package com.farhan.happytrip.adapter;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;


public abstract class MainAdapter<T> extends BaseAdapter {

	protected LayoutInflater layoutInflater;
	protected Context context;
	protected List<T> items;

	public static final String TAG = "com.farhan.happytrip.adapter.MainAdapter";

	public MainAdapter(Context context, List<T> items) 
	{
		this.context = context;
		this.items = items;
		this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	public void appendItem(T item) 
	{
		if(item != null)
		{
			this.items.add(item);
			notifyDataSetChanged();
		}	
	}

	public boolean removeItem(T item) 
	{
		boolean isRemoved = false;
		if(item != null)
		{
			isRemoved = this.items.remove(item);
			notifyDataSetChanged();
		}
		return isRemoved;
	}

	public void clear()
	{
		this.items.clear();
		notifyDataSetChanged();		
	}
	
	public void reload(List<T> items)
	{
		this.items.clear();
		if(items != null)
		{
			this.items.addAll(items);
		}
		notifyDataSetChanged();		
	}
	
	public void removeItem(int pos) 
	{
		try {

			this.items.remove(pos);
			notifyDataSetChanged();

		} catch (IndexOutOfBoundsException e) 
		{
			Log.e(TAG, e.getMessage());			
		}

	}

	@Override
	public int getCount() {

		return this.items.size();
	}

	@Override
	public T getItem(int pos) 
	{		
		return this.items.get(pos);
	}

	@Override
	public long getItemId(int position) 
	{		
		return position;
	}


}
