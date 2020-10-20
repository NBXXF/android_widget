package com.xxf.roundcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView textView=findViewById(R.id.tv);
//        CornerUtil.clipViewCorner(textView,40);

        findViewById(R.id.btn_1)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ViewGroup viewGroup = (ViewGroup) v.getParent();
                        for (int i = 0; i < viewGroup.getChildCount(); i++) {
                            View childAt = viewGroup.getChildAt(i);
                            if (childAt instanceof XXFRoundWidget) {
                                ((XXFRoundWidget) childAt).setRadius(8);
                            }
                        }
                    }
                });
    }
}