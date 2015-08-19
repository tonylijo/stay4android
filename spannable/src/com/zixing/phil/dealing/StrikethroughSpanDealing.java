package com.zixing.phil.dealing;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;

public class StrikethroughSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String sentence = "StrikethroughSpan is a line at the vertical middle position in the text.";
		int l1 = sentence.length();
		
		StrikethroughSpan ss = new StrikethroughSpan();
		Spannable spn = SpannableStringBuilder.valueOf(sentence);
		spn.setSpan(ss, 40, l1,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "StrikethroughSpan��ɾ������ʽ���������������캯����\n" +
				"StrikethroughSpan()��SrickkethroughSapn(Parcel src)�����в����Ĺ��캯����δ��src����������\n" +
				"public StrikethroughSpan(Parcel src) {\n"+
				"}\n������������캯����ȫ��ͬ����Ч����";
		txtIntro.setText(intro);
	}
	
}
