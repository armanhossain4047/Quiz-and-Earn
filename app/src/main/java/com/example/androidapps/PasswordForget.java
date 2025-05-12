package com.example.androidapps;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class PasswordForget extends AppCompatActivity {

    private EditText emailInput, oldPasswordInput, newPasswordInput, confirmPasswordInput;
    private Button resetPasswordBtn;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_password_forget);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getCurrentUser();

        emailInput = findViewById(R.id.email_input);
        oldPasswordInput = findViewById(R.id.old_password_input);
        newPasswordInput = findViewById(R.id.new_password_box);
        confirmPasswordInput = findViewById(R.id.confirm_password_box);
        resetPasswordBtn = findViewById(R.id.reset_password_btn);

        resetPasswordBtn.setOnClickListener(view -> {
            String email = emailInput.getText().toString().trim();
            String oldPass = oldPasswordInput.getText().toString().trim();
            String newPass = newPasswordInput.getText().toString().trim();
            String confirmPass = confirmPasswordInput.getText().toString().trim();

            //  Validate email format
            if (TextUtils.isEmpty(email) || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Enter a valid email address", Toast.LENGTH_SHORT).show();
                return;
            }

            //  Check if old password is empty
            if (TextUtils.isEmpty(oldPass)) {
                Toast.makeText(this, "Enter old password", Toast.LENGTH_SHORT).show();
                return;
            }

            //  Validate new password with stricter rules
            if (!isValidPassword(newPass)) {
                Toast.makeText(this, "New password must be at least 8 characters and include uppercase, lowercase, number, and special character", Toast.LENGTH_LONG).show();
                return;
            }

            //  Confirm passwords match
            if (!newPass.equals(confirmPass)) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                return;
            }

            //  Check if user is logged in
            if (user == null) {
                Toast.makeText(this, "User not logged in", Toast.LENGTH_SHORT).show();
                return;
            }

            //  Re-authenticate before updating password
            user.reauthenticate(EmailAuthProvider.getCredential(email, oldPass))
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            //  Update password if re-auth successful
                            user.updatePassword(newPass).addOnCompleteListener(updateTask -> {
                                if (updateTask.isSuccessful()) {
                                    Toast.makeText(this, "Password reset successful", Toast.LENGTH_LONG).show();
                                    mAuth.signOut();
                                    startActivity(new Intent(PasswordForget.this, Login.class));
                                    finish();
                                } else {
                                    Toast.makeText(this, "Password update failed: " + updateTask.getException().getMessage(), Toast.LENGTH_LONG).show();
                                }
                            });
                        } else {
                            Toast.makeText(this, "Authentication failed: " + task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }
                    });
        });
    }

    // 🔐 Custom password validator
    private boolean isValidPassword(String password) {
        // Minimum 8 characters, at least 1 upper, 1 lower, 1 digit, 1 special character
        String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return password.matches(passwordPattern);
    }
}
