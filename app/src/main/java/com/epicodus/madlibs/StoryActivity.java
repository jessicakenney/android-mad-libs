package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StoryActivity extends AppCompatActivity {
    @Bind(R.id.storyTextView) TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String loudNoise = intent.getStringExtra("loudNoise");
        String noun = intent.getStringExtra("noun");
        String verb = intent.getStringExtra("verb");
        String clothingItem = intent.getStringExtra("clothingItem");
        String beverage = intent.getStringExtra("beverage");
        String food = intent.getStringExtra("food");
        String bodyPart = intent.getStringExtra("bodyPart");
        String nounMoves = intent.getStringExtra("nounMoves");

        mStoryTextView.setText(loudNoise + "! It’s 6:30 Monday morning and you’re alarm "+noun+" is going off! You "+verb+" out of bed and into the shower. Then you grab the nearest "+clothingItem+" and run down the stairs to the kitchen. You make your morning "+beverage+" and pack a "+food+" lunch. But when you go into the front hall, you discover that your pet has vomited on the floor! You have to clean it up, so now you’re running late for the bus!  You run out the door to catch your bus, but while you are waiting for the light to change to cross the street, you see your bus zoom by.  So you stick out your "+bodyPart+" and catch a ride with a passing "+nounMoves+" instead. You make it to Epicodus just in time to sign in before 8:15 and start your MadLibs project.");

    }



}
