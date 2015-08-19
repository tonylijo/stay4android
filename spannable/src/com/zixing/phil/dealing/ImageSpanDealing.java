package com.zixing.phil.dealing;

import com.zixing.phil.spanablestring.R;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.TextView;

public class ImageSpanDealing {
	
	public static void show(Context ctx,TextView txtResult,TextView txtIntro){
		String text = "Android*һ�ʵı���*ָ�������ˡ�*��Google*";
		Bitmap bm = ((BitmapDrawable)ctx.getResources().getDrawable(R.drawable.joke)).getBitmap();
		Drawable d = ctx.getResources().getDrawable(R.drawable.dollar);
		d.setBounds(0, 0, (int)txtResult.getTextSize(),  (int)txtResult.getTextSize());
		Uri uri = Uri.parse("android.resource://"+ctx.getPackageName()+"/"+R.drawable.flower);

		ImageSpan is1 = new ImageSpan(ctx,bm,ImageSpan.ALIGN_BASELINE);
		ImageSpan is2 = new ImageSpan(d, ImageSpan.ALIGN_BASELINE);
		ImageSpan is3 = new ImageSpan(ctx, R.drawable.ic_launcher);
		ImageSpan is4 = new ImageSpan(ctx, uri,ImageSpan.ALIGN_BASELINE);
		Spannable spn = SpannableStringBuilder.valueOf(text);
		spn.setSpan(is1, 7, 8, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(is2, 13, 14, Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
		spn.setSpan(is3, 20, 21, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		spn.setSpan(is4, 28, 29, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		txtResult.setText(spn);
		
		String intro = "ImageSpan��ͼƬ��ʽ����Ҫ�������ı��в���ͼƬ�����๹�캯���϶࣬" +
				"����Ҫ�����Bitmap��Drawable�ģ�Ҳ����ͨ����ԴIdֱ�Ӽ���ͼƬ��������£�\n" +
				"ImageSpan(Bitmap b)�� This constructor is deprecated. Use ImageSpan(Context, Bitmap)" +
				" instead.����b��������ʾ��Bitmap���÷����ѹ�ʱ������Use ImageSpan(Context, Bitmap)���档\n"+
				"ImageSpan(Bitmap b, int verticalAlignment)�� This constructor is deprecated. Use ImageSpan" +
				"(Context, Bitmap, int) instead.����b��������ʾ��Bitmap������verticalAlignment�����뷽ʽ����Ӧ" +
				"ImageSpan�еĳ���ֵ���÷����ѹ�ʱ������ImageSpan(Context, Bitmap, int)���档\n"+
				"ImageSpan(Context context, Bitmap b)������context������������ģ�����b��������ʾ��Bitmap��\n"+
				"ImageSpan(Context context, Bitmap b, int verticalAlignment)������context������������ģ�����b������" +
				"��ʾ��Bitmap������verticalAlignment�����뷽ʽ��\n"+
				"ImageSpan(Drawable d)������d��������ʾ��Drawable����Drawable�����ô�С��\n"+
				"ImageSpan(Drawable d, int verticalAlignment)������d��������ʾ��Drawable������verticalAlignment�����뷽ʽ��\n"+
				"ImageSpan(Drawable d, String source)������d��������ʾ��Drawable������source����Դ�ַ�����\n"+
				"ImageSpan(Drawable d, String source, int verticalAlignment)������d��������ʾ��Drawable������source����Դ�ַ�����" +
				"����verticalAlignment�����뷽ʽ��\n"+
				"ImageSpan(Context context, Uri uri)������context������������ģ�����uri��ͼƬ��uri��\n"+
				"ImageSpan(Context context, Uri uri, int verticalAlignment)������context������������ģ�����uri��ͼƬ��uri" +
				"������verticalAlignment�����뷽ʽ��\n"+
				"ImageSpan(Context context, int resourceId)������context������������ģ�����resourceId��ͼƬ����Դid��\n"+
				"ImageSpan(Context context, int resourceId, int verticalAlignment)����context������������ģ�����resourceId��" +
				"ͼƬ����Դid������verticalAlignment�����뷽ʽ��";
		txtIntro.setText(intro);
	}
	
}
