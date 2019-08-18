package com.test.intentexample;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textInputLayout;
    private Button button, button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInputLayout = findViewById(R.id.editText2);
        button  = findViewById(R.id.button);
        button1  = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity_Firstway();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToSecondActivity_Secondway();
            }
        });
    }

    private void moveToSecondActivity_Firstway()
    {

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        Bundle b = new Bundle();
        b.putString(Contants.CONT_NAME, textInputLayout.getText().toString());
        b.putInt(Contants.CONT_AGE,23);
        intent.putExtras(b);
        startActivity(intent);
    }

    private void moveToSecondActivity_Secondway()
    {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        intent.putExtra(Contants.CONT_NAME,textInputLayout.getText().toString());
        intent.putExtra(Contants.CONT_AGE,23);

        startActivity(intent);
    }

}
