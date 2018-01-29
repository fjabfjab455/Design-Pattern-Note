package 设计模式.结构型设计模式.代理模式.动态代理;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zeners on 2018/1/26.
 */

public class DynamicPurchasing implements InvocationHandler {
    private static final String TAG = "DynamicPurchasing";
    private Object obj;
    public DynamicPurchasing(Object obj) {
        this.obj = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        if (method.getName().equals("buy") ) Log.i(TAG, "*** Zeners' shopping *** ");

        return result;
    }
}
