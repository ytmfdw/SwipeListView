package com.ytmfdw.swipemenulib;

import android.content.Context;

/**
 * dp 与px 互转的工具类
 * 
 * @author yangdan
 */
public class DensityUtil {
	/**
	 * dip转换像素px
	 */
	public static int dip2px(Context mContext, float dpValue) {
		try {
			final float scale = mContext.getResources().getDisplayMetrics().density;
			return (int) (dpValue * scale + 0.5f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (int) dpValue;
	}

	/**
	 * 像素px转换为dip
	 */
	public static int px2dip(Context context, float pxValue) {
		try {
			final float scale = context.getResources().getDisplayMetrics().density;
			LogUtil.e("scale:" + scale);
			return (int) (pxValue / scale + 0.5f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (int) pxValue;
	}

	/**
	 * 得到设备屏幕的宽度
	 */
	public static int getScreenWidth(Context context) {
		return context.getResources().getDisplayMetrics().widthPixels;
	}

	/**
	 * 得到设备屏幕的高度
	 */
	public static int getScreenHeight(Context context) {
		return context.getResources().getDisplayMetrics().heightPixels;
	}

	/**
	 * 得到设备的密度
	 */
	public static float getScreenDensity(Context context) {
		return context.getResources().getDisplayMetrics().density;
	}
}
