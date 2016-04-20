package com.ui;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Toast;

import com.ytmfdw.swipemenulib.DensityUtil;
import com.ytmfdw.swipemenulib.LogUtil;
import com.ytmfdw.swipemenulib.SwipeMenu;
import com.ytmfdw.swipemenulib.SwipeMenuCreator;
import com.ytmfdw.swipemenulib.SwipeMenuItem;
import com.ytmfdw.swipemenulib.SwipeMenuListView;
import com.ytmfdw.swipemenulistview.R;

public class MainActivity extends Activity {

	SwipeMenuListView mListview;
	MyAdapter mAdapter;

	String[] datas = { "瓜丝儿", "山鸡丁儿", "拌海蜇", "龙须菜", "炝冬笋", "玉兰片", "浇鸳鸯", "烧鱼头",
			"烧槟子", "烧百合", "炸豆腐", "炸面筋", "糖熘 儿", "拔丝山药", "糖焖莲子", "酿山药", "杏仁酪",
			"小炒螃蟹", "氽大甲", "什锦葛仙米", "蛤蟆鱼", "扒带鱼", "海鲫鱼", "黄花鱼", "扒海参", "扒燕窝",
			"扒鸡腿儿", "扒鸡块儿", "扒肉", "扒面筋", "扒三样儿", "油泼肉", "酱泼肉", "炒虾黄儿", "熘蟹黄儿",
			"炒子蟹", "佛手海参", "炒芡子米", "奶汤", "翅子汤", "三丝汤", "熏斑鸠", "卤斑鸠", "海白米",
			"烩腰丁儿", "火烧茨菰", "炸鹿尾儿", "焖鱼头", "拌皮渣儿", "氽肥肠儿", "清拌粉皮儿", "木须菜",
			"烹丁香", "烹大肉", "烹白肉", "麻辣野鸡", "咸肉丝儿", "白肉丝儿", "荸荠", "一品锅", "素炝春不老",
			"清焖莲子", "酸黄菜", "烧萝卜", "烩银耳", "炒银枝儿", "八宝榛子酱", "黄鱼锅子", " 白菜锅子",
			"什锦锅子", "汤圆子锅", "菊花锅子", "煮饽饽锅子", "肉丁辣酱", "炒肉丝儿", "炒肉片", "烩酸菜",
			"烩白菜", "烩豌豆", "焖扁豆", "氽毛豆", "外加腌苤蓝丝儿" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mListview = (SwipeMenuListView) findViewById(R.id.listview);
		mAdapter = new MyAdapter(this);
		mListview.setAdapter(mAdapter);
		setSwipMenu();
		mAdapter.setDatas(datas);
		mAdapter.notifyDataSetChanged();
	}

