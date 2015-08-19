package com.zixing.phil.dealing;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.widget.TextView;

public class BackgroundColorSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String strBgBlue = "��ɫ����";
		String strBgGray = "��ɫ����";
		String strBgYellow = "��ɫ����";
		int l1 = strBgBlue.length(),l2 = strBgGray.length(),l3 = strBgYellow.length();
		
		BackgroundColorSpan bcsBlue = new BackgroundColorSpan(Color.BLUE);
		BackgroundColorSpan bcsGray = new BackgroundColorSpan(Color.GRAY);
		BackgroundColorSpan bcsYellow = new BackgroundColorSpan(Color.YELLOW);
		Spannable spn = SpannableStringBuilder.valueOf(strBgBlue+strBgGray+strBgYellow);
		spn.setSpan(bcsBlue, 0, l1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		spn.setSpan(bcsGray, l1, l1+l2, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		spn.setSpan(bcsYellow, l1+l2, l1+l2+l3, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "BackgroundColorSpan������ɫ��ʽ����Ȼ���������趨�ı��ı���ɫ���������������캯����" +
				"BackgroundColorSpan(int color)��BackgroundColorSpan(Parcel src)��\n" +
				"BackgroundColorSpan(int color)������color����ɫֵ��\n" +
				"BackgroundColorSpan(Parcel src)������src��������ɫֵ��Ϣ�İ�װ�࣬ʹ�÷�������:\n" +
				"Parcel p = Parcel.obtain();\np.writeInt(Color.GREEN);\np.setDataPosition(0);\n" +
				"BackgroundColorSpan bcs = new BackgroundColorSpan(p);";
		txtIntro.setText(intro);
	}
	
}
