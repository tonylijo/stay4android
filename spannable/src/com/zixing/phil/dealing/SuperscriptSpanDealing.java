package com.zixing.phil.dealing;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.SuperscriptSpan;
import android.widget.TextView;

public class SuperscriptSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String text =  "23 + 34= 89 ����2��3�η���3��4�η�����89.";
		
		Spannable spn = SpannableStringBuilder.valueOf(text);
		spn.setSpan(new SuperscriptSpan(), 1, 2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(new SuperscriptSpan(), 6, 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "SuperscriptSpan���ϱ���ʽ��������ѧ�ϵĴη����㣬��Ȼ�������Զ��ϱ����ֽ������š����캯����\n" +
				"SuperscriptSpan()���޲ι��졣\n" +
				"SuperscriptSpan(Parcel src)��һ�ι��죬����src��δ���κ����ã�Դ����Ϊ��\n"+
				"public SuperscriptSpan(Parcel src) {\n"+
				"}";
		txtIntro.setText(intro);
	}
	
}
