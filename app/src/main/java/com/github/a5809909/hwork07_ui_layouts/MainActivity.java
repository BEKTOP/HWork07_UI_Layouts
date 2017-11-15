package com.github.a5809909.hwork07_ui_layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
    }

    public void onAccountButtonClick(View view) {
        Intent intent = new Intent(this, UserAccountActivity.class);
        startActivity(intent);
    }

}
