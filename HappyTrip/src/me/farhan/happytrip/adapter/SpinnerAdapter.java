package me.farhan.happytrip.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import me.farhan.db.happytrip.ISpinner;
import me.farhan.happytrip.R;

public class SpinnerAdapter extends MainAdapter<ISpinner>
{

	public SpinnerAdapter(Context context, List<ISpinner> items) {
		super(context, items);

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		return  getCustomView(position, convertView, parent);
	}

	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) 
	{
		return getCustomView(position, convertView, parent);
	}


	private View getCustomView(int position, View convertView, ViewGroup parent)
	{
		ISpinner spinnerValue = getItem(position);
		TextView tvTitle = null;
		if(convertView == null)
		{
			convertView = layoutInflater.inflate(R.layout.spinner_view, null);
			tvTitle = (TextView) convertView.findViewById(R.id.tv_spinner_row_title);
			convertView.setTag(tvTitle);
		}
		else 
			tvTitle = (TextView)convertView.getTag();
		if(spinnerValue != null)
			tvTitle.setText(spinnerValue.getTitle());
		
		return convertView;
	}

}
