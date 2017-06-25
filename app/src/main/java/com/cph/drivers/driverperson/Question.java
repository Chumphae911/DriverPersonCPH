package com.cph.drivers.driverperson;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question extends AppCompatActivity {

    private String driver1String, driver2String, phone1String, phone2String, phone3String, smoking1String,
            smoking2String, conduct1String, conduct2String;
    private RadioGroup driverRadioGroup,phoneRadioGroup,smokingRadioGroup,conductRadioGroup;
    private RadioButton driver1RadioButton, driver2RadioButton, phone1RadioButton, phone2RadioButton, phone3RadioButton,
            smoking1RadioButton, smoking2RadioButton, conduct1RadioButton, conduct2RadioButton;
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

    private void initialView() {
        driverRadioGroup = (RadioGroup) findViewById(R.id.Gdriver);
        phoneRadioGroup = (RadioGroup) findViewById(R.id.Gphone);
        smokingRadioGroup = (RadioGroup) findViewById(R.id.Gsmoking);
        conductRadioGroup = (RadioGroup) findViewById(R.id.Gconduct);
        driver1RadioButton = (RadioButton) findViewById(R.id.rdriverfast1);
        driver2RadioButton = (RadioButton) findViewById(R.id.rdriverfast2);
        phone1RadioButton = (RadioButton) findViewById(R.id.rphone1);
        phone2RadioButton = (RadioButton) findViewById(R.id.rphone2);
        phone3RadioButton = (RadioButton) findViewById(R.id.rphone3);
        smoking1RadioButton = (RadioButton) findViewById(R.id.rsmoking1);
        smoking2RadioButton = (RadioButton) findViewById(R.id.rsmoking2);
        conduct1RadioButton = (RadioButton) findViewById(R.id.rconduct1);
        conduct2RadioButton = (RadioButton) findViewById(R.id.rconduct2);
        back = (ImageView) findViewById(R.id.back);
        btnsave = (Button) findViewById(R.id.btnsave);
    }

    ////Create driverfastRadio Controller
    private void controller() {
        driverRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rdriverfast1:
                        driver1String = "0";
                        break;
                    case R.id.rdriverfast2:
                        driver2String = "1";
                        break;
                }
            }

        });
        //Create phoneRadio Controller
        phoneRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup,  int i) {
                switch (i) {
                    case R.id.rphone1:
                        phone1String = "2";
                        break;
                    case R.id.rphone2:
                        phone2String = "3";
                        break;
                    case R.id.rphone3:
                        phone3String = "4";
                        break;
                }
            }
        });
        //Create smokingRadio Controller
        smokingRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rsmoking1:
                        smoking1String = "5";
                        break;
                    case R.id.rsmoking2:
                        smoking2String = "6";
                        break;
                }
            }
        });
        //Create conductRadio Controller
        conductRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rconduct1:
                        conduct1String = "7";
                        break;
                    case R.id.rconduct2:
                        conduct2String = "8";
                        break;
                }
            }
        });
    }
}  //Main Class


