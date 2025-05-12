package com.example.androidapps;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.FirebaseAuth;

public class Singup extends AppCompatActivity {

    EditText Name, Email, Password, Confirm_Password;
    Button Sing_Up;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mAuth = FirebaseAuth.getInstance();
        FindId();

        Sing_Up.setOnClickListener(this::OnClick);

        TextView signInText = findViewById(R.id.sign_up_text);
        signInText.setOnClickListener(v -> {
            signInText.setTextColor(getResources().getColor(R.color.purple));
            startActivity(new Intent(Singup.this, Login.class));
        });

        setupPasswordVisibilityToggle();
    }

    private void OnClick(View v) {
        String name = Name.getText().toString().trim();
        String email = Email.getText().toString().trim();
        String password = Password.getText().toString().trim();
        String confirmPassword = Confirm_Password.getText().toString().trim();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!name.matches("^[a-zA-Z ]+$")) {
            Toast.makeText(this, "Name should only contain letters (no numbers or symbols)", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            Toast.makeText(this, "Invalid email address format", Toast.LENGTH_SHORT).show();
            return;
        }

        // Allow only .com, .net, .edu domain
        if (!email.matches(".*\\.(com|net|edu)$")) {
            Toast.makeText(this, "Only '.com', '.net', and '.edu' emails are allowed", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!password.equals(confirmPassword)) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!isStrongPassword(password)) {
            Toast.makeText(this, "Weak password. Use min 8 characters with upper, lower, number & special char.", Toast.LENGTH_LONG).show();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        mAuth.getCurrentUser().sendEmailVerification()
                                .addOnCompleteListener(verifyTask -> {
                                    if (verifyTask.isSuccessful()) {
                                        Toast.makeText(this, "Verification email sent. Please verify before login.", Toast.LENGTH_LONG).show();
                                        mAuth.signOut(); // logout until verified
                                        startActivity(new Intent(Singup.this, Login.class));
                                        finish();
                                    } else {
                                        Toast.makeText(this, "Failed to send verification email", Toast.LENGTH_SHORT).show();
                                    }
                                });
                    } else {
                        Toast.makeText(this, "Error: " + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }

    private boolean isStrongPassword(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]).{8,}$");
    }

    private void FindId() {
        Name = findViewById(R.id.name_id);
        Email = findViewById(R.id.email_id);
        Password = findViewById(R.id.password);
        Confirm_Password = findViewById(R.id.password1);
        Sing_Up = findViewById(R.id.Sing_Up_Btn);
    }

    private void setupPasswordVisibilityToggle() {
        View eyeIcon = findViewById(R.id.eye_icon_id);
        EditText passwordEditText = findViewById(R.id.password);
        passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());

        eyeIcon.setOnClickListener(new View.OnClickListener() {
            boolean isPasswordVisible = false;

            @Override
            public void onClick(View v) {
                if (isPasswordVisible) {
                    passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    passwordEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                isPasswordVisible = !isPasswordVisible;
                passwordEditText.setSelection(passwordEditText.getText().length());
            }
        });

        View eyeIcon1 = findViewById(R.id.eye_icon_id1);
        EditText passwordEditText1 = findViewById(R.id.password1);
        passwordEditText1.setTransformationMethod(PasswordTransformationMethod.getInstance());

        eyeIcon1.setOnClickListener(new View.OnClickListener() {
            boolean isPasswordVisible = false;

            @Override
            public void onClick(View v) {
                if (isPasswordVisible) {
                    passwordEditText1.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    passwordEditText1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                isPasswordVisible = !isPasswordVisible;
                passwordEditText1.setSelection(passwordEditText1.getText().length());
            }
        });
    }
}
