package com.uzzal.gridviewandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] images = {R.drawable.dartlogo, R.drawable.fluterlogo,
            R.drawable.javalogo, R.drawable.javascriptlogo, R.drawable.kotlinlogo,
            R.drawable.phplogo, R.drawable.pythonlogo};
    String[] proName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gridView = findViewById(R.id.gridView_id);

        proName = getResources().getStringArray(R.array.programming_name);

        CustomAdapter customAdapter = new CustomAdapter(this, proName, images);
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               String value = proName[position];

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("key",value);
                startActivity(intent);

                Toast.makeText(MainActivity.this, ""+value, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
