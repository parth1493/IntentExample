package com.test.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.textView);

        StringBuilder msg = new StringBuilder("Welcome \n");

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b.containsKey(Contants.CONT_NAME))
        {
            String name = b.getString(Contants.CONT_NAME, " my name");
            msg.append(name);
        }
        if(b.containsKey(Contants.CONT_AGE))
        {
            int age = b.getInt(Contants.CONT_AGE);
            msg.append("\n").append(age).append(" years old");
        }
        textView.setText(msg);

    }
}
