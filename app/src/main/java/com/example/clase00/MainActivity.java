package com.example.clase00;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btn_submit = findViewById(R.id.button1);
        EditText editText1 = findViewById(R.id.editText1);
        Button btn_clear = findViewById(R.id.button2);

        btn_submit.setOnClickListener(v -> {
            String text = editText1.getText().toString();
            Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
        });

        btn_clear.setOnClickListener(v -> {
            editText1.setText("");
            Toast.makeText(MainActivity.this, "Borrando...", Toast.LENGTH_LONG).show();
        });
    }
}