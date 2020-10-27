package com.example.examplelogin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText usr,pwd;
        Button loginbtn;

        usr = (EditText) findViewById(R.id.emailtxt);
        pwd = (EditText) findViewById(R.id.passwordtxt);
        loginbtn = (Button) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usrdum = usr.getText().toString();
                String pwddum = pwd.getText().toString();

                if(usrdum.equals("ujicoba@gmail.com") && pwddum.equals("ujicoba")){
                    Toast.makeText(getApplicationContext(), "LOGIIN SUCCESCFUL", Toast.LENGTH_SHORT).show();
                        Intent welcomechange = new Intent(MainActivity.this, WelcomeActivity.class);
                        MainActivity.this.startActivity(welcomechange);
                        finish();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Email and Password INCORRECT!").setNegativeButton("Try Again", null).create().show();
                }
            }
        });
    }
}