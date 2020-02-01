package com.neeraja.harrypotter.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.neeraja.harrypotter.R;

public class SplashActivity extends AppCompatActivity {

    private ConstraintLayout brandLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        context = SplashActivity.this;

        brandLayout = (ConstraintLayout) findViewById(R.id.layout_brand);

        Animation anim = AnimationUtils.loadAnimation(context,
                R.anim.splash_screen_anim);

        brandLayout.setVisibility(View.VISIBLE);
        brandLayout.startAnimation(anim);
        anim.setAnimationListener(listener);
    }

    private Animation.AnimationListener listener = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {

        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };
}
