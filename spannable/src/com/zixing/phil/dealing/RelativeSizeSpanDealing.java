package com.zixing.phil.dealing;

import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.widget.TextView;

public class RelativeSizeSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String sentence1 = "�羢�ǹ�����������μ�ǡ�(0.5f)\n";
		String sentence2 = "�ݿ�ӥ�ۼ���ѩ�������ᡣ(1.0f)\n";
		String sentence3 = "�����·��У�����ϸ��Ӫ��(1.5f)\n";
		String sentence4 = "�ؿ���񴦣�ǧ��ĺ��ƽ��(Ĭ��)";
		int l1 = sentence1.length(),l2 = sentence2.length(),l3 = sentence3.length();
		
		RelativeSizeSpan rss1 = new RelativeSizeSpan(0.5f);
		RelativeSizeSpan rss2 = new RelativeSizeSpan(1.0f);
		Parcel p = Parcel.obtain();
		p.writeFloat(1.5f);
		p.setDataPosition(0);
		RelativeSizeSpan rss3 = new RelativeSizeSpan(p);
		Spannable spn = SpannableStringBuilder.valueOf(sentence1+sentence2+sentence3+sentence4);
		spn.setSpan(rss1, 0, l1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(rss2, l1, l1+l2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(rss3, l1+l2, l1+l2+l3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro ="RelativeSizeSpan����Դ�С��ָ������ı��趨�Ĵ�С����Ա��������û���趨�����ϵͳĬ��ֵ��" +
				"�������������캯����\n" +
				"RelativeSizeSpan(float proportion)������proportion������ֵ����������趨��СΪA������ʾ������" +
				"��СΪA��proportion��\n" +
				"RelativeSizeSpan(Parcel src)������src�������˱���ֵ��Ϣ�İ�װ�ࡣʹ�ã�\n" +
				"Parcel p = Parcel.obtain();\n"+
				"p.writeFloat(2.5f);\n"+
				"p.setDataPosition(0);\n"+
				"RelativeSizeSpan rss = new RelativeSizeSpan(p);";
		txtIntro.setText(intro);
	}
	
}
