package com.zixing.phil.dealing;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.SubscriptSpan;
import android.widget.TextView;

public class SubscriptSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String text = "Cu2(OH)2CO3-��ʽ̼��ͭ";
		
		Spannable spn = SpannableStringBuilder.valueOf(text);
		spn.setSpan(new SubscriptSpan(), 2, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(new SubscriptSpan(), 7, 8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(new SubscriptSpan(), 10, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "SubscriptSpan,��ע��ʽ�����绯ѧʽ�ĳ���д������Ȼ�������ԶԽ�ע��������һ�������š����캯����\n" +
				"SubscriptSpan()���޲ι��졣\n" +
				"SubscriptSpan(Parcel src)��һ�ι��죬����src��δ���κ����ã�Դ����Ϊ��\n"+
				"public SuperscriptSpan(Parcel src) {\n"+
				"}";
		txtIntro.setText(intro);
	}
	
}
