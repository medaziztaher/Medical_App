package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText userEmail;
    private EditText password;
    private List<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        userEmail = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextPassword);
        Button loginBtn = findViewById(R.id.loginBtn);

        userList = List.of(
                new User(1, "molka", "molka@gmail.com", "adminadmin", "res/drawable/img2.jpg","patient"),
        );

        List<User> users = new ArrayList<>();

        users.add(new User(1, "abdou", "abdou@gmail.com", "password1", "res/drawable/img_15848445674101.png","patient"));
users.add(new User(2,"nethir","nethir@gmail.com","","adminadmin","doctor"));

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredEmail = userEmail.getText().toString();
                String enteredPassword = password.getText().toString();

                if (enteredEmail.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your email", Toast.LENGTH_SHORT).show();
                } else if (enteredPassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                } else {
                    // Check if entered credentials match any user
                    boolean isCredentialsValid = false;
                    for (User user : userList) {
                        if (enteredEmail.equals(user.getEmail()) && enteredPassword.equals(user.getPassword())) {
                            isCredentialsValid = true;
                            break;
                        }
                    }

                    if (isCredentialsValid) {
                        // Successful login
                        //startActivity(new Intent(MainActivity.this, RegisterActivity.class));
                        Toast.makeText(MainActivity.this, "Your email and password are correct", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Your email or password is not correct", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}