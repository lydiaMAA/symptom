package com.example.symptome;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class Test extends AppCompatActivity  {

    Button btn1,btn2,btn3,btn4;
    TextView tvnombre,tvquestions;

    private Questions mesquestion= new Questions();
    private String mescorrection;
    private String meschoi;
    private int mscore=0;
    private int mesquestionlength = mesquestion.mesquestion.length;
    Random r;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        r=new Random();

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);

        tvnombre=findViewById(R.id.score);
        tvquestions=findViewById(R.id.question);
        tvnombre.setText("Nombre symptome est:"+mscore);

        updatequestion(r.nextInt(mesquestionlength));

      btn1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              if(btn1.getText()==mescorrection){
                  mscore++;
               tvnombre.setText("Nombre symptome est:"+mscore);
               updatequestion(r.nextInt(mesquestionlength));

              }else{
                  pasPorteurmaladie();
              }

          }
      });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btn2.getText()==mescorrection){
                    mscore++;
                    tvnombre.setText("Nombre symptome est:"+mscore);
                    updatequestion(r.nextInt(mesquestionlength));

                }else{
                    pasPorteurmaladie();
                }


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btn3.getText()==mescorrection){
                    mscore++;
                    tvnombre.setText("Nombre symptome est:"+mscore);
                    updatequestion(r.nextInt(mesquestionlength));

                }else{
                    pasPorteurmaladie();
                    updatequestion(r.nextInt(mesquestionlength));
                }


            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btn4.getText()==mescorrection){
                    mscore++;
                    tvnombre.setText("Nombre symptome est:"+mscore);
                    updatequestion(r.nextInt(mesquestionlength));

                }else{
                    pasPorteurmaladie();
                }


            }
        });


    }

    private void  updatequestion(int num){
        tvquestions.setText(mesquestion.getquestion(num));

       btn1.setText(mesquestion.getchoix1(num));
        btn2.setText(mesquestion.getchoix2(num));
       btn3.setText(mesquestion.getchoix3(num));
        btn4.setText(mesquestion.getchoix4(num));

        mescorrection=mesquestion.getcorrectAnswer(num);

    }

    private void pasPorteurmaladie(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Test.this);
        alertDialogBuilder.setMessage("Vous pouvez pas etre porteur de covid-19! ,Ton nombre de symptome est :"+mscore+ "Symptomes")
        .setCancelable(false)
           .setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {
                   startActivity(new Intent(getApplicationContext(),Test.class));

               }
           })
                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });

    }


}
