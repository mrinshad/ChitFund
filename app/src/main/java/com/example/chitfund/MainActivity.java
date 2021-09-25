package com.example.chitfund;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

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
        finish();
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

}