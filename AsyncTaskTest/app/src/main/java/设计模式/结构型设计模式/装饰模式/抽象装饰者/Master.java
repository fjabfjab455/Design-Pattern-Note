package 设计模式.结构型设计模式.装饰模式.抽象装饰者;

import 设计模式.结构型设计模式.装饰模式.抽象组件.Swordsman;

/**
 * Created by zeners on 2018/1/29.
 */

public abstract class Master extends Swordsman{
    private Swordsman swordsman;
    public Master(Swordsman swordsman) {
        this.swordsman = swordsman;
    }

    @Override
    public void attackMagic() {
        swordsman.attackMagic();
    }

}
