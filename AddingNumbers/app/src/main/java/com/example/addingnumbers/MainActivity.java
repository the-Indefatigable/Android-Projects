package com.example.addingnumbers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

     private EditText n1 ,n2;
     private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.n1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button = findViewById(R.id.button);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        answer = findViewById(R.id.answer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum  = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                answer.setText(String.valueOf(sum));
            }
        });
    }
}