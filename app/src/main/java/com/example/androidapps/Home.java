package com.example.androidapps;

import static com.example.androidapps.R.id.home_profile_circle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Home extends AppCompatActivity {
    View quiz_button, profileView, squre_btn, leaderboard_btn;
    RelativeLayout International, Football, Islam, History, Science, Bangla, Math, General;
    TextView userNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        try {
            FindId();

            // Show the user's first name in the TextView
            showUserName();

            quiz_button.setOnClickListener(this::onClick);
            profileView.setOnClickListener(this::onClick);
            squre_btn.setOnClickListener(this::onClick);
            leaderboard_btn.setOnClickListener(this::onClick);

            // Bring layout to front
            RelativeLayout relativeLayout = findViewById(home_profile_circle);
            relativeLayout.bringToFront();

                International.setOnClickListener(new MyOnClickListener());
                Science.setOnClickListener(new MyOnClickListener());
                Math.setOnClickListener(new MyOnClickListener());
                Islam.setOnClickListener(new MyOnClickListener());
                General.setOnClickListener(new MyOnClickListener());
                History.setOnClickListener(new MyOnClickListener());
                Bangla.setOnClickListener(new MyOnClickListener());
                Football.setOnClickListener(new MyOnClickListener());

        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void FindId() {
        quiz_button = findViewById(R.id.quiz_button_id);
        profileView = findViewById(R.id.Profile_Icon_Home);
        squre_btn = findViewById(R.id.Score_Icon_Home);
        leaderboard_btn = findViewById(R.id.LBoard_Icon_Home);

        International = findViewById(R.id.international_icon);
        Football = findViewById(R.id.sports_icon);
        Islam = findViewById(R.id.islam_icon);
        History = findViewById(R.id.history_icon);
        Science = findViewById(R.id.science_icon);
        Bangla = findViewById(R.id.bangla_icon);
        Math = findViewById(R.id.math_icon);
        General = findViewById(R.id.knowledge_icon);

        userNameTextView = findViewById(R.id.user_name);
    }

    private void showUserName() {
        String name = LoginArray.Name;
        if (name != null && !name.isEmpty()) {
            String firstName = name.split(" ")[0];
            userNameTextView.setText("Hi, " + firstName);
        } else {
            userNameTextView.setText("Hi!");
        }
    }



    private void onClick(View v) {
        if (v.equals(profileView)) {
            profileView.setBackgroundResource(R.drawable.profile_clickable_vector);
            new Handler().postDelayed(() -> profileView.setBackgroundResource(R.drawable.profile), 100);
            startActivity(new Intent(this, Profile.class));
            overridePendingTransition(0, 0);
        } else if (v.equals(quiz_button)) {
            QuizArray.QuestionType = 0;
            quiz_button.setBackgroundResource(R.drawable.quiz_click_color);
            new Handler().postDelayed(() -> quiz_button.setBackgroundResource(R.drawable.quiz), 100);
            startActivity(new Intent(this, Quiz.class));
            overridePendingTransition(0, 0);
        } else if (v.equals(squre_btn)) {
            squre_btn.setBackgroundResource(R.drawable.score_clickable_vector);
            new Handler().postDelayed(() -> squre_btn.setBackgroundResource(R.drawable.scoreboard_vector), 100);
            startActivity(new Intent(this, Scoreboard.class));
            overridePendingTransition(0, 0);
        } else if (v.equals(leaderboard_btn)) {
            leaderboard_btn.setBackgroundResource(R.drawable.leaderboard_clickable_vector);
            new Handler().postDelayed(() -> leaderboard_btn.setBackgroundResource(R.drawable.leaderboard_vector), 100);
        }
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        // Intentionally left blank
    }

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Home.this, Quiz.class);
            if (LoginArray.Offline == false) {
                if (v.equals(International)) {
                    QuizArray.QuestionType = 1;
                    International.setBackgroundResource(R.drawable.international_clickable_vector);
                    new Handler().postDelayed(() -> International.setBackgroundResource(R.drawable.international_vector), 100);
                } else if (v.equals(Science)) {
                    QuizArray.QuestionType = 2;
                    Science.setBackgroundResource(R.drawable.science_clickable_vector);
                    new Handler().postDelayed(() -> Science.setBackgroundResource(R.drawable.science_vector), 100);
                } else if (v.equals(Math)) {
                    QuizArray.QuestionType = 3;
                    Math.setBackgroundResource(R.drawable.math_clickable_vector);
                    new Handler().postDelayed(() -> Math.setBackgroundResource(R.drawable.math_vector), 100);
                } else if (v.equals(Islam)) {
                    QuizArray.QuestionType = 4;
                    Islam.setBackgroundResource(R.drawable.islam_clickable_vector);
                    new Handler().postDelayed(() -> Islam.setBackgroundResource(R.drawable.islam_vector), 100);
                } else if (v.equals(General)) {
                    QuizArray.QuestionType = 5;
                    General.setBackgroundResource(R.drawable.knowdledge_clickable_vector);
                    new Handler().postDelayed(() -> General.setBackgroundResource(R.drawable.knowledge_vector), 100);
                } else if (v.equals(History)) {
                    QuizArray.QuestionType = 6;
                    History.setBackgroundResource(R.drawable.history_clickable_vector);
                    new Handler().postDelayed(() -> History.setBackgroundResource(R.drawable.history_vector), 100);
                } else if (v.equals(Bangla)) {
                    QuizArray.QuestionType = 7;
                    Bangla.setBackgroundResource(R.drawable.bangla_clickable_vector);
                    new Handler().postDelayed(() -> Bangla.setBackgroundResource(R.drawable.bangla_vector), 100);
                } else if (v.equals(Football)) {
                    QuizArray.QuestionType = 8;
                    Football.setBackgroundResource(R.drawable.football_clickable_vector);
                    new Handler().postDelayed(() -> Football.setBackgroundResource(R.drawable.football_vecotr), 100);
                }
                startActivity(intent);
            } else {
                Toast.makeText(Home.this, "You are Guest", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
