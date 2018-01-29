package 设计模式.结构型设计模式.代理模式.动态代理;

import java.lang.reflect.Proxy;

import 设计模式.结构型设计模式.代理模式.简单代理.抽象主题类.Ishop;
import 设计模式.结构型设计模式.代理模式.简单代理.真实主题类.Zeners;

/**
 * Created by zeners on 2018/1/29.
 */

public class Client {
    public static void main(String[] args) {
        Ishop zeners = new Zeners(); //创建Zeners
        DynamicPurchasing dynamicPurchasing = new DynamicPurchasing(zeners); //创建动态代理
        ClassLoader loader = zeners.getClass().getClassLoader(); //创建Zeners的ClassLoader
        Ishop purchasing = (Ishop) Proxy.newProxyInstance(loader, new Class[]{Ishop.class}, dynamicPurchasing); //动态创建代理类
        purchasing.buy();

    }
}
