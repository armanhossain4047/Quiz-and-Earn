package com.example.androidapps;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;

public class Login extends AppCompatActivity {

    private Button SingIn;
    private TextView signUPText;
    private EditText emailorusername, password;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mAuth = FirebaseAuth.getInstance();
        FindId();

        SingIn.setOnClickListener(this::onClick);
        if (signUPText != null) {
            signUPText.setOnClickListener(this::onClick);
        }

        setupPasswordVisibilityToggle();

        TextView forgetPasswordText = findViewById(R.id.forget_password_id);
        forgetPasswordText.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, PasswordForget.class);
            startActivity(intent);
        });
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onBackPressed() {
        // Disable back button
    }

    private void FindId() {
        signUPText = findViewById(R.id.sign_in_text);
        SingIn = findViewById(R.id.sing_in_btn_id);
        emailorusername = findViewById(R.id.username_or_email);
        password = findViewById(R.id.password);
    }

    private void onClick(View v) {
        if (v.equals(SingIn)) {
            String email = emailorusername.getText().toString().trim();
            String pass = password.getText().toString().trim();

            if (email.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            mAuth.signInWithEmailAndPassword(email, pass)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();

                            // Extract name from email (before @)
                            String namePart = email.split("@")[0];
                            LoginArray.Name = namePart;

                            Intent intent = new Intent(Login.this, Home.class);
                            startActivity(intent);
                            finish();
                        } else {
                            Exception e = task.getException();
                            if (e instanceof FirebaseAuthInvalidUserException) {
                                Toast.makeText(this, "Wrong email address", Toast.LENGTH_LONG).show();
                            } else if (e instanceof FirebaseAuthInvalidCredentialsException) {
                                Toast.makeText(this, "Wrong password", Toast.LENGTH_LONG).show();
                            } else {
                                Toast.makeText(this, "Login failed: " + e.getMessage(), Toast.LENGTH_LONG).show();
                            }
                        }
                    });

        } else if (v.equals(signUPText)) {
            signUPText.setTextColor(getResources().getColor(R.color.purple));
            new Handler().postDelayed(() -> signUPText.setTextColor(getResources().getColor(R.color.link)), 100);
            Intent intent = new Intent(Login.this, Singup.class);
            startActivity(intent);
        }
    }

    private void setupPasswordVisibilityToggle() {
        EditText passwordEditText = findViewById(R.id.password);
        ImageButton eyeIcon = findViewById(R.id.eye_icon_id);

        if (passwordEditText != null && eyeIcon != null) {
            passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());

            eyeIcon.setOnClickListener(new View.OnClickListener() {
                boolean isPasswordVisible = false;

                @Override
                public void onClick(View v) {
                    if (isPasswordVisible) {
                        passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        eyeIcon.setImageResource(R.drawable.eye_vector);
                    } else {
                        passwordEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                        eyeIcon.setImageResource(R.drawable.eye_vector);
                    }
                    isPasswordVisible = !isPasswordVisible;
                    passwordEditText.setSelection(passwordEditText.getText().length());
                }
            });
        }
    }
}
