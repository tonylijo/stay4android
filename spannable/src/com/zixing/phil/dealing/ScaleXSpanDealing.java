package com.zixing.phil.dealing;

import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ScaleXSpan;
import android.widget.TextView;

public class ScaleXSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String sentence1 = "�º���ɸߣ�(0.5f)\n";
		String sentence2 = "����ҹ���ӡ�(1.0f)\n";
		String sentence3 = "����������(2.5f)\n";
		String sentence4 = "��ѩ��������(��׼)";
		int l1 = sentence1.length(),l2 = sentence2.length(),l3 = sentence3.length();
		
		ScaleXSpan rss1 = new ScaleXSpan(0.5f);
		ScaleXSpan rss2 = new ScaleXSpan(1.0f);
		Parcel p = Parcel.obtain();
		p.writeFloat(2.5f);
		p.setDataPosition(0);
		ScaleXSpan rss3 = new ScaleXSpan(p);
		Spannable spn = SpannableStringBuilder.valueOf(sentence1+sentence2+sentence3+sentence4);
		spn.setSpan(rss1, 0, l1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(rss2, l1, l1+l2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(rss3, l1+l2, l1+l2+l3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "ScaleXSpan������������ʽ�������尴�������к������š����캯����\n" +
				"ScaleXSpan(float proportion)������proportion�����ű���������������õĴ�СΪA����ʵ����ʾΪ" +
				"A��proportion��\n" +
				"ScaleXSpan(Parcel src)������src�����������ű�����Ϣ�İ�װ�ࡣʹ�ã�\n" +
				"Parcel p = Parcel.obtain();\n"+
				"p.writeFloat(2.5f);\n"+
				"p.setDataPosition(0);\n"+
				"ScaleXSpan rss = new ScaleXSpan(p);";
		txtIntro.setText(intro);
	}
	
}
