package me.farhan.happytrip.adapter;

import java.util.List;

import me.farhan.db.happytrip.Member;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.farhan.happytrip.R;

public class MemberListAdapter extends MainAdapter<Member> implements OnClickListener
{

	public MemberListAdapter(Context context, List<Member> items) {
		super(context, items);

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		Member member = getItem(position);
		ViewHolder viewHolder = null;
		if(convertView == null)
		{
			convertView = layoutInflater.inflate(R.layout.member_row, null);
			viewHolder = new ViewHolder();

			viewHolder.tvName = (TextView) convertView.findViewById(R.id.tv_member_row_name);
			viewHolder.tvMobileNo = (TextView) convertView.findViewById(R.id.tv_member_row_mobile);
			viewHolder.btnOptions = (Button) convertView.findViewById(R.id.btn_member_row_options);
			viewHolder.btnOptions.setOnClickListener(this);
			convertView.setTag(viewHolder);			

		}else 
			viewHolder = (ViewHolder)convertView.getTag();			

		if(member != null)
		{
			viewHolder.tvName.setText(member.getName());
			viewHolder.tvMobileNo.setText(member.getMobileNo());
			viewHolder.btnOptions.setTag(position);
		}
		
		return convertView;
	}

	private class ViewHolder{
		TextView tvName;
		TextView tvMobileNo;
		TextView tvEmail;
		Button btnOptions;
	}

	@Override
	public void onClick(View v) 
	{	
		

	}


}
