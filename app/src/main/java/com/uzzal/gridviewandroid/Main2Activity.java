package com.uzzal.gridviewandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv2 = findViewById(R.id.textView2);

        Intent intent = getIntent();
        String result = intent.getStringExtra("key");
        tv2.setText(result);

        if (result.equals("Dart")){

                tv2.setText(R.string.dart_text);
        }

    }


}
