package com.zixing.phil.dealing;

import android.content.Context;
import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.TypefaceSpan;
import android.widget.TextView;

public class TypefaceSpanDealing {
	
	public static void show(Context ctx, TextView txtResult,TextView txtIntro){
		String text1 = "The font is a strange thing.\n";
		String text2 = "The font is a strange thing.\n";
		String text3 = "The font is a strange thing.";
		int l1 = text1.length(),l2 = text2.length(),l3 = text3.length();
		
		TypefaceSpan tsSANS_SERIF = new TypefaceSpan("SANS_SERIF");
		TypefaceSpan tsMONOSPACE = new TypefaceSpan("MONOSPACE");
		Parcel p = Parcel.obtain();
		p.writeString("SERIF");
		p.setDataPosition(0);
		TypefaceSpan tsSERIF = new TypefaceSpan(p);
		Spannable spn = SpannableStringBuilder.valueOf(text1+text2+text3);
		spn.setSpan(tsSANS_SERIF, 0, l1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(tsMONOSPACE, l1, l1+l2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(tsSERIF, l1+l2, l1+l2+l3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setTextSize(18);
		txtResult.setText(spn);
		
		String intro = "TypefaceSpan��������ʽ���������ò�ͬ�����壬����ϵͳ�Դ���SANS_SERIF��MONOSPACE��SERIF�����캯����\n" +
				"TypefaceSpan(String family)������family�������ֵ�����ַ�����ʾ��\n" +
				"TypefaceSpan(Parcel src)�� ����src����������family��Ϣ�İ�װ�࣬ʹ�����£�\n" +
				"Parcel p = Parcel.obtain();\n"+
				"p.writeString(\"SERIF\");\n"+
				"p.setDataPosition(0);\n"+
				"TypefaceSpan ts = new TypefaceSpan(p);";
		txtIntro.setText(intro);
	}
	
}
