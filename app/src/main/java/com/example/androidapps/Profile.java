package com.example.androidapps;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

import java.io.IOException;

public class Profile extends AppCompatActivity {
    private static final int GALLERY_REQUEST_CODE = 102;
    private ImageView profileImageView;
    View quiz_button, squre_btn, leaderboard_btn, home_btn, logout_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RelativeLayout relativeLayout = findViewById(R.id.circular_relativelayout);
        relativeLayout.bringToFront();

        TextView name = findViewById(R.id.profile_name_text);
        name.setText(LoginArray.Name); // Set user's name from LoginArray
        name.bringToFront();

        try {
            FindId();
            quiz_button.setOnClickListener(this::onClick);
            squre_btn.setOnClickListener(this::onClick);
            leaderboard_btn.setOnClickListener(this::onClick);
            home_btn.setOnClickListener(this::onClick);
            logout_btn.setOnClickListener(this::onClick);
            if(LoginArray.Offline==false) {
            profileImageView.setOnClickListener(v -> openGallery());
            }else{
                Toast.makeText(this, "You are Guest", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void FindId() {
        quiz_button = findViewById(R.id.Quiz_icon_profile);
        squre_btn = findViewById(R.id.Scoreboard_Icon_Profile);
        leaderboard_btn = findViewById(R.id.LBoard_Icon_Profile);
        home_btn = findViewById(R.id.Home_Icon_Profile);
        logout_btn = findViewById(R.id.Logout_Icon_Profile);
        profileImageView = findViewById(R.id.profile_image);
    }

    private void onClick(View v) {
        if (v.equals(quiz_button)) {
            quiz_button.setBackgroundResource(R.drawable.quiz_click_color);
            new Handler().postDelayed(() -> quiz_button.setBackgroundResource(R.drawable.quiz), 100);
            startActivity(new Intent(this, Quiz.class));
        } else if (v.equals(squre_btn)) {
            squre_btn.setBackgroundResource(R.drawable.score_clickable_vector);
            new Handler().postDelayed(() -> squre_btn.setBackgroundResource(R.drawable.scoreboard_vector), 100);
            startActivity(new Intent(this, Scoreboard.class));
        } else if (v.equals(leaderboard_btn)) {
            leaderboard_btn.setBackgroundResource(R.drawable.leaderboard_clickable_vector);
            new Handler().postDelayed(() -> leaderboard_btn.setBackgroundResource(R.drawable.leaderboard_vector), 100);
            startActivity(new Intent(this, Scoreboard.class));
        } else if (v.equals(home_btn)) {
            home_btn.setBackgroundResource(R.drawable.home_clickable_vector);
            new Handler().postDelayed(() -> home_btn.setBackgroundResource(R.drawable.home_icon_vector), 100);
            startActivity(new Intent(this, Home.class));
        } else if (v.equals(logout_btn)) {
            startActivity(new Intent(this, Login.class));
            finish();
        }

        overridePendingTransition(0, 0);
    }

    private void openGallery() {
        Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(galleryIntent, GALLERY_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GALLERY_REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            Uri imageUri = data.getData();
            if (imageUri != null) {
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), imageUri);
                    profileImageView.setImageBitmap(bitmap);
                } catch (IOException e) {
                    Toast.makeText(this, "Failed to set image", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        View darkOverlay = findViewById(R.id.darkOverlay);
        darkOverlay.setVisibility(View.VISIBLE);

        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieAnimationView);
        lottieAnimationView.setVisibility(View.VISIBLE);
        lottieAnimationView.playAnimation();

        new Handler().postDelayed(() -> {
            startActivity(new Intent(Profile.this, Home.class));
            overridePendingTransition(0, 0);
            finish();
        }, 200);
    }
}
