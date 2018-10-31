package com.example.suranjan.fun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {
    @Override
    protected  void onCreate(Bundle b){
     super.onCreate(b);
     setContentView(R.layout.details_activity);
     try {
         Intent i = getIntent();
         String s = i.getStringExtra("num");
         TextView tt = findViewById(R.id.num2);
         tt.setText(s);
     }
     catch (Exception e)
     {
         e.printStackTrace();
         Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
     }
    }
}
