package com.cph.drivers.driverperson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question extends AppCompatActivity {

    private RadioButton rddriverfast1, rddriverfast2, rdphone1, rdphone2, rdphone3,rsmoking1,
            rsmoking2, rdconduct1, rdconduct2;
    private ImageView back;
    private Button btnsave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        //initialView
        initialView();

        //Controller
        controller();



    } //Main Method

    private void controller() {
        RadioButton.OnCheckedChangeListener myOptionOnClickListener = new RadioButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(Question.this,

                "RedioButton1 : " + rddriverfast1.isChecked() + "\n"+
                "RedioButtomn2" + rddriverfast2.isChecked() + "\n"+
                "RedioButtomn3" + rdphone1.isChecked() + "\n"+
                "RedioButtomn4" + rdphone2.isChecked() + "\n"+
                "RedioButtomn5" + rdphone3.isChecked() + "\n"+
                "RedioButtomn6" + rsmoking1.isChecked() + "\n"+
                "RedioButtomn7" + rsmoking2.isChecked() + "\n"+
                "RedioButtomn8" + rdconduct1.isChecked() + "\n"+
                "RedioButton9" + rdconduct2.isChecked(),
                        Toast.LENGTH_LONG).show();

            }
        };

    }

    private void initialView() {

        rddriverfast1 = (RadioButton) findViewById(R.id.rddriverfast1);
        rddriverfast2 = (RadioButton) findViewById(R.id.rddriverfast2);
        rdphone1 = (RadioButton) findViewById(R.id.rdphone1);
        rdphone2 = (RadioButton) findViewById(R.id.rdphone2);
        rdphone3 = (RadioButton) findViewById(R.id.rdphone3);
        rsmoking1 = (RadioButton) findViewById(R.id.rsmoking1);
        rsmoking2 = (RadioButton) findViewById(R.id.rsmoking2);
        rdconduct1 = (RadioButton) findViewById(R.id.rdconduct1);
        rdconduct2 = (RadioButton) findViewById(R.id.rdconduct2);
        back = (ImageView) findViewById(R.id.back);
        btnsave = (Button) findViewById(R.id.btnsave);
    }
}  //Main Class
