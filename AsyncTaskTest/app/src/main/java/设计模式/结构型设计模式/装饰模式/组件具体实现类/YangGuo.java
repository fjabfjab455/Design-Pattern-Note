package 设计模式.结构型设计模式.装饰模式.组件具体实现类;

import 设计模式.结构型设计模式.装饰模式.抽象组件.Swordsman;

/**
 * Created by zeners on 2018/1/29.
 */

public class YangGuo extends Swordsman {
    @Override
    public void attackMagic() {
        //杨过初始的武学是全真剑法
        System.out.println("杨过使用全真剑法");
    }
}
