package 设计模式.结构型设计模式.外观模式;

import 设计模式.结构型设计模式.外观模式.外观类.ZhangWuJi;

/**
 * Created by zeners on 2018/1/29.
 */

public class Client {
    public static void main(String[] args) {
        ZhangWuJi zhangWuJi = new ZhangWuJi();
        zhangWuJi.Qiankun(); //张无忌使用乾坤大挪移
        zhangWuJi.QiShang(); //张无忌使用七伤拳
    }

}
