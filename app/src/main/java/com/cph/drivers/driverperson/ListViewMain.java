package com.cph.drivers.driverperson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewMain extends AppCompatActivity {

    private ListView listView;

    private ArrayList<ListView_Item> data_normal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_main);

        //Initail View
        initailView();

        //Controller
        controller();


    } // Main Method

    private void initailView() {



    }

    private void controller() {

    }


}
