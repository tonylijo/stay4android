package com.zixing.phil.dealing;

import android.graphics.Color;
import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class ForegroundColorSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String strDefault = "Ĭ����ɫ����ɫ";
		String strGreen = "��ɫ����";
		String strOrange = "��ɫ����";
		int l1 = strDefault.length(),l2 = strGreen.length(),l3 = strOrange.length();
		
		ForegroundColorSpan fcsGreen = new ForegroundColorSpan(Color.rgb(0x00, 0xff, 0x00));
		Parcel p = Parcel.obtain();
		p.writeInt(Color.YELLOW);
		p.setDataPosition(0);
		ForegroundColorSpan fcsYellow = new ForegroundColorSpan(p);
		Spannable spn = SpannableStringBuilder.valueOf(strDefault+strGreen+strOrange);
		spn.setSpan(fcsGreen, l1, l1+l2, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
		spn.setSpan(fcsYellow, l1+l2, l1+l2+l3, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "ForegroundColorSpan��������ɫ��ʽ�����ڸı�������ɫ���������������캯����\n" +
				"ForegroundColorSpan(int color)\nForegroundColorSpan(Parcel src)\n" +
				"ForegroundColorSpan(int color)������color��������ɫ��\n" +
				"ForegroundColorSpan(Parcel src)������src������������ɫ��Ϣ�İ�װ�࣬ʹ�����£�\n" +
				"Parcel p = Parcel.obtain();\n"+
				"p.writeInt(Color.YELLOW);\n"+
				"p.setDataPosition(0);\n"+
				"ForegroundColorSpan fcs = new ForegroundColorSpan(p);";
		txtIntro.setText(intro);
	}
	
}
