package 设计模式.结构型设计模式.外观模式.外观类;

/**
 * Created by zeners on 2018/1/29.
 */

import 设计模式.结构型设计模式.外观模式.子系统类.JingMai;
import 设计模式.结构型设计模式.外观模式.子系统类.NeiGong;
import 设计模式.结构型设计模式.外观模式.子系统类.Zhaoshi;

/**
 * 外观类张无忌
 */
public class ZhangWuJi {
    private JingMai jingMai;
    private Zhaoshi zhaoshi;
    private NeiGong neiGong;

    public ZhangWuJi() {
        jingMai = new JingMai();
        zhaoshi = new Zhaoshi();
        neiGong = new NeiGong();
    }

    /**
     * 使用乾坤大挪移
     */
    public void Qiankun() {
        jingMai.jingmai(); //开启经脉
        neiGong.QianKun(); //使用内功乾坤大挪移
    }

    /**
     * 使用七伤拳
     */
    public void QiShang() {
        jingMai.jingmai(); //开启经脉
        neiGong.JiuYang(); //使用内功九阳神功
        zhaoshi.QiShangQuan(); //使用招式七伤拳
    }




}
