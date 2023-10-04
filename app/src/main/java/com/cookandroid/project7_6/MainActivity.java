package com.cookandroid.project7_6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton dog, cat, rabbit, horse;
    Button btn1;
    View dialogView;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        dog = (RadioButton) findViewById(R.id.dog);
        cat = (RadioButton) findViewById(R.id.cat);
        rabbit = (RadioButton) findViewById(R.id.rabbit);
        horse = (RadioButton) findViewById(R.id.horse);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView = View.inflate(MainActivity.this, R.layout.dialog, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);

                imgView = dialogView.findViewById(R.id.imgView);
                dlg.setView(dialogView);

                if(dog.isChecked()){
                    imgView.setImageResource(R.drawable.dog);
                    dlg.setTitle("강아지");
                } else if(cat.isChecked()){
                    imgView.setImageResource(R.drawable.cat);
                    dlg.setTitle("고양이");
                } else if(rabbit.isChecked()){
                    imgView.setImageResource(R.drawable.rabbit);
                    dlg.setTitle("토끼");
                } else if(horse.isChecked()){
                    imgView.setImageResource(R.drawable.horse);
                    dlg.setTitle("말");
                }
                dlg.setNegativeButton("닫기",null);
                dlg.show();
            }
        });
    }
}