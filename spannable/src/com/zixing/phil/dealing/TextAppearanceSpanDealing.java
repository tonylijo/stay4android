package com.zixing.phil.dealing;

import java.io.IOException;

import org.xmlpull.v1.XmlPullParserException;

import com.zixing.phil.spanablestring.R;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;

public class TextAppearanceSpanDealing {
	
	public static void show(Context ctx, TextView txtResult,TextView txtIntro){
		String para1 = "�ຣ���ư�ѩɽ��\n";
		String para2 = "�³�ң�����Źء�\n";
		String para3 = "��ɳ��ս����ף�\n";
		String para4 = "����¥���ղ�����";
		int l1 = para1.length(),l2 = para2.length(),l3 = para3.length(),l4 = para4.length();
		
		TextAppearanceSpan tas1 = new TextAppearanceSpan(ctx, android.R.style.TextAppearance_StatusBar_EventContent_Title);
		TextAppearanceSpan tas2 = new TextAppearanceSpan(ctx, R.style.selt_style, -1);
		TextAppearanceSpan tas3 = null;
		try {
			ColorStateList colorlist = ColorStateList.createFromXml(ctx.getResources(),ctx.getResources().getXml(R.drawable.colorlist));
			ColorStateList colorlistLink = ColorStateList.createFromXml(ctx.getResources(),ctx.getResources().getXml(R.drawable.colorlistlink));
			Typeface t = Typeface.createFromAsset(ctx.getAssets(), "fonts/fzfatfish.ttf");
			t.toString();
			tas3 = new TextAppearanceSpan("NORMAL", Typeface.BOLD_ITALIC, 20, colorlist,colorlistLink);
		} catch (XmlPullParserException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Parcel p = Parcel.obtain();
		p.writeString("SERIF");
		p.writeInt(Typeface.BOLD_ITALIC);
		p.writeInt(10);
		try {
			ColorStateList colorlist = ColorStateList.createFromXml(ctx.getResources(),ctx.getResources().getXml(R.drawable.parcelcolorlist));
			p.writeInt(1);
			colorlist.writeToParcel(p, Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
			p.writeInt(1);
			colorlist.writeToParcel(p, Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		p.setDataPosition(0);
		TextAppearanceSpan tas4 = new TextAppearanceSpan(p);
		
		Spannable spn = SpannableStringBuilder.valueOf(para1+para2+para3+para4);
		spn.setSpan(tas1, 0, l1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(tas2, l1, l1+l2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(tas3, l1+l2, l1+l2+l3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(tas4, l1+l2+l3, l1+l2+l3+l4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "TextAppearanceSpan��ʹ��style�ļ��������ı���ʽ��������4�����캯����\n" +
				"TextAppearanceSpan(Context context, int appearance)������context������������ģ�" +
				"����appearance�����õ���ʽ����R.style.my_style��\n" +
				"TextAppearanceSpan(Context context, int appearance, int colorList)������context��" +
				"ʹ�õ������ģ�����appearance�����õ���ʽ����R.style.my_style������colorList��ʹ�÷�ʽδ֪��" +
				"�������ΪС��0���������������Ч����\n" +
				"TextAppearanceSpan(String family, int style, int size,ColorStateList color, ColorStateList linkColor)��" +
				"����family�����壬��֧��ϵͳ�Դ����������壬MONOSPACE��SERIF��SANS������style��TypeFace�ж����������ʽ��BOLD��" +
				"ITALIC�ȣ�����size�������С������color��������ɫ������linkColor��ʹ�÷�ʽδ֪��\n" +
				"TextAppearanceSpan(Parcel src)������src��������ʽ��Ϣ�İ�װ�࣬��ʽ��Ϣ����5�ι��졣ʹ�ã�\n" +
				"Parcel p = Parcel.obtain();\n"+
				"p.writeString(\"SERIF\");\n"+
				"p.writeInt(Typeface.BOLD_ITALIC);\n"+
				"p.writeInt(10);\n"+
				"try {\n"+
				"\tColorStateList colorlist = ColorStateList.createFromXml(ctx.getResources(),ctx.getResources().getXml(R.drawable.parcelcolorlist));\n"+
				"\tp.writeInt(1);\n"+
				"\tcolorlist.writeToParcel(p, Parcelable.PARCELABLE_WRITE_RETURN_VALUE);\n"+
				"\tp.writeInt(1);\n"+
				"\tcolorlist.writeToParcel(p, Parcelable.PARCELABLE_WRITE_RETURN_VALUE);\n"+
				"} catch (Exception e) {\n"+
				"\te.printStackTrace();\n"+
				"}\n"+
				"p.setDataPosition(0);\n"+
				"TextAppearanceSpan tas = new TextAppearanceSpan(p);\n" +
				"ע�������������style�ƺ���δ�����ã��������������colorList��linkColor������ʹ���в����ˣ��д����";
		txtIntro.setText(intro);
	}
	
}
