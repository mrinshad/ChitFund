package com.example.chitfund;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.chitfund.Utils.DatabaseHelper;
import com.google.android.material.snackbar.Snackbar;

public class AddMember extends AppCompatActivity {

    private DatabaseHelper databaseHelper;
    private final AppCompatActivity activity = AddMember.this;


    EditText memberName, memberPlace, memberAddress, memberContact, proofNumber;
    Spinner proofType, chitValue;

    String name, place, address, contact, prType, prNumber, chitValue1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_member);

        initObjects();
        memberName = (EditText) findViewById(R.id.editTextTextPersonName);
        memberPlace = (EditText) findViewById(R.id.editTextTextPersonName2);
        memberAddress = (EditText) findViewById(R.id.editTextTextPersonName3);
        memberContact = (EditText) findViewById(R.id.editTextTextPersonName4);
        proofNumber = (EditText) findViewById(R.id.editTextTextPersonName6);

        proofType = (Spinner) findViewById(R.id.spinner);
        chitValue = (Spinner) findViewById(R.id.spinner4);
    }

    public void addMember(View v) {
        name = memberName.getText().toString().trim();
        place = memberPlace.getText().toString().trim();
        address = memberAddress.getText().toString().trim();
        contact = memberContact.getText().toString().trim();
        prType = proofType.getSelectedItem().toString();
        prNumber = proofNumber.getText().toString();
        chitValue1 = chitValue.getSelectedItem().toString();

        databaseHelper.addMember(name,place,address,contact,prType,prNumber,chitValue1);
        Snackbar.make(v, "Member Added..!", Snackbar.LENGTH_LONG).show();
        clearFields();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
//        finish();
    }

    public void initObjects() {
        databaseHelper = new DatabaseHelper(activity);
    }

    public void clearFields(){
        memberName.setText("");
        memberPlace.setText("");
        memberAddress.setText("");
        memberContact.setText("");
        proofType.setSelection(0);
        proofNumber.setText("");
        chitValue.setSelection(0);
    }

    public void clear(View v){
        clearFields();
    }
}