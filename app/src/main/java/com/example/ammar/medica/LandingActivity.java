package com.example.ammar.medica;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.VideoView;

import mehdi.sakout.fancybuttons.FancyButton;

public class LandingActivity extends Activity {

    VideoView videoView;
    EditText emailET;
    EditText passwordET;
    TextView forgotPasswordTV;
    Button signInButton;
    Button signInWithFacebookButton;
    Button signInWithGoogleButton;
    TextView signUpTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //the operations that is done on the windows before the set content View is done to enable fullscreen
        Window w = getWindow(); // in Activity's onCreate() for instance
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        setContentView(R.layout.activity_landing);

        //Background Video code and repeat
        videoView = findViewById(R.id.landing_video_view);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.landing_video);
        videoView.setVideoURI(uri);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        signUpTV = findViewById(R.id.sign_up_TV);
        signUpTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LandingActivity.this,SignUpActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        videoView.start();
    }
}
