package com.ui;

import java.util.ArrayList;
import java.util.List;

import com.ytmfdw.swipemenulib.LogUtil;
import com.ytmfdw.swipemenulistview.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	/**
	 * 默认状态、退菜状态
	 */
	public static final int ITEM_TYPE_NONE = 0x00;
	/**
	 * 叫起状态，退菜、起菜、催菜
	 */
	public static final int ITEM_TYPE_CALLUP = 0x01;
	/**
	 * 划菜状态，退菜
	 */
	public static final int ITEM_TYPE_REMARK = 0x02;
	/**
	 * 没叫起菜品，退菜、催菜、划菜
	 */
	public static final int ITEM_TYPE_UNCALLUP = 0x03;

	private List<String> datas;

	LayoutInflater inflater;

	public MyAdapter(Context mContext) {
		// TODO Auto-generated constructor stub
		inflater = LayoutInflater.from(mContext);
		datas = new ArrayList<String>();
	}

	public MyAdapter(Context mContext, String[] data) {
		// TODO Auto-generated constructor stub
		inflater = LayoutInflater.from(mContext);
		datas = new ArrayList<String>();
		if (data != null) {
			for (String tmp : data) {
				datas.add(tmp);
			}
		}
	}

	public void setDatas(String[] data) {
		if (data != null) {
			if (datas == null) {
				datas = new ArrayList<String>();
			}
			datas.clear();
			for (String tmp : data) {
				datas.add(tmp);
			}
		}
		notifyDataSetChanged();
	}

	public void setDatas(List<String> datas) {
		this.datas = datas;
		notifyDataSetChanged();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		LogUtil.d("getCount" + datas.size());
		return datas.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return datas.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getViewTypeCount() {
		// menu type count
		return 4;
	}

	@Override
	public int getItemViewType(int position) {
		// current menu type

		return position % 4;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder viewHolder = null;
		if (convertView == null) {
			viewHolder = new ViewHolder();
			convertView = View
					.inflate(parent.getContext(), R.layout.item, null);
			viewHolder.tv = (TextView) convertView.findViewById(R.id.tv_name);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		viewHolder.tv.setText(datas.get(position));
		return convertView;
	}

	static class ViewHolder {
		TextView tv;
	}

}
