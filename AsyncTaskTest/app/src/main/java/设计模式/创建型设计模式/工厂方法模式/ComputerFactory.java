package 设计模式.创建型设计模式.工厂方法模式;

import 设计模式.创建型设计模式.简单工厂模式.抽象产品类.Computer;

/**
 * Created by zeners on 2018/1/25.
 */

public abstract class ComputerFactory {
    public abstract <T extends Computer> T createComputer(Class<T> clz);

}
