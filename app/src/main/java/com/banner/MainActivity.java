package com.banner;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.banner.widget.Banner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private int[] imgs = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<View> itemViews = new ArrayList<View>();
        for (int i = 0; i < imgs.length; i++) {
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(imgs[i]);
            itemViews.add(imageView);
        }
        Banner banner1 = new Banner(this, itemViews);
        banner1.setBackgroundColor(Color.parseColor("#3F51B5"));
        this.addContentView(banner1,new LayoutParams(LayoutParams.MATCH_PARENT,450));
    }
}
