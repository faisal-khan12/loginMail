package com.dotaustere.loginmail;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private AppCompatButton btnFacebook ,btngoogle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngoogle = findViewById(R.id.googleSignin);
        btnFacebook = findViewById(R.id.fbSignin);
//        btngoogle.setOnClickListener(v -> {
//            Intent intent1 = new Intent(MainActivity.this,FacebookAuth.class);
//            intent1.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
//            startActivity(intent1);
//        });
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,FacebookAuth.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);

            }
        });

    }





}