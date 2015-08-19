package com.zixing.phil.dealing;

import android.graphics.Color;
import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.widget.TextView;

public class BulletSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String p1 = "the first para.\n";
		String p2 = "the second para.\n";
		String p3 = "parcel para.";
		int l1 = p1.length(),l2 = p2.length(),l3 = p3.length();
		BulletSpan bs1 = new BulletSpan(10,Color.BLUE);
		BulletSpan bs2 = new BulletSpan();
		Parcel p = Parcel.obtain();
		p.writeInt(20);
		p.writeInt(1);
		p.writeInt(Color.YELLOW);
		p.setDataPosition(0);
		BulletSpan bs3 = new BulletSpan(p);
		
		Spannable spn = SpannableStringBuilder.valueOf(p1+p2+p3);
		spn.setSpan(bs1, 0, 1, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		spn.setSpan(bs2, l1, l1+l2, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		spn.setSpan(bs3, l1+l2, l1+l2+l3, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "BulletSpan��������ʽ��������HTML�е�<li>��ǩ��Բ��Ч����\n" +
				"������4�����캯��BulletSpan()��BulletSpan(int gapWidth)��BulletSpan(int gapWidth,int color)��BulletSpan(Parcel src)��\n" +
				"BulletSpan()�����ṩһ�����ı���ɫһ�µķ��š�\n" +
				"BulletSpan(int gapWidth)�� �ṩһ�����ı���ɫһ�µķ��ţ���ָ���������������֮��Ŀհ׳��ȡ�\n" +
				"BulletSpan(int gapWidth,int color)���ṩһ��ָ����ɫ�ķ��ţ���ָ���������������֮��Ŀ�ȡ�\n" +
				"BulletSpan(Parcel src)������src��������ȡ���ɫ��Ϣ�İ�װ�࣬���Դ˹���ʱ�����캯���ĵ������£�" +
				"mGapWidth = src.readInt();\nmWantColor = src.readInt() != 0;\nmColor = src.readInt();\n���ʹ��Parcel" +
				"��Ϊ����ʱ��ʹ�÷�ʽΪ��\nParcel p = Parcel.obtain();\n"+
				"p.writeInt(20);//����gapWidth\n"+
				"p.writeInt(1);//�����Ƿ�ʹ����ɫ\n"+
				"p.writeInt(Color.YELLOW);//������ɫ\n"+
				"p.setDataPosition(0);\n"+
				"BulletSpan bs3 = new BulletSpan(p);";
		txtIntro.setText(intro);
	}
	
}