	private void setSwipMenu() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		// step 1. create a MenuCreator
		SwipeMenuCreator creator = new SwipeMenuCreator() {

			@Override
			public void create(SwipeMenu menu) {
				// Create different menus depending on the view type
				switch (menu.getViewType()) {
				case MyAdapter.ITEM_TYPE_NONE: {
					createMenuNONE(menu);
				}
					break;
				case MyAdapter.ITEM_TYPE_CALLUP: {
					createMenuCALLUP(menu);
				}
					break;
				case MyAdapter.ITEM_TYPE_REMARK: {
					createMenuREMARK(menu);
				}
					break;
				case MyAdapter.ITEM_TYPE_UNCALLUP: {
					createMenuUNCALLUP(menu);
				}
					break;
				}
			}

			private void createMenuNONE(SwipeMenu menu) {
			}

			private void createMenuCALLUP(SwipeMenu menu) {
				// 获取菜品

				SwipeMenuItem item1 = new SwipeMenuItem(getApplicationContext());
				item1.setBackground(new ColorDrawable(Color.rgb(0xFF, 0xA6,
						0xA6)));
				item1.setWidth(DensityUtil.dip2px(MainActivity.this, 75));
				item1.setTitle("退 菜");
				item1.setTitleSize(getResources().getInteger(
						R.integer.swipe_menu_textsize));
				item1.setTitleColor(Color.WHITE);
				menu.addMenuItem(item1);
				// ========================
				SwipeMenuItem item2 = new SwipeMenuItem(getApplicationContext());
				item2.setBackground(new ColorDrawable(Color.rgb(0xFF, 0x8B,
						0x8B)));
				item2.setWidth(DensityUtil.dip2px(MainActivity.this, 75));
				item2.setTitle("催 菜");
				item2.setTitleSize(getResources().getInteger(
						R.integer.swipe_menu_textsize));
				item2.setTitleColor(Color.WHITE);
				menu.addMenuItem(item2);
			}

			private void createMenuREMARK(SwipeMenu menu) {
				// 获取菜品
				SwipeMenuItem item1 = new SwipeMenuItem(getApplicationContext());
				item1.setBackground(new ColorDrawable(Color.rgb(0xFF, 0xA6,
						0xA6)));
				item1.setWidth(DensityUtil.dip2px(MainActivity.this, 75));
				item1.setTitle("退 菜");
				item1.setTitleSize(getResources().getInteger(
						R.integer.swipe_menu_textsize));
				item1.setTitleColor(Color.WHITE);
				menu.addMenuItem(item1);

			}

			private void createMenuUNCALLUP(SwipeMenu menu) {
				// 获取菜品
				SwipeMenuItem item1 = new SwipeMenuItem(getApplicationContext());
				item1.setBackground(new ColorDrawable(Color.rgb(0xFF, 0xA6,
						0xA6)));
				item1.setWidth(DensityUtil.dip2px(MainActivity.this, 75));
				item1.setTitle("退 菜");
				item1.setTitleSize(getResources().getInteger(
						R.integer.swipe_menu_textsize));
				item1.setTitleColor(Color.WHITE);
				menu.addMenuItem(item1);
				// ================================
				SwipeMenuItem item2 = new SwipeMenuItem(getApplicationContext());
				item2.setBackground(new ColorDrawable(Color.rgb(0xFF, 0x8B,
						0x8B)));
				item2.setWidth(DensityUtil.dip2px(MainActivity.this, 75));
				item2.setTitle("催 菜");
				item2.setTitleSize(getResources().getInteger(
						R.integer.swipe_menu_textsize));
				item2.setTitleColor(Color.WHITE);
				menu.addMenuItem(item2);
				// ============================
				SwipeMenuItem item3 = new SwipeMenuItem(getApplicationContext());
				item3.setBackground(new ColorDrawable(Color.rgb(0xFF, 0x74,
						0x74)));
				item3.setWidth(DensityUtil.dip2px(MainActivity.this, 75));
				item3.setTitle("划 菜");
				item3.setTitleSize(getResources().getInteger(
						R.integer.swipe_menu_textsize));
				item3.setTitleColor(Color.WHITE);
				int count = 185;
				item3.setCount(count + "");
				LogUtil.d("set 划菜 count=" + count);
				menu.addMenuItem(item3);
			}

		};
		// set creator
		mListview.setMenuCreator(creator);

		// step 2. listener item click event
		mListview
				.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
					@Override
					public boolean onMenuItemClick(int position,
							SwipeMenu menu, int index) {

						switch (mAdapter.getItemViewType(position)) {
						case MyAdapter.ITEM_TYPE_NONE: {
							// 不做任何操作
						}
							break;
						case MyAdapter.ITEM_TYPE_CALLUP: {
							// 退菜","催菜","划菜","起菜
							switch (index) {
							case 0: {
								toast("CALLUP 退菜");

							}

								break;
							case 1: {
								toast("CALLUP 催菜");

							}
								break;

							case 2: {
								toast("CALLUP　起菜");

							}
								break;
							}
						}
							break;
						case MyAdapter.ITEM_TYPE_REMARK: {
							// 退菜
							toast("REMARK 退菜");

						}
							break;
						case MyAdapter.ITEM_TYPE_UNCALLUP: {
							// 退菜","催菜","划菜
							switch (index) {
							case 0: {
								toast("UNCALLUP 退菜");

							}

								break;
							case 1: {
								toast("UNCALLUP 催菜");

							}
								break;
							case 2: {
								toast("UNCALLUP 划菜");

							}
								break;

							}
						}
							break;
						}
						// return false,关闭左滑菜单，true,不关闭
						return false;
					}
				});

	}

	private void toast(String str) {
		Toast.makeText(this, str, Toast.LENGTH_LONG).show();
		;
	}

}
