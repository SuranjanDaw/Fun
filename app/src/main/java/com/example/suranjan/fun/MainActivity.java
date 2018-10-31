package com.example.suranjan.fun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    TextView tt;
    public String number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("aa","App opened");
        ed = findViewById(R.id.num);
        tt = findViewById(R.id.num1);
    }

    public void getNum(View view) {
        try {
            String num = ed.getText().toString();
            int num1 = Integer.parseInt(num);
            number = num;
            tt.setText(num1+"");
            Toast.makeText(this,"The number entered is:"+num1,Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Log.d("aa","Some error has happened");
            Toast.makeText(this,"Some problem has been encountered!!",Toast.LENGTH_LONG).show();
        }

    }

    public void next(View view) {
        Intent i = new Intent(this,DetailsActivity.class);
        i.putExtra("num",number);
        startActivity(i);
    }
}
