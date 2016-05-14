package com.example.djlewis.monetflash;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import mehdi.sakout.fancybuttons.FancyButton;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{

    private FancyButton registerButton;
    private EditText businessName;
    private final static  String APP_USER = "monetflash.app.preference.user";
    private final static String APP_AUTH = "monetflash.app.auth";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        businessName = (EditText) findViewById(R.id.businessNameeditText);
        registerButton = (FancyButton) findViewById(R.id.buttonRegister);
        registerButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonRegister){
            //save business name and setup preferences
            String name = businessName.getText().toString();
            PreferenceManager.getDefaultSharedPreferences(this)
                    .edit()
                    .putString(APP_USER, name)
                    .putBoolean(APP_AUTH, true)
                    .commit();
            Intent homeintent = new Intent(this, MainActivity.class);
            homeintent.putExtra(APP_USER, name);
            startActivity(homeintent);
            finish();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        //check if this is returning user, launch next activity at once
        boolean issetup = PreferenceManager.getDefaultSharedPreferences(this).getBoolean(APP_AUTH, false);
        String name = PreferenceManager.getDefaultSharedPreferences(this).getString(APP_USER, "Unknown");
        if(issetup) {
            Intent homeintent = new Intent(this, MainActivity.class);
            homeintent.putExtra(APP_USER, name);
            startActivity(homeintent);
        }
    }
}
