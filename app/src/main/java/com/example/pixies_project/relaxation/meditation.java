package com.example.pixies_project.relaxation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pixies_project.R;
import com.example.pixies_project.activity2;

/**
 * class that operates when relax button is clicked
 * gives option to user to go to camera,music apps ,facebook,instagram,whatsapp
 */
public class meditation extends AppCompatActivity {
    Button music,music1,camera,speech,back,fb,whp,inst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
        music=findViewById(R.id.click);
        music1=findViewById(R.id.click1);
        camera=findViewById(R.id.button2);
        speech=findViewById(R.id.button3);
        back=findViewById(R.id.button);
        fb=findViewById(R.id.fb);
        inst=findViewById(R.id.inst);
        whp=findViewById(R.id.whp);


        /**
         *  to redirect the user to jio saavn
         */
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.jio.media.jiobeats");
                startActivity(i);

            }
        });


        /**
         * to direct the user to spotify app
         */
        music1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.spotify.music");
                startActivity(i);
                finish();
            }
        });

        /**
         * to allow the user to open camera
         */
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(meditation.this, com.example.pixies_project.relaxation.camera.class);
                startActivity(i);
                finish();
            }
        });


        speech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(meditation.this, Speech.class);
                startActivity(i);
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(meditation.this, activity2.class);
                startActivity(i);
                finish();
            }
        });


        /**
         * to direct the user to facebook
         */
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.facebook.lite");
                startActivity(i);
            }
        });

        /**
         * to direct the user to whatsapp
         */
        whp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(i);

            }
        });

        /**
         * taking user to the instagram app
         */
        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(i);
            }
        });
    }
}
