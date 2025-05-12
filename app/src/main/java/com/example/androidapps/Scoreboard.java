package com.example.androidapps;

import android.Manifest;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import androidx.core.view.WindowInsetsCompat.Type;

import com.airbnb.lottie.LottieAnimationView;

public class Scoreboard extends AppCompatActivity {
    ImageButton playacting, reviewable, Generate_PDf, Home_btn;
    View quiz_button, profileView, leaderboard_btn, home_btn;
    LottieAnimationView lottieAnimationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scoreboard);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        View activity_shift = findViewById(R.id.backbutton_id);
        activity_shift.setOnClickListener(v -> {
            Intent intent = new Intent(Scoreboard.this, Home.class);
            startActivity(intent);
            overridePendingTransition(0, 0);
            finish(); // Finish the current activity
        });

        try {
            FindId();
            PointSetup();

            reviewable.setOnClickListener(this::onClick);
            playacting.setOnClickListener(this::onClick);
            Generate_PDf.setOnClickListener(this::onClick);
            Home_btn.setOnClickListener(this::onClick);

            quiz_button.setOnClickListener(this::onClick);
            profileView.setOnClickListener(this::onClick);
            leaderboard_btn.setOnClickListener(this::onClick);
            home_btn.setOnClickListener(this::onClick);

        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void FindId() {
        try {
            lottieAnimationView = findViewById(R.id.lottieAnimationView);

            reviewable = findViewById(R.id.reviewbutton_id);
            playacting = findViewById(R.id.playAgainButton);
            Generate_PDf = findViewById(R.id.generate_pdf_id);
            Home_btn = findViewById(R.id.home_button_id);

            quiz_button = findViewById(R.id.quiz_button_id);
            profileView = findViewById(R.id.Profile_Icon_Scoreboard);
            leaderboard_btn = findViewById(R.id.LBoard_Icon_Scoreboard);
            home_btn = findViewById(R.id.Home_Icon_Scoreboard);
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void PointSetup() {
        try {
            TextView CurrentAns = findViewById(R.id.HomeCorectAns);
            CurrentAns.setText(String.valueOf(Quiz.correctans));

            TextView WrongAns = findViewById(R.id.HomeWrongAns);
            WrongAns.setText(String.valueOf(Quiz.wrongans));

            TextView CompletePercentage = findViewById(R.id.HomePercentage);
            int percentage = (Quiz.currentquestion * 100) / Quiz.totalquestion;
            CompletePercentage.setText(String.valueOf(percentage));

            TextView TotalQuestion = findViewById(R.id.HomeTotalQuestion);
            TotalQuestion.setText(String.valueOf(Quiz.totalquestion));

            TextView TotalPoint = findViewById(R.id.HomeTotalPoint);
            TotalPoint.setText(String.valueOf(ScoreArray.CorrectPoint + ScoreArray.WrongPoint));

        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void onClick(View v) {
        try {
            if (v.equals(reviewable)) {
                Intent intent = new Intent(Scoreboard.this, ReviewAns.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            } else if (v.equals(Home_btn)) {
                Intent intent = new Intent(Scoreboard.this, Home.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
            } else if (v.equals(playacting)) {
                Intent intent = new Intent(Scoreboard.this, Quiz.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            } else if (v.equals(Generate_PDf)) {
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
                    // For Android 9 and below
                    if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                    } else {
                        createPdf();
                    }
                } else {
                    // For Android 10 and above, use scoped storage
                    createPdf();
                }
            } else if (v.equals(quiz_button)) {
                quiz_button.setBackgroundResource(R.drawable.quiz_click_color);
                new Handler().postDelayed(() -> quiz_button.setBackgroundResource(R.drawable.quiz), 100);
                Intent intent = new Intent(this, Quiz.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            } else if (v.equals(leaderboard_btn)) {
                leaderboard_btn.setBackgroundResource(R.drawable.leaderboard_clickable_vector);
                new Handler().postDelayed(() -> leaderboard_btn.setBackgroundResource(R.drawable.leaderboard_vector), 100);
            } else if (v.equals(home_btn)) {
                home_btn.setBackgroundResource(R.drawable.home_clickable_vector);
                new Handler().postDelayed(() -> home_btn.setBackgroundResource(R.drawable.home_icon_vector), 100);
                Intent intent = new Intent(this, Home.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            } else if (v.equals(profileView)) {
                profileView.setBackgroundResource(R.drawable.profile_clickable_vector);
                new Handler().postDelayed(() -> profileView.setBackgroundResource(R.drawable.profile), 100);
                Intent intent = new Intent(this, Profile.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("MissingSuperCall")
     @Override
    public void onBackPressed() {
        // Show the dark overlay and start the animation
        View darkOverlay = findViewById(R.id.darkOverlay);
        darkOverlay.setVisibility(View.VISIBLE);

        LottieAnimationView lottieAnimationView = findViewById(R.id.lottieAnimationView);
        lottieAnimationView.setVisibility(View.VISIBLE);
        lottieAnimationView.playAnimation();

        // Delay the transition to the Home activity until the animation is done
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the Home activity here
                Intent intent = new Intent(Scoreboard.this, Home.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
            }
        }, 200);

    }
    private void createPdf() {
        // Create a new document
        PdfDocument pdfDocument = new PdfDocument();

        // Create a page description
        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(300, 600, 1).create();

        // Start a page
        PdfDocument.Page page = pdfDocument.startPage(pageInfo);

        // Get the canvas for drawing on the page
        Canvas canvas = page.getCanvas();
        Paint paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(15f);
        canvas.drawText("Welcome To Quiz Show", (float) pageInfo.getPageWidth() / 2, 50, paint);
        canvas.drawText("Total Point: ", (float) pageInfo.getPageWidth() / 2, 100, paint);
        canvas.drawText(Integer.toString(ScoreArray.CorrectPoint + ScoreArray.WrongPoint), (float) pageInfo.getPageWidth() / 2 - 10, 120, paint);
        canvas.drawText("Correct: ", (float) pageInfo.getPageWidth() / 2, 150, paint);
        canvas.drawText(Integer.toString(Quiz.correctans), (float) pageInfo.getPageWidth() / 2, 170, paint);
        canvas.drawText("Wrong: ", (float) pageInfo.getPageWidth() / 2, 200, paint);
        canvas.drawText(Integer.toString(Quiz.wrongans), (float) pageInfo.getPageWidth() / 2, 220, paint);
        canvas.drawText("Total Question", (float) pageInfo.getPageWidth() / 2, 250, paint);
        canvas.drawText(Integer.toString(Quiz.totalquestion), (float) pageInfo.getPageWidth() / 2, 270, paint);

        // Finish the page
        pdfDocument.finishPage(page);

        // Write the document content
        String directoryPath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS) + "/MyPDFs/";
        File file = new File(directoryPath);
        if (!file.exists()) file.mkdirs();

        String filePath = directoryPath + "sample.pdf";
        File filePathObject = new File(filePath);

        try {
            pdfDocument.writeTo(new FileOutputStream(filePathObject));
            Toast.makeText(this, "PDF file created at: " + filePath, Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            Toast.makeText(this, "Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }

        // Close the document
        pdfDocument.close();
    }
}

