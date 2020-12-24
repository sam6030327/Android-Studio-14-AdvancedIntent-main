package com.example.android_num_14_advancedintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click_phone(View v)
    {
        Intent phone = new Intent(this, PhoneActivity.class);
        startActivity(phone);
    }
    public void click_map(View v)
    {
        Intent map = new Intent(this, MapActivity.class);
        startActivity(map);
    }
    public void click_web(View v)
    {
        Intent web = new Intent(this, WebActivity.class);
        startActivity(web);

    }
}