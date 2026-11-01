package com.example.penggajian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        button1 = (ImageView)findViewById(R.id.button1);
        button2 = (ImageView)findViewById(R.id.button2);
        button3 = (ImageView)findViewById(R.id.button3);
        button4 = (ImageView)findViewById(R.id.button4);

        button1.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(), GajiPegawai.class);
            startActivity(intent1);
        });
        button2.setOnClickListener(v -> {
            Intent intent2 = new Intent(getApplicationContext(), Panduan.class);
            startActivity(intent2);
        });
        button3.setOnClickListener(v -> {
            Intent intent3 = new Intent(getApplicationContext(), Tentang.class);
            startActivity(intent3);
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                finish();
                System.exit(0);
            }
        });
    }
}