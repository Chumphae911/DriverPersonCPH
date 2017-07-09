package com.cph.drivers.driverperson;

        import android.content.Intent;
        import android.support.annotation.IdRes;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;
    private  String userString, passwordString, tableString = "Driver";
    private RadioGroup userRadioGroup;
    private RadioButton personRadioButton, departmentRadioButton;
    private int tableAnInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //initialView
        initialView();

        //Controller
        radioController();



    } //Mian methot

    private void radioController() {
        userRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.Hperson:
                        tableAnInt = 0;
                        tableString = "Driver";
                        break;
                    case R.id.Hdepartment:
                        tableAnInt = 1;
                        tableString = "Hdepartmen";
                        break;
                    default:
                        tableAnInt = 0;
                        tableString = "Driver";
                        break;
                }
            }
        });
    }


    private void initialView() {

        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtNewRegis);
        button = (Button) findViewById(R.id.btnLogin);

    }


    @Override
    public void onClick(View v) {

        //For TextView
        if (v == textView) {

            //Intent to Register
            Intent intent = new Intent(LoginActivity.this, Register.class);
            startActivity(intent);

        }

        //For Button
        if (v == button) {

            //Get Value From EditText
            userString = userEditText.getText().toString().trim();
            passwordString = passwordEditText.getText().toString().trim();

            //Check Error
            if (userString.equals("") || passwordString.equals("")) {
                //Have Space
                Myalert myalert = new Myalert(LoginActivity.this);
                myalert.myDialog("Have Space", "Please Fill All Every Blank");

            } else {
                //No Error
                checkUserAnPass();
            }
        }
    }

    private void checkUserAnPass() {
        if (tableAnInt == 0) {
            checkUser();
        } else {
            checkPassengerUser();
        }

    }

    private void checkUser() {

    }
    private void checkPassengerUser() {

    }

}//Main class
