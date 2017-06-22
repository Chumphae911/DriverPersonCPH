package com.cph.drivers.driverperson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.w3c.dom.Text;

public class ListMain extends AppCompatActivity implements View.OnClickListener {

    private ImageView pDriverImageView, pQuestionImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_main);

        initialView();



    }//main madhod

    private void initialView() {
        pDriverImageView = (ImageView) findViewById(R.id.pdriver);
        pQuestionImageView = (ImageView) findViewById(R.id.pQuestion);

    }

    @Override
    public void onClick(View v) {

        int intIndex=0;

        switch (v.getId()){
            case R.id.pdriver:
                intIndex = 0;
                break;
            case R.id.pQuestion:
                intIndex = 1;
                break;
        }//switch



    }
}
