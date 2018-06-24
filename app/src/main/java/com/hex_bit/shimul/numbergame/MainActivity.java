package com.hex_bit.shimul.numbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int rand1;
    private int rand2;
    private int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        points=0;
        pickRandom();
    }
    private void pickRandom()
    {
        Random randy =new Random();
        rand1 = randy.nextInt(10);
        while(true)
        {
            rand2 = randy.nextInt(10);
            if (rand2!=rand1) break;
        }
        Button lbutton = (Button) findViewById(R.id.Leftbutton);
        lbutton.setText(Integer.toString(rand1));
        Button rbutton = (Button)findViewById(R.id.Rightbutton);
        rbutton.setText(Integer.toString(rand2));
    }
    public void leftButtonClick(View view) {
        //todo
        if (rand1>=rand2){
            points++;
            Toast.makeText(this,"Great Job",Toast.LENGTH_SHORT).show();
        }
        else {
            points--;
            Toast.makeText(this,"You Sucks",Toast.LENGTH_SHORT).show();
        }
        TextView textView=(TextView)findViewById(R.id.PointField);
        textView.setText("Points: "+points);
        pickRandom();
    }
    public void rightButtonClick(View view) {
        //todo
        if (rand2>=rand1){
            points++;
            Toast.makeText(this,"Great Job",Toast.LENGTH_SHORT).show();
        }
        else {
            points--;
        }
        TextView textView=(TextView)findViewById(R.id.PointField);
        textView.setText("Points: "+points);
        pickRandom();
    }


}
