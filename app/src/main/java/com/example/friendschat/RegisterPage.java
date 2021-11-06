package com.example.friendschat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterPage extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextUsername;
    EditText editTextPassword;
    Button buttonRegister;
    TextView warningMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        editTextEmail = findViewById(R.id.editText_Email);
        editTextUsername = findViewById(R.id.editText_Username);
        editTextPassword = findViewById(R.id.editText_Password);
        buttonRegister = findViewById(R.id.button_register);
        warningMsg = findViewById(R.id.textView_warringMessage);


    }

    public void  setRegisterBtnOnClick(View view){

        String email = editTextEmail.getText().toString();
        String username = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        if (email.isEmpty() || username.isEmpty() || password.isEmpty()){
            warningMsg.setText(getString(R.string.warning));
        }else {
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("email",email);
            intent.putExtra("username",username);
            intent.putExtra("password",password);
            startActivity(intent);
        }


    }
}