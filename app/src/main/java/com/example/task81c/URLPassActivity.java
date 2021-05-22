package com.example.task81c;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class URLPassActivity extends  AppCompatActivity {
    private EditText videoURL;
    private Button playBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        videoURL = findViewById(R.id.urlField);
        playBtn = findViewById(R.id.playBtn);

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vidoURL = videoURL.getText().toString();
                Intent intent = new Intent(URLPassActivity.this,MainActivity.class);
                intent.putExtra("urlVal",vidoURL);
                startActivity(intent);
            }
        });
    }

}
