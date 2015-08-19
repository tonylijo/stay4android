package com.zixing.phil.dealing;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class UnderlineSpanDealing {
	public static void show(TextView txtResult,TextView txtIntro){
		String sentence1 = "���ܴ�ü������Ȩ��";
		String sentence2 = "ʹ�Ҳ��ÿ����ա�";
		int l1 = sentence1.length(),l2 = sentence2.length();
		
		UnderlineSpan us = new UnderlineSpan();
		Spannable spn = SpannableStringBuilder.valueOf(sentence1+sentence2);
		spn.setSpan(us, l1, l1+l2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "UnderlineSpan���»�����ʽ����һ�����ּ����»��ߡ����캯����\n" +
				"UnderlineSpan()�� �޲ι��졣\n" +
				"UnderlineSpan(Parcel src)��һ�ι��죬 ���޲ι���Ч����ͬ��������δ��src������Դ�룺\n" +
				"public UnderlineSpan(Parcel src) {\n"+
				"}";
		txtIntro.setText(intro);
	}
}
