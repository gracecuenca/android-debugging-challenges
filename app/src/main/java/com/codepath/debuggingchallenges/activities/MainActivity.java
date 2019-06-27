package com.codepath.debuggingchallenges.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.codepath.debuggingchallenges.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void launchActivity(Class klass) {
        Intent intent = new Intent(MainActivity.this, klass);
        startActivity(intent);
    }

    // there is a problem here
    public void launchCurrentDayActivity(View view) { launchActivity(CurrentDayActivity.class); }

    public void launchMoviesActivity(View view) {
        launchActivity(MoviesActivity.class);
    }

    public void launchChangeBackgroundActivity(View view) {
        launchActivity(ChangeBackgroundActivity.class);
    }

    public void launchToolbarActivity(View view) {
        launchActivity(ToolbarActivity.class);
    }

    // search history activity doesn't exist
    // public void launchSearchHistoryActivity(View view){ launchActivity(Se);}
}
