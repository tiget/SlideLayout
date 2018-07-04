package com.example.tiget.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    public static ImageView imageView;
    float fromPosition;
    float y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        RelativeLayout root = findViewById(R.id.root);
        root.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {


                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    imageView.setBackgroundColor(Color.BLUE);
                    //imageView.setY(y);
                } else if(motionEvent.getAction() == MotionEvent.ACTION_MOVE){
                    imageView.setBackgroundColor(Color.BLUE);
                    imageView.setY(motionEvent.getY());
                }
                return true;
            }
        });
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }


/*
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
            imageView.setBackgroundColor(Color.BLUE);
        } else if(motionEvent.getAction() == MotionEvent.ACTION_UP){
            imageView.setBackgroundColor(Color.GREEN);
        }
        return false;
    }
    */
}

