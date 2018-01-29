package 设计模式.结构型设计模式.装饰模式.装饰者具体实现类;

import 设计模式.结构型设计模式.装饰模式.抽象组件.Swordsman;
import 设计模式.结构型设计模式.装饰模式.抽象装饰者.Master;

/**
 * Created by zeners on 2018/1/29.
 */

public class HongQiGong extends Master {

    public HongQiGong(Swordsman swordsman) {
        super(swordsman);
    }

    public void teachAttackMagic() {
        System.out.println("洪七公教授打狗棒法");
        System.out.println("杨过使用打狗棒法");
    }

    @Override
    public void attackMagic() {
        super.attackMagic();
        teachAttackMagic();
    }

}
