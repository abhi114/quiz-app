package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score=0;
    int wrong =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void check_box_ques(){
        CheckBox option1 = (CheckBox) findViewById(R.id.option_1_checkbox);
        boolean isOption1 = option1.isChecked();
        CheckBox option2 = (CheckBox) findViewById(R.id.option_2_checkbox);
        boolean isOption2 = option2.isChecked();
        CheckBox option3 = (CheckBox) findViewById(R.id.option_3_checkbox);
        boolean isOption3 = option3.isChecked();
        if(isOption1==true&&isOption2==true&&isOption3!=true){
            score=score+1;
        }else{
            wrong=wrong+1;
        }
    }
    public void question2(){
        EditText number = (EditText) findViewById(R.id.edit_text_ques);
        String answere =number.getText().toString();
        if(answere.compareTo("20")==0){
            score=score+1;
        }else{
            wrong=wrong+1;
        }
    }
    public void question3(){
        EditText number = (EditText) findViewById(R.id.edit_text_ques2);
        String answere =number.getText().toString();
        ;
        if(answere.compareTo("600")==0){
            score=score+1;
        }else{
            wrong=wrong+1;
        }
    }
    public void radio_ques(){
        RadioButton radioButton = (RadioButton) findViewById(R.id.no_radio_button);
        boolean isChecked = radioButton.isChecked();
        if(isChecked){
            score=score+1;

        }else{
            wrong=wrong+1;
        }
    }


    public void submit(View view){
        check_box_ques();
        question2();
        question3();
        radio_ques();
        Toast.makeText(this,"Right:"+score+"wrong:"+wrong,Toast.LENGTH_LONG).show();
        score=0;
        wrong=0;


    }



}
