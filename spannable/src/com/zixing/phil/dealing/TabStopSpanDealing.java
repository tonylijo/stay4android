package com.zixing.phil.dealing;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.TabStopSpan.Standard;
import android.widget.TextView;

public class TabStopSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String para1 = "\t(����ƫ��50)��ڤ���㣬\t����Ϊ���֮�󣬲�֪�伸ǧ��Ҳ������Ϊ������Ϊ����\r\n";
		String para2 = "\t(����δƫ��)��֮������֪\t�伸ǧ��Ҳ��ŭ���ɣ�����������֮�ơ�����Ҳ��������������ڤ��" +
				"��ڤ�ߣ����Ҳ�� ";
		
		Standard tss = new Standard(50);
		Spannable spn = SpannableStringBuilder.valueOf(para1+para2);
		spn.setSpan(tss, 0, para1.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "TabStopSpan.Standard���Ʊ�λƫ����ʽ������ÿ�е�leading margin��ƫ�������ݲ��������м���\\tʱ" +
				"�Ų���Ч�������캯����\n" +
				"TabStopSpan.Standard(int where)������where��ƫ������";
		txtIntro.setText(intro);
	}
	
}
