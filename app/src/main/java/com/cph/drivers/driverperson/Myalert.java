package com.cph.drivers.driverperson;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by CPHchum on 18/6/2560.
 */

public class Myalert {

    private Context context;


    public Myalert(Context context) {
        this.context = context;
    }

    public Myalert() {

    }

    public void myDialog(String strTitle, String strMassage) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.mipmap.ic_icon);
        builder.setTitle(strTitle);
        builder.setMessage(strMassage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }


} //Main Class
