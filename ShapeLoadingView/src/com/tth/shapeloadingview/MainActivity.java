package com.tth.shapeloadingview;

import java.util.LinkedList;
import java.util.List;

import com.tth.widget.LoadingView;

import android.app.Activity;
import android.os.Bundle;

/**
 * 
 * @author tangbin
 * 
 */
public class MainActivity extends Activity {
	LoadingView mLoadingView = null;
	List<String> loadingTexts = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mLoadingView = (LoadingView) findViewById(R.id.loadView);
		loadingTexts = new LinkedList<String>();
		loadingTexts.add(" 加载中.      ");
		loadingTexts.add(" 加载中..     ");
		loadingTexts.add(" 加载中...    ");
		// 设置loading底部变化的文字循环播放
		// mLoadingView.setLoadingText(loadingText)
		// settext设置不变化的文字
		mLoadingView.setLoadingTexts(loadingTexts);
	}
}
