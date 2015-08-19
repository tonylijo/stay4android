package com.zixing.phil.dealing;

import android.graphics.Color;
import android.graphics.LayerRasterizer;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RasterizerSpan;
import android.widget.TextView;

public class RasterizerSpanDealing {
	
	public static void show(TextView txtResult,TextView txtIntro){
		String paragraph = "�������ȵ۴�ҵδ����е����㣬���������֣�����ƣ�ף�" +
				"�˳�Σ������֮��Ҳ��Ȼ����֮����и���ڣ� ��־֮ʿ���������ߣ���׷" +
				"�ȵ�֮����������֮�ڱ���Ҳ";
		int l1 = paragraph.length();
		
		Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
		p.setColor(Color.BLUE);
		LayerRasterizer rasterizer = new LayerRasterizer();
		rasterizer.addLayer(p);
		RasterizerSpan rs = new RasterizerSpan(rasterizer);
		Spannable spn = SpannableStringBuilder.valueOf(paragraph);
		spn.setSpan(rs, 0, l1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "RasterizerSpan��������Ϊ��դ����ʵ��Ч�������ԣ������ơ�һ�����캯����\n" +
				"RasterizerSpan(Rasterizer r)��\n" +
				"Rasterizerֻ��һ��ϵͳ�����˵�����LayerRasterizer��";
		txtIntro.setText(intro);
	}
	
}
