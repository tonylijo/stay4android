package com.zixing.phil.dealing;

import android.graphics.Color;
import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.QuoteSpan;
import android.widget.TextView;

public class QuoteSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		 String part1 = "������paddingLeft=10\n";
		 String part2 = "�ڶ����ִ�ǰ���¹⣬���ǵ���˪����ͷ�����£���ͷ˼���硣";
		 String part3 = "��������";
		 int l1 = part1.length(),l2 = part2.length(),l3 = part3.length();
		 
		 Parcel p = Parcel.obtain();
		 p.writeInt(Color.BLACK);
		 p.setDataPosition(0);
		 
		 QuoteSpan qs = new QuoteSpan(p);
		 Spannable spn = SpannableStringBuilder.valueOf(part1+part2+part3);
		 spn.setSpan(qs, 0, l1+l2+l3, 0);
		 txtResult.setPadding(10, 0, 0, 0);
		 txtResult.setText(spn);
		 
		 String intro = "QuoteSpan��������ʽ�����ı�������һ����ʾ���õ����ߣ�������3�����캯����\n" +
		 		"QuoteSpan()���޲ι��죬Ĭ����ɫΪ��ɫ��\n" +
		 		"QuoteSpan(int color)������color����ɫֵ��\n" +
		 		"QuoteSpan(Parcel src)��������ɫֵ��Ϣ�İ�װ�ࡣʹ�ã�\n" +
		 		"Parcel p = Parcel.obtain();\n"+
		 		"p.writeInt(Color.BLACK);\n"+
		 		"p.setDataPosition(0);\n"+
		 		"QuoteSpan qs = new QuoteSpan(p);";
		 txtIntro.setText(intro);
	}
	
}
