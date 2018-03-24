package com.pulkit.www.udacity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText ed;
    Button btn;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = findViewById(R.id.input);
        btn = findViewById(R.id.button);

        ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 s=ed.getText().toString();

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("name",s);
                startActivity(i);
            }
        });
    }
}
