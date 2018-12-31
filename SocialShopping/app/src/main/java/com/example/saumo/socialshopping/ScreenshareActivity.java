package com.example.saumo.socialshopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ScreenshareActivity extends AppCompatActivity {

    private Button Broadcaster, Audience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenshare);

        Audience = (Button) findViewById(R.id.btn_audience);

        Audience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScreenshareActivity.this, AudienceActivity.class);
                startActivity(intent);
            }
        });
    }
}