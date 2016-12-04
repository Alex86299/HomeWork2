package com.example.alex.homew2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        params.setMargins(8, 8, 8, 0);

        LinearLayout inearLayout = new LinearLayout(this);
        inearLayout.setOrientation(LinearLayout.VERTICAL);
        inearLayout.setBackgroundColor(Color.parseColor("#008000"));

        ImageView iw1 = new ImageView(this);
        ImageView iw2 = new ImageView(this);
        ImageView iw3 = new ImageView(this);

        iw1.setImageResource(R.drawable.icon);
        iw2.setImageResource(R.drawable.icon);
        iw3.setImageResource(R.drawable.icon);

        iw1.setLayoutParams(params);
        iw2.setLayoutParams(params);
        iw3.setLayoutParams(params);

        inearLayout.addView(iw1);
        inearLayout.addView(iw2);
        inearLayout.addView(iw3);

        LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        relativeLayout.addView(inearLayout, lParams);
    }
}
