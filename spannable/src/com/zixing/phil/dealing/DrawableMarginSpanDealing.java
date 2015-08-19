package com.zixing.phil.dealing;

import com.zixing.phil.spanablestring.R;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.DrawableMarginSpan;
import android.widget.TextView;

public class DrawableMarginSpanDealing {
	
	public static void show(Context ctx,TextView txtResult,TextView txtIntro){
		String strStart = "no pad text\n";
		String strMiddle = "pad 30px text\n";
		String strEnd = "pad 10px text";
		int l1 = strStart.length(),l2 = strMiddle.length(),l3 = strEnd.length();
		DrawableMarginSpan dms = new DrawableMarginSpan(ctx.getResources().getDrawable(R.drawable.joke));
		DrawableMarginSpan dmsMargin = new DrawableMarginSpan(ctx.getResources().getDrawable(R.drawable.flower), 30);
		DrawableMarginSpan dmsBottom = new DrawableMarginSpan(ctx.getResources().getDrawable(R.drawable.ic_launcher),10);
		Spannable spn = SpannableStringBuilder.valueOf(strStart+strMiddle+strEnd);
		spn.setSpan(dms, 0, l1, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
		spn.setSpan(dmsMargin, l1, l1+l2, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
		spn.setSpan(dmsBottom, l1+l2, l1+l2+l3, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "DrawableMarginSpan��ͼƬ+Margin��ʽ���������������캯����\nDrawableMarginSpan(Drawable b)��\n" +
				"DrawableMarginSpan(Drawable b,int pad)\n" +
				"DrawableMarginSpan(Drawable b)������b��������ʾ��ͼƬ��\n" +
				"DrawableMarginSpan(Drawable b,int pad)������b��������ʾ��ͼƬ������pad��ͼƬ�����ֵľ��롣\n" +
				"˵����\n��setSpanʱ��ע�������ֻ�Բ���start��end֮����ı������ã������ʹ�û��з����ʵ��ָ�����ײ������ֺ�ͼƬ" +
				"���ص�������";
		txtIntro.setText(intro);
	}
	
}
