package com.zixing.phil.dealing;

import android.text.Layout.Alignment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AlignmentSpan.Standard;
import android.widget.TextView;

public class AlignmentSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		Standard asCenter = new Standard(Alignment.ALIGN_CENTER);
		Standard asNormal = new Standard(Alignment.ALIGN_NORMAL);
		Standard asOpposite = new Standard(Alignment.ALIGN_OPPOSITE);
		String strCenter = "align center\n";
		String strNormal = "align normal\n";
		String strOpposite = "align opposite";
		
		int l1 = strCenter.length(),l2 = strNormal.length(),l3 = strOpposite.length();
		Spannable spn = SpannableStringBuilder.valueOf(strCenter+strNormal+strOpposite);
		spn.setSpan(asCenter, 0, l1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		spn.setSpan(asNormal, l1, l1+l2, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		spn.setSpan(asOpposite, l1+l2, l1+l2+l3, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro="AlignmentSpan.Standard����׼�ı�������ʽ���������������캯����AlignmentSpan.Standard(Layout.Alignment align)��" +
				"AlignmentSpan.Standard(Parcel src)��\nAlignmentSpan.Standard(Layout.Alignment align)������align��Layout.Alignment���͵�ö��ֵ��" +
				"�������С��������෴���������\n" +
				"AlignmentSpan.Standard(Parcel src)������src�������б�׼�ַ�����Parcel�࣬��ֵӦΪ\"ALIGN_CENTER\"��\"ALIGN_NORMAL\"��\"ALIGN_OPPOSITE\"�е�֮һ��" +
				"��ӦLayout.Alignmentö���е��������͡�ʹ��ʾ����\n" +
				"Parcel p = Parcel.obtain();\n"+
				"p.writeString(\"ALIGN_CENTER\");\n"+
				"p.setDataPosition(0);\n" +
				"AlignmentSpan.Standard standard = new AlignmentSpan.Standard(p);";
		txtIntro.setText(intro);
	}
	
}
