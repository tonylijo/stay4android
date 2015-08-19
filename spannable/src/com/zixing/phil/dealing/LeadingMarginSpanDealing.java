package com.zixing.phil.dealing;

import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan.Standard;
import android.widget.TextView;

public class LeadingMarginSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String s1 = "�ı�����--����һ�����������Ĺ���......";
		String s2 = "���ϵ�1942--���ҵ����磬�����޾��ļ�����������";
		String s3 = "����ĺ��ᣬ�Ҿ��ǵ�������ĺ��ᡣ";
		int l1 = s1.length(),l2 = s2.length(),l3 = s3.length();
		
		Parcel p = Parcel.obtain();
		p.writeInt(20);
		p.writeInt(30);
		p.setDataPosition(0);
		
		Standard lms = new Standard(p);
		Spannable spn = SpannableStringBuilder.valueOf(s1+s2+s3);
		spn.setSpan(lms, 0, l1+l2+l3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "LeadingMarginSpan.Standard���ı���������ʽ����3�����캯�����ֱ�Ϊ��\n" +
				"Standard(int arg0)������arg0�����������ء�\n" +
				"Standard(int arg0, int arg1)������arg0���������������أ�arg1��ʣ�������������ء�\n" +
				"Standard(Parcel p)�� ����p������������Ϣ�İ�װ�ࡣ�ڹ���ʱ��\n"+
				"public Standard(Parcel src) {\n"+
				"\tmFirst = src.readInt();\n"+
				"\tmRest = src.readInt();\n"+
				"}\n" +
				"ʹ�÷�ʽ��\n" +
				"Parcel p = Parcel.obtain();\n"+
				"p.writeInt(20);\n"+
				"p.writeInt(30);\n"+
				"p.setDataPosition(0);\n" +
				"Standard lms = new Standard(p);";
		txtIntro.setText(intro);
	}
	
}
