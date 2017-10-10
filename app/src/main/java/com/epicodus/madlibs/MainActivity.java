package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.makeMadLibButton) Button mMakeMadLibButton;
    @Bind(R.id.loudNoiseEditText) EditText mLoudNoiseEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mMakeMadLibButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String loudNoise = mLoudNoiseEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, StoryActivity.class);

                intent.putExtra("loudNoise",loudNoise);
                startActivity(intent);
            }
        });
    }
}
