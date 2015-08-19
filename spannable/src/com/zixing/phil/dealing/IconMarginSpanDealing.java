package com.zixing.phil.dealing;

import com.zixing.phil.spanablestring.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.IconMarginSpan;
import android.widget.TextView;

public class IconMarginSpanDealing {
	
	public static void show(Context ctx,TextView txtResult,TextView txtIntro){
		String str1 = "��һ���ı�\n";
		String str2 = "�ڶ����ı�\n";
		String str3 = "�������ı�";
		int l1 = str1.length(),l2 = str2.length(),l3 = str3.length();
		
		Bitmap bmJoke = ((BitmapDrawable)ctx.getResources().getDrawable(R.drawable.joke)).getBitmap();
		IconMarginSpan imsFirst = new IconMarginSpan(bmJoke);
		Bitmap bmFlower = ((BitmapDrawable)ctx.getResources().getDrawable(R.drawable.flower)).getBitmap();
		IconMarginSpan imsSecond = new IconMarginSpan(bmFlower, 30);
		Spannable spn = SpannableStringBuilder.valueOf(str1+str2+str3);
		spn.setSpan(imsFirst, l1, l1+l2, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
		spn.setSpan(imsSecond, l1+l2, l1+l2+l3, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "IconMarginSpan��ͼ��+Margin��ʽ��������DrawableMarginSpanʹ���Ϻ����ơ��������������캯����\n" +
				"IconMarginSpan(Bitmap b)������b��������ʾͼ���bitmap��\n" +
				"IconMarginSpan(Bitmap b,int pad)������b��������ʾͼ���bitmap������pad��Bitmap���ı�֮��ļ�ࡣ";
		txtIntro.setText(intro);
	}
	
}
