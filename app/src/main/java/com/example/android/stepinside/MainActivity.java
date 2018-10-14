package com.example.android.stepinside;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnStart_OnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://stepinside.ch/tour/emi-test-1/"));
        startActivity(intent);
    }
}
