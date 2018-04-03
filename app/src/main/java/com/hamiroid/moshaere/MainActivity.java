package com.hamiroid.moshaere;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AhoyOnboarderActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        AhoyOnboarderCard firstScreen = new AhoyOnboarderCard(getString(R.string.first_title), getString(R.string.first_description), R.drawable.circle_moshaere);
        firstScreen.setBackgroundColor(R.color.black_transparent);
        firstScreen.setTitleColor(R.color.white);
        firstScreen.setDescriptionColor(R.color.grey_200);
        firstScreen.setTitleTextSize(dpToPixels(10, this));
        firstScreen.setDescriptionTextSize(dpToPixels(8, this));
        firstScreen.setIconLayoutParams(256, 256, 40, 0, 0, 40);


        List<AhoyOnboarderCard> pages = new ArrayList<>();
        pages.add(firstScreen);
        pages.add(firstScreen);
        pages.add(firstScreen);

        setOnboardPages(pages);

        setColorBackground(R.color.colorPrimary);

        showNavigationControls(false);

        setInactiveIndicatorColor(R.color.colorAccent);
        setActiveIndicatorColor(R.color.white);

        setFinishButtonTitle("بفرمایید مشاعره");

        setFinishButtonDrawableStyle(ContextCompat.getDrawable(this, R.drawable.round_button));

    }

    @Override
    public void onFinishButtonPressed() {

        Intent showSignUpIntent = new Intent(MainActivity.this, LoginOptionActivity.class);
        startActivity(showSignUpIntent);
    }
}
