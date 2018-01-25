package 设计模式.创建型设计模式.简单工厂模式.具体产品类;

import android.util.Log;

import 设计模式.创建型设计模式.简单工厂模式.抽象产品类.Computer;

/**
 * Created by zeners on 2018/1/25.
 */

public class LenovoComputer extends Computer {
    private static final String TAG = "LenovoComputer";

    @Override
    public void start() {
        Log.w(TAG, "*** Lenovo Computer Start ***" );
    }

}
