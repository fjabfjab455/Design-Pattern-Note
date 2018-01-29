package 设计模式.结构型设计模式.代理模式.简单代理;

import 设计模式.结构型设计模式.代理模式.简单代理.代理类.Purchasing;
import 设计模式.结构型设计模式.代理模式.简单代理.抽象主题类.Ishop;
import 设计模式.结构型设计模式.代理模式.简单代理.真实主题类.Zeners;

/**
 * Created by zeners on 2018/1/26.
 */

public class Client {
    public static void main(String[] args) {
        Ishop zeners = new Zeners();
        Ishop purchasing = new Purchasing(zeners);
        purchasing.buy();
    }

}
