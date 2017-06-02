package com.cph.drivers.driverperson;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //initialView
        initialView();

        //Controller
        controller();
    }

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


        }

        //For Button
        if (v == button) {

        }
    }
}//Main clasd
