package 设计模式.结构型设计模式.装饰模式;

import 设计模式.结构型设计模式.装饰模式.组件具体实现类.YangGuo;
import 设计模式.结构型设计模式.装饰模式.装饰者具体实现类.HongQiGong;
import 设计模式.结构型设计模式.装饰模式.装饰者具体实现类.OuYangFeng;

/**
 * Created by zeners on 2018/1/29.
 */

public class Client {
    public static void main(String[] args) {
        YangGuo yangGuo = new YangGuo(); //创建杨过
        HongQiGong hongQiGong = new HongQiGong(yangGuo); //洪七公向杨过传授打狗棒法，杨过学会了打狗棒法
        hongQiGong.attackMagic();
        OuYangFeng ouYangFeng = new OuYangFeng(yangGuo); //欧阳锋向杨过传授蛤蟆功，杨过学会了蛤蟆功
        ouYangFeng.attackMagic();
    }

}
