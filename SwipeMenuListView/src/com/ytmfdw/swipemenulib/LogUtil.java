package com.ytmfdw.swipemenulib;

import android.util.Log;

/**
 * 日志操作的工具类
 * 
 * @author yangdan
 * 
 */
public abstract class LogUtil {

	private static final String DEFAULT_TAG = "debug";

	private static final boolean WORK = true;

	/**
	 * 打印调试日志，使用log.d输出，tag 为 debug，可以在logcat中查看
	 * 
	 * @param str
	 */
	public static void d(String str) {
		if (WORK) {
			Log.d(DEFAULT_TAG, str);
		}
	}

	/**
	 * 打印调试日志，使用log.d输出，tag 为 debug，可以在logcat中查看
	 * 
	 * @param clz
	 * @param str
	 */
	public static void d(Class<?> clz, String str) {
		if (WORK) {
			Log.d(DEFAULT_TAG, "[" + clz.getName() + "] " + str);
		}
	}

	/**
	 * 打印调试日志，使用log.d输出，tag 为 debug，可以在logcat中查看
	 * 
	 * @param className
	 * @param str
	 */
	public static void d(String className, String str) {
		if (WORK) {
			Log.d(DEFAULT_TAG, "[" + className + "] " + str);
		}
	}

	/**
	 * 打印错误日志，使用log.e输出，tag 为 debug，可以在logcat中查看
	 * 
	 * @param str
	 */
	public static void e(String str) {
		if (WORK) {
			Log.e(DEFAULT_TAG, str);
		}
	}

	/**
	 * 打印错误日志，使用log.e输出，tag 为 debug，可以在logcat中查看
	 * 
	 * @param clz
	 * @param str
	 */
	public static void e(Class<?> clz, String str) {
		if (WORK) {
			Log.e(DEFAULT_TAG, "[" + clz.getName() + "] " + str);
		}
	}

	/**
	 * 打印错误日志，使用log.e输出，tag 为 debug，可以在logcat中查看
	 * 
	 * @param className
	 * @param str
	 */
	public static void e(String className, String str) {
		if (WORK) {
			Log.e(DEFAULT_TAG, "[" + className + "] " + str);
		}
	}

	/**
	 * 
	 * @param className
	 * @param str
	 */
	public static void w(String className, String str) {
		if (WORK) {
			Log.w(DEFAULT_TAG, "[" + className + "] " + str);
		}
	}

	/**
	 * 系统异常日志
	 * 
	 * @param e
	 */
	public static void ex(Exception e) {
		if (WORK) {
			Log.e(DEFAULT_TAG, String.valueOf(e));
		}
	}

}
