package com.cph.drivers.driverperson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import org.w3c.dom.Text;

public class Deliver extends AppCompatActivity implements View.OnClickListener {

    private Text AnuserText;
    private EditText DplaceEditText, DSubjectEditText;
    private Spinner vinceSpinner, provinceSpinner, amphurSpinner, urgencySpinner;
    private Button btnDSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliver);

        initail();

        controller();



    }// Main Merthod

    private void controller() {

        btnDSubmit.setOnClickListener(Deliver.this);
        vinceSpinner.setOnClickListener(Deliver.this);
    }

    private void initail() {

        AnuserText = (Text) findViewById(R.id.txtAnuser);
        DplaceEditText = (EditText) findViewById(R.id.Dplace);
        DplaceEditText = (EditText) findViewById(R.id.DSubject);
        vinceSpinner = (Spinner) findViewById(R.id.vince);
        provinceSpinner = (Spinner) findViewById(R.id.Province);
        amphurSpinner = (Spinner) findViewById(R.id.amphur);
        urgencySpinner = (Spinner) findViewById(R.id.Urgency);
        btnDSubmit = (Button) findViewById(R.id.btnDSubmit);

    }

    // ปุ่มบันทึกหน้าฝากรับ-ส่ง
    @Override
    public void onClick(View v) {


    }
}// Main Class
