package com.pulkit.www.udacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv,tv2;
        tv2 = findViewById(R.id.textView);

        String newString;
      Intent i=getIntent();
      newString=i.getStringExtra("name");
      tv2.setText(newString);
    }

}
