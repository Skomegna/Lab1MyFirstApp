package edu.uw.tcss450.uwnetid.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.security.ProtectionDomain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Error", "Error" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("Warning", "Warning");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Information", "Information");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Debug", "Debug");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Verbose", "Verbose");
    }
}