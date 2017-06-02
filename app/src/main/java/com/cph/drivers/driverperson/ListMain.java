package com.cph.drivers.driverperson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ListMain extends AppCompatActivity implements View.OnClickListener {

    private ImageView headImageView,bodyImageView, ButtonImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_main);

        headImageView = (ImageView) findViewById(R.id.imageView);
        bodyImageView = (ImageView) findViewById(R.id.imageView2);
        bodyImageView = (ImageView) findViewById(R.id.imageView3);

        headImageView.setOnClickListener(this);
        bodyImageView.setOnClickListener(this);
        bodyImageView.setOnClickListener(this);


    }//main madhod

    @Override
    public void onClick(View v) {

        int intIndex=0;

        switch (v.getId()){
            case R.id.imageView:
                intIndex = 0;
                break;
            case R.id.imageView2:
                intIndex = 1;
                break;
            case R.id.imageView3:
                intIndex = 2;
                break;
        }//switch



    }
}
