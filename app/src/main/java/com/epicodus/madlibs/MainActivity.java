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
    @Bind(R.id.nounEditText) EditText mNounEditText;
    @Bind(R.id.verbEditText) EditText mVerbEditText;
    @Bind(R.id.clothingItemEditText) EditText mClothingItemEditText;
    @Bind(R.id.beverageEditText) EditText mBeverageEditText;
    @Bind(R.id.foodEditText) EditText mFoodEditText;
    @Bind(R.id.bodyPartEditText) EditText mBodyPartEditText;
    @Bind(R.id.nounMovesEditText) EditText mNounMovesEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mMakeMadLibButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String loudNoise = mLoudNoiseEditText.getText().toString();
                String noun  = mNounEditText.getText().toString();
                String verb  = mVerbEditText.getText().toString();
                String clothingItem = mClothingItemEditText.getText().toString();
                String beverage  = mBeverageEditText.getText().toString();
                String food = mFoodEditText.getText().toString();
                String bodyPart = mBodyPartEditText.getText().toString();
                String nounMoves = mNounMovesEditText.getText().toString();

                Intent intent = new Intent(MainActivity.this, StoryActivity.class);

                intent.putExtra("loudNoise",loudNoise);
                intent.putExtra("noun", noun);
                intent.putExtra("verb",verb);
                intent.putExtra("clothingItem", clothingItem);
                intent.putExtra("beverage",beverage);
                intent.putExtra("food",food);
                intent.putExtra("bodyPart",bodyPart);
                intent.putExtra("nounMoves",nounMoves);

                startActivity(intent);
            }
        });
    }
}
