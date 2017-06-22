package com.cph.drivers.driverperson;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;
    private  String userString, passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //initialView
        initialView();

        //Controller
        controller();


    } //Mian methot


    private void controller() {
        textView.setOnClickListener(LoginActivity.this);
        button.setOnClickListener(LoginActivity.this);
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

            //Check Space
            if (userString.equals("") || passwordString.equals("")) {
                //Have Space
                Myalert myalert = new Myalert(LoginActivity.this);
                myalert.myDialog("Have Space", "Please Fill All Every Blank");

            } else {
                //No Space
                checkUserAnPass();
            }
        }
    }

    private void checkUserAnPass() {


    }
}//Main clasd
