package com.example.androidapps;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class scrolling extends AppCompatActivity {

    private RelativeLayout internationalIcon;
    private RelativeLayout rootLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scrolling);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Initialize the layouts
        internationalIcon = findViewById(R.id.international_icon);
        rootLayout = findViewById(R.id.root_layout);

        // Set onClickListener for the internationalIcon
        internationalIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Button programmatically
                Button dynamicButton = new Button(scrolling.this);
                dynamicButton.setText("Click Me");
                dynamicButton.setLayoutParams(new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                ));

                // Add the button to the root layout
                rootLayout.addView(dynamicButton);

                // Set onClickListener for the dynamic button
                dynamicButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Handle the button click event
                        dynamicButton.setText("Button Clicked");
                    }
                });
            }
        });
    }
}