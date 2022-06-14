package com.jeremyfeinstein.slidingmenu.lib;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class MyGameView extends FrameLayout {
    public MyGameView(@NonNull Context context) {
        super(context);
        init(context);
    }

    public MyGameView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        View view = LayoutInflater.from(context).inflate(R.layout.my_game, null);
        addView(view);
    }
}
