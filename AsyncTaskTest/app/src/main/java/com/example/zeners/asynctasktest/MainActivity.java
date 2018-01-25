package com.example.zeners.asynctasktest;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ImageView imageView;
    private Button bt_download;
    private ProgressDialog progressDialog;
    private String path = "http://img.pconline.com.cn/images/photoblog/5/3/7/5/5375781/20096/6/1244302842840.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        bt_download = (Button) findViewById(R.id.bt_download);
        progressDialog = new ProgressDialog(this);

        bt_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyAsyncTask myAsynTask = new MyAsyncTask (imageView, progressDialog);
                myAsynTask.execute(path);
            }
        });





//        String hello = Singleton.getInstance().getHello();
//        Log.w(TAG, "onCreate: " + hello );




    }
}
