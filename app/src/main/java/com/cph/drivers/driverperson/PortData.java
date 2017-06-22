package com.cph.drivers.driverperson;

import android.content.Context;
import android.os.AsyncTask;
import android.speech.tts.Voice;
import android.util.Log;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

/**
 * Created by CPHchum on 18/6/2560.
 */

public class PortData extends AsyncTask<String, Void, String>{

    private Context context;
    private  static  final  String urlPHP = "";

    public PortData(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(String... params) {
        try {

            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd", "true")
                    .add("pid",params[0])
                    .add("firstname", params[1])
                    .add("lastName", params[2])
                    .add("idcard", params[3])
                    .add("tal", params[4])
                    .add("user", params[5])
                    .add("pw", params[6])
                    .build();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url(urlPHP).post(requestBody).build();
            Response response = okHttpClient.newCall(request).execute();
            return response.body().toString();

        } catch (Exception e ) {
            Log.d("18JuneV1", "e doin ==>" + e.toString());
            return null;
        }

    }
}  //Mian Class

