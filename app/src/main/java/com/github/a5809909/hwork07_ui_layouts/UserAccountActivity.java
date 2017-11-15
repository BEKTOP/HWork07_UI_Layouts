package com.github.a5809909.hwork07_ui_layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class UserAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_account_activity);
    }

    public void onHomeButtonClick(View view) {
        Intent intent = new Intent(UserAccountActivity.this, MainActivity.class);
        startActivity(intent);
    }

}