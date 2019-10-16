package com.example.hw1bigger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    Button bigger ;
    Button smaller ;
    TextView txv;
    int fontsize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bigger =(Button)findViewById(R.id.bigger);
        smaller =(Button)findViewById(R.id.smaller);

        bigger.setOnClickListener(this);
        smaller.setOnClickListener(this);

        txv = (TextView)findViewById(R.id.txv);
        fontsize = 30;
        txv.setTextSize(fontsize);

    }




    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.bigger)
        {
            if(fontsize <200)
                fontsize++;
            txv.setTextSize(fontsize);

        }

        else{
            if(fontsize >10)
                fontsize--;
            txv.setTextSize(fontsize);
        }



    }
}
