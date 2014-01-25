package com.farhan.happytrip.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import me.farhan.db.happytrip.Expenditure;

public class ExpenditureAdapter extends MainAdapter<Expenditure> 
{

	public ExpenditureAdapter(Context context, List<Expenditure> items) {
		super(context, items);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		return null;
	}

}
