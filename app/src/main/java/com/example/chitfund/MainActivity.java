package com.example.chitfund;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar myToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getActionBar();
//        actionBar.setSubtitle("mytest");
//
    }
    public void addMembers(View v){
        Intent i = new Intent(this,AddMember.class);
        startActivity(i);
//        finish();
    }
    public void listMembers(View v){
        Intent i = new Intent(this,ListMembers.class);
        startActivity(i);
//        finish();
    }

    public void payment (View v){
        Intent i = new Intent(this,Payment.class);
        startActivity(i);
//        finish();
    }
    public void report(View v){
        Intent i = new Intent(this,LedgerReport.class);
        startActivity(i);
//        finish();
    }
    public void luckyDraw(View v){
        Intent i = new Intent(this,LuckyDraw.class);
        startActivity(i);
//        finish();
    }
    public void settings(View v){
        Intent i = new Intent(this,Settings.class);
        startActivity(i);
//        finish();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.homepage_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu1:
//                addSomething();
                return true;
            case R.id.menu2:
//                startSettings();
                return true;
            case R.id.menu3:
//                startSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}