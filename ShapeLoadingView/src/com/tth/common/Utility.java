package com.tth.common;

import android.content.Context;

public class Utility {

	/**
	 * dip px 转换
	 * 
	 * @param dipValue
	 * @return
	 */
	public static int dip2px(Context mContext, float dipValue) {
		final float scale = mContext.getResources().getDisplayMetrics().density;
		return (int) (dipValue * scale + 0.5f);
	}
}
