package 设计模式.结构型设计模式.代理模式.简单代理.代理类;

import 设计模式.结构型设计模式.代理模式.简单代理.抽象主题类.Ishop;

/**
 * Created by zeners on 2018/1/26.
 */

public class Purchasing implements Ishop {
    private Ishop ishop;
    public Purchasing(Ishop ishop) {
        this.ishop = ishop;
    }


    @Override
    public void buy() {
        ishop.buy();
    }
}
