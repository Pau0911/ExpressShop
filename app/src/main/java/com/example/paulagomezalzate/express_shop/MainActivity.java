package com.example.paulagomezalzate.express_shop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Contienen los datos ingresados por el usuario
        username = findViewById(R.id.name);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        //Va a la siguiente ventana
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PurchaseHistoryActivity.class);
            }
        });


    }
}
