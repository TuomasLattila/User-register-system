package com.example.viikko9_olio_ohjelmointi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchToAddUser(View view)  {
        Intent intent = new Intent(this, askInfoActivity.class);
        startActivity(intent);
    }

    public void switchToListUsers(View view)  {
        Intent intent = new Intent(this, listUsersActivity.class);
        startActivity(intent);
    }
}