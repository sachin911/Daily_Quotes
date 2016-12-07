package com.example.sachin.dailyquotes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by Sachin on 10/31/16.
 */

public class LoginActivity extends AppCompatActivity {

    @Bind(R.id.editText4) EditText  editUserName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main_screen);

    }
}
