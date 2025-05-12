package com.example.androidapps;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class Opening extends AppCompatActivity {

    private Handler handler;
    private Runnable checkInternetRunnable;
    RelativeLayout singbtn_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_opening);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        LottieAnimationView animationView = findViewById(R.id.lottie_animation_view);
        singbtn_layout = findViewById(R.id.singbtn_layout_id);
        animationView.setAnimation(R.raw.quiz);
        animationView.playAnimation();

        TextView persistentMessageText = findViewById(R.id.persistent_message_text);

        // 👉 Add click listener for "Play Offline"
        persistentMessageText.setOnClickListener(v -> {
            LoginArray.Offline = true;
            Intent intent = new Intent(Opening.this, Quiz.class);
            startActivity(intent);
            finish();
        });

        handler = new Handler();

        // Define the Runnable to check for internet connection
        checkInternetRunnable = () -> {
            if (NetworkUtil.isInternetAvailable(Opening.this)) {
                handler.postDelayed(() -> {
                    LoginArray.Offline = false;
                    Intent intent = new Intent(Opening.this, Login.class);
                    startActivity(intent);
                    finish();
                }, 3000);
            } else {
                handler.postDelayed(() -> {
                    persistentMessageText.setVisibility(View.VISIBLE);
                    singbtn_layout.setVisibility(View.VISIBLE);
                    animationView.pauseAnimation();
                }, 2000);

                handler.postDelayed(checkInternetRunnable, 2000);
            }
        };

        handler.post(checkInternetRunnable);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Remove callbacks to prevent memory leaks
        handler.removeCallbacks(checkInternetRunnable);
    }
}
