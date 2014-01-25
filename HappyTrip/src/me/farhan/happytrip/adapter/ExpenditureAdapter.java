package me.farhan.happytrip.adapter;

import java.util.List;

import com.farhan.happytrip.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import me.farhan.db.happytrip.Expenditure;

public class ExpenditureAdapter extends MainAdapter<Expenditure>  implements OnClickListener
{

	public ExpenditureAdapter(Context context, List<Expenditure> items) {
		super(context, items);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		Expenditure expenditure = items.get(position);
		ViewHolder viewHolder = null;
		if(convertView == null)
		{
			convertView = layoutInflater.inflate(R.layout.expense_row, null);			
			
			viewHolder = new ViewHolder();
			viewHolder.tvCost = (TextView) convertView.findViewById(R.id.tv_expense_row_cost);
			viewHolder.tvPayer = (TextView) convertView.findViewById(R.id.tv_expense_row_payer_name);
			viewHolder.tvDateTime = (TextView) convertView.findViewById(R.id.tv_expense_row_date_time);
			viewHolder.tvNote = (TextView) convertView.findViewById(R.id.tv_expense_row_note);
			viewHolder.btnOptions = (Button) convertView.findViewById(R.id.btn_expense_row_options);
			viewHolder.btnOptions.setOnClickListener(this);
			convertView.setTag(viewHolder);
			
		}else 
			viewHolder = (ViewHolder) convertView.getTag();		
		
		if(expenditure != null)
		{
			viewHolder.tvCost.setText(String.valueOf(expenditure.getCost()));
			viewHolder.tvPayer.setText(expenditure.getPayer() == null ? "" : expenditure.getPayer().getName());	
			viewHolder.tvDateTime.setText(expenditure.getDateTime());
			viewHolder.tvNote.setText(expenditure.getNote());
			viewHolder.btnOptions.setTag(position);
		}
		
		return convertView;
	}
	
	private class ViewHolder
	{
		TextView tvCost;
		TextView tvPayer;
		TextView tvDateTime;
		TextView tvNote;
		Button btnOptions;
	}

	@Override
	public void onClick(View v) 
	{
		
	}

}
