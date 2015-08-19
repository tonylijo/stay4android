package com.zixing.phil.dealing;

import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;

public class URLSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String text = "������￴���Ķ�ȥ...�ٵ�����￴���أ�";
		
		URLSpan us = new URLSpan("http://www.google.com");
		Parcel p = Parcel.obtain();
		p.writeString("http://www.sina.com.cn");
		p.setDataPosition(0);
		URLSpan us2 = new URLSpan(p);
		Spannable spn = SpannableStringBuilder.valueOf(text);
		spn.setSpan(us, 2, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(us2, 15, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setMovementMethod(LinkMovementMethod.getInstance());
		txtResult.setText(spn);
		
		String intro = "URLSpan�����Դ�һ�����ӡ��������캯����\n" +
				"URLSpan(String url)������url�����ӵ�ַ��\n" +
				"URLSpan(Parcel src)������src���������ӵ�ַ��Ϣ�İ�װ�࣬ʹ�����£�\n" +
				"Parcel p = Parcel.obtain();\n"+
				"p.writeString(\"http://www.sina.com.cn\");\n"+
				"p.setDataPosition(0);\n"+
				"URLSpan us = new URLSpan(p);";
		txtIntro.setText(intro);
	}
	
}
