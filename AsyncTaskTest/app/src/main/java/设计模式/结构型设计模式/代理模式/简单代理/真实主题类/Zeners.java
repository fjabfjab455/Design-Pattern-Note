package 设计模式.结构型设计模式.代理模式.简单代理.真实主题类;

import 设计模式.结构型设计模式.代理模式.简单代理.抽象主题类.Ishop;

/**
 * Created by zeners on 2018/1/26.
 */

public class Zeners implements Ishop {
    @Override
    public void buy() {
        System.out.println("购买");
    }
}
