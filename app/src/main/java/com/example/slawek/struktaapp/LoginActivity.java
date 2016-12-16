package com.example.slawek.struktaapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebHistoryItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText textEmail;
    private EditText textPassword;
    private Button loginBtn;
    private int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button) findViewById(R.id.btn_login);
        textEmail = (EditText) findViewById(R.id.input_email);
        textPassword = (EditText) findViewById(R.id.input_password);

        color = ((ColorDrawable)loginBtn.getBackground()).getColor();


        loginBtn.setEnabled(false);

        textEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                  String s = editable.toString();
                  String p = textPassword.getText().toString();

                 if(s.equals("") && p.equals("") || s.equals("") || p.equals(""))
                 {
                     disableLoginButton();
                 }
                else
                 {
                     enableLoginButton();
                 }
            }
        });


        textPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                String p = editable.toString();
                String s = textEmail.getText().toString();

                if(p.equals("") && s.equals("") || p.equals("") || s.equals(""))
                {
                    disableLoginButton();
                }
                else
                {
                    enableLoginButton();
                }
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = textEmail.getText().toString();
                String password = textPassword.getText().toString();

                if(username.trim().length() > 0 && password.trim().length() > 0)
                {
                    if(username.equals("a") && password.equals("a"))
                    {
                        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Wrong Email or Password",Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please fill all fields",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void enableLoginButton()
    {
        loginBtn.setEnabled(true);
        loginBtn.setBackgroundColor(Color.WHITE);
        loginBtn.setTextColor(Color.BLACK);
    }

    private  void disableLoginButton()
    {
        loginBtn.setEnabled(false);
        loginBtn.setBackgroundColor(color);
        loginBtn.setTextColor(Color.WHITE);
    }

}
