/** 
 * Project Name:YiQiXue 
 * File Name:MyTopTitleLayout.java 
 * Package Name:com.dev.yqx.override
 * Date:2015-11-30上午10:30:00 
 * Copyright (c) 2015, CHINA INSPECTION ANTI-COUNTERFEITING TECHNOLOGY CO., LTD. All Rights Reserved.
 */ 
package com.an.happy.mvprxjava.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.an.happy.mvprxjava.R;


/** 
 * ClassName: TopTitleLayout <br>
 * Description: 公共标题栏. <br>
 * Date: 2015-11-30 上午10:30:00 <br> 
 * 
 * @author yyl 
 * @version  
 * @since JDK 1.7
 */
public class TopTitleView extends FrameLayout {

	private ImageView leftImage; //左边图片
	private ImageView rightImage; //右边图片
	private TextView titleText; //标题
	private TextView rightText; //右边文字
	private TextView leftText; //左边文字
	private LinearLayout mainLyt,leftLyt;
	
	/** 
	 * Creates a new instance of MyTopTitleLayout. 
	 * 
	 * @param context
	 * @param attrs 
	 */
	public TopTitleView(Context context, AttributeSet attrs) {
		super(context, attrs);
		View view = LayoutInflater.from(context).inflate(R.layout.toptitle_view, this);
		leftImage = (ImageView)view.findViewById(R.id.my_title_leftimage);
		rightImage = (ImageView)view.findViewById(R.id.my_title_rightimage);
		titleText = (TextView)view.findViewById(R.id.my_title_text);
		leftText = (TextView)view.findViewById(R.id.my_title_lefttext);
		rightText = (TextView)view.findViewById(R.id.my_title_righttext);
		mainLyt = (LinearLayout)view.findViewById(R.id.my_title_rly_main);
//		leftLyt = (LinearLayout)view.findViewById(R.id.my_title_lyt_left);
	}

	/*
	 * 修改左边图片
	 */
	public void setLeftImage(int src)
	{
		leftImage.setImageResource(src);
		leftImage.setVisibility(VISIBLE);
		rightImage.setVisibility(GONE);
	}
	/*
	 * 修改右边图片
	 */
	public void setRightImage(int src)
	{
		rightImage.setImageResource(src);
		leftImage.setVisibility(GONE);
		rightImage.setVisibility(VISIBLE);
	}
	/*
	 * 修改标题
	 */
	public void setTitleText(String text)
	{
		titleText.setText(text);
	}
	
	/*
	 * 修改背景色
	 */
	public void setBackgroundColor(int color)
	{
		mainLyt.setBackgroundColor(color);
	}

	/**
	 * @return the titleText
	 */
	public TextView getTitleText() {
		return titleText;
	}

	/**
	 * 修改右边文字
	 */
	public void setRightText(String value)
	{
		this.rightText.setText(value);
		rightText.setVisibility(VISIBLE);
		leftText.setVisibility(GONE);
	}

	/**
	 * 修改左边文字
	 */
	public void setLeftText(String value)
	{
		this.leftText.setText(value);
		rightText.setVisibility(GONE);
		leftText.setVisibility(VISIBLE);
	}

	public ImageView getLeftImage() {
		return leftImage;
	}

	public ImageView getRightImage() {
		return rightImage;
	}

	public TextView getRightText() {
		return rightText;
	}

	public TextView getLeftText() {
		return leftText;
	}
}
