package com.example.sagar.biggernumberapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int num1, num2,points=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
practice();
    }
    private void practice() {
        Random randy = new Random();
        while(true) {


            num1 = randy.nextInt(10);
            num2 = randy.nextInt(10);
if(num1!=num2)
    break;
        }
        Button button = (Button) findViewById(R.id.button_left);
        Button button2 = (Button) findViewById(R.id.button_right);
        button.setText(String.valueOf(num1));
        button2.setText(String.valueOf(num2));


    }


        public void leftbuttonclick (View view)
        {

            if(num1>num2)

            {
                TextView mtv=(TextView)findViewById(R.id.points);
                points++;
                mtv.setText("points "+points);

                //correct
            }
            else
            {


                TextView mtv=(TextView)findViewById(R.id.points);
                points--;
                mtv.setText("points "+points);
                //incorrweetc
            }
practice();


        }
        public void rightbuttonclick (View view)
        {


            if(num2>num1)

            {

                TextView mtv=(TextView)findViewById(R.id.points);
                points++;
                mtv.setText("points "+points);
                //correct
            }
            else
            {

                TextView mtv=(TextView)findViewById(R.id.points);
                points--;
                mtv.setText("points "+points);
                 //incorrweetc
            }
practice();
        }



}