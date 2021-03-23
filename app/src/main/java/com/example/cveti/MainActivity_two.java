package com.example.basedannikh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
    }

    public void onClick(View view) {
        EditText log=(EditText) findViewById(R.id.email);
        EditText pas=(EditText) findViewById(R.id.pass);
    }
    public void onClickSignUp(View view) {
        Intent o = new Intent(MainActivity.this, SignUp.class);
        startActivity(o);
        finish();
    }
}