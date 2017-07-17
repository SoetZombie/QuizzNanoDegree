package com.example.luke.quizznanodegree;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private EditText editText1;
    private EditText editText2;
    private int score;
    private Button results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        score = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio1 = (RadioButton)findViewById(R.id.radio1);
        radio2 = (RadioButton)findViewById(R.id.radio2);
        radio3 = (RadioButton)findViewById(R.id.radio3);
        checkBox1 = (CheckBox)findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkbox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkbox4);
        editText1 = (EditText)findViewById(R.id.edit_text_one);
        editText2 = (EditText)findViewById(R.id.edit_text_two);
        results = (Button)findViewById(R.id.show_results);

        results.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                getResults();
                Toast.makeText(getApplicationContext(),
                        "Your score was: " +getScore(), Toast.LENGTH_LONG).show();

            }
        });
    }
    public void reset(View view){
        score = 0;
    }


    public void questionOne(){
        if (radio2.isChecked()) {
        score += 1;
        }

    }

    public void questionTwo(){
        if( editText1.getText().toString().equals("Barrack")){
          score +=1;
      }
    }
    public void questionThree() {
        if(editText2.getText().toString().equals("Donald")) {
            score +=1;
        }
    }

    public void questionFour() {
        if(checkBox1.isChecked() && checkBox2.isChecked()) {
            score +=1;
        }
    }


    public void getResults(){
        questionOne();
        questionTwo();
        questionThree();
        questionFour();

    }



    public int getScore() {
        return score;
    }

}
