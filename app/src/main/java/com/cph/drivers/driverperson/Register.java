package com.cph.drivers.driverperson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText, lnameEditText, idEditText, talEditText, userEditText, pwEditText, cpwEditText,
            imageUploadEditText;
    private Button bntUpload, rSubmit;
    private String nameString, lnameString, idString, talString, userString, pwString, cpwString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        initialView();

        controller();

    }  //Main Method


    private void controller() {
        rSubmit.setOnClickListener(Register.this);

    }



    private void initialView() {

        nameEditText = (EditText) findViewById(R.id.editrusername);
        lnameEditText = (EditText) findViewById(R.id.editrlname);
        idEditText = (EditText) findViewById(R.id.editpid);
        talEditText = (EditText) findViewById(R.id.edittal);
        userEditText = (EditText) findViewById(R.id.edituser);
        pwEditText = (EditText) findViewById(R.id.editpw);
        cpwEditText = (EditText) findViewById(R.id.editcpw);
        imageUploadEditText = (EditText) findViewById(R.id.imageUpload);
        bntUpload = (Button) findViewById(R.id.btnUpload);
        rSubmit = (Button) findViewById(R.id.rSupmit);

    }

    @Override
    public void onClick(View v) {

        if (v == rSubmit) {

            //Get Value From Edit Text ดึงค่าจาก Editer มาประมวลผล
            nameString = nameEditText.getText().toString().trim();
            lnameString = lnameEditText.getText().toString().trim();
            idString = idEditText.getText().toString().trim();
            talString = talEditText.getText().toString().trim();
            userString = userEditText.getText().toString().trim();
            pwString = pwEditText.getText().toString().trim();
            cpwString = cpwEditText.getText().toString().trim();

            //Check Space

            if (nameString.equals("") || lnameString.equals("") || idString.equals("") || talString.equals("") || userString.equals("") ||
                    pwString.equals("") || cpwString.equals("")) {

                //Have Space
                Myalert myalert = new Myalert(Register.this);
                myalert.myDialog("มีช่องว่าง", "กรุณากรอกให้ครบทุกช่อง");

            }
            else {
                //No Space
            }

        }

    }
}  //Main class
