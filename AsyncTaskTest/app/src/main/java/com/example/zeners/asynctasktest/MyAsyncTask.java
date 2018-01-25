package com.example.zeners.asynctasktest;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by zeners on 2018/1/24.
 */

public class MyAsyncTask extends AsyncTask<String, Integer, Bitmap> {

    private ImageView imageView;
    private ProgressDialog progressDialog;

    public MyAsyncTask(ImageView imageView, ProgressDialog progressDialog) {
        this.imageView = imageView;
        this.progressDialog = progressDialog;
    }



    /**
     * 预处理，UI线程调用
     */
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog.setTitle("当前任务");
        progressDialog.setMessage("正在下载...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.show();

    }


    /**
     * 后台处理，异步线程
     */
    @Override
    protected Bitmap doInBackground(String... params) {
        String path = params[0];
        Bitmap bitmap = null;
        InputStream inputStream;
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(path)
                .build();
        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();

            inputStream = response.body().byteStream();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            long fileSize = response.body().contentLength();//获取文件大小
            byte[] data = new byte[1024]; //每次读取的大小
            int length; //本次读取的大小
            int total = 0; //累计的大小
            while ((length = inputStream.read(data)) != -1) {
                total += length;
                int value = (int) (total / fileSize * 100);
                publishProgress(value); //触发onProgressUpdate()进行UI更新
                outputStream.write(data, 0, length);
            }
            byte[] result = outputStream.toByteArray(); //转化为字节数组
            bitmap = BitmapFactory.decodeByteArray(result, 0, result.length);
            inputStream.close();

        }catch (Exception e) {
            e.printStackTrace();
        }

        return bitmap;
    }


    /**
     * 实时UI更新操作，UI线程调用（例如可用于进度条更新）
     */
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        progressDialog.setProgress(values[0]);

    }


    /**
     * 返回操作结果，UI线程调用，AsyncTask结束
     */
    @Override
    protected void onPostExecute(Bitmap result) {
        super.onPostExecute(result);
        progressDialog.dismiss();
        imageView.setImageBitmap(result);

    }



}
