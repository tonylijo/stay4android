package com.zixing.phil.dealing;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.widget.TextView;

public class AbsoluteSizeSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String standard = "��׼����";
		String big = "25px����";
		String small = "10px����";
		
		Spannable spn = SpannableStringBuilder.valueOf(small+standard+big);
		AbsoluteSizeSpan ass25 = new AbsoluteSizeSpan(25);
		AbsoluteSizeSpan ass10 = new AbsoluteSizeSpan(10);
		spn.setSpan(ass10, 0, small.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		spn.setSpan(ass25, small.length()+standard.length(), small.length()+standard.length()+big.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);

		String intro ="����˼�壬AbsoluteSizeSpan��ָ���Գߴ磬ͨ��ָ�����Գߴ����ı��ı��������С��\n�������������캯����\n" +
				"AbsoluteSizeSpan(int size)��AbsoluteSizeSpan(int size, boolean dip)��AbsoluteSizeSpan(Parcel src)��\n" +
				"AbsoluteSizeSpan(int size)������size��Set the text size to size physical pixels. ��size��ָ��������ֵ���趨�ı���С��\n" +
				"AbsoluteSizeSpan(int size, boolean dip)������size��Set the text size to size physical pixels, or to size device-independent pixels if dip is true." +
				"��size��ָ������ֵ���趨�ı���С���������dipΪtrue����sizeָ����dipΪֵ���趨�ı���С��\n" +
				"AbsoluteSizeSpan(Parcel src)������src��������size��dipֵ�İ�װ�ࡣ�ڸù�����\n"+
				"public AbsoluteSizeSpan(Parcel src) {\n"+
				"\tmSize = src.readInt();\n"+
				"\tmDip = src.readInt() != 0;\n"+
				"}\nʹ�÷�����\nParcel p = Parcel.obtain();\n"+
				"p.writeInt(29);//�����С\n"+
				"p.writeInt(8);//�Ƿ���dip��λ\n"+
				"p.setDataPosition(0);\n"+
				"AbsoluteSizeSpan ass = new AbsoluteSizeSpan(p);";
		txtIntro.setText(intro);
	}
	
}
