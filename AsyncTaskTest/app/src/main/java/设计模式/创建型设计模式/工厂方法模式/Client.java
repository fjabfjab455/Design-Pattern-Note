package 设计模式.创建型设计模式.工厂方法模式;

import 设计模式.创建型设计模式.简单工厂模式.具体产品类.AsusComputer;
import 设计模式.创建型设计模式.简单工厂模式.具体产品类.HpComputer;
import 设计模式.创建型设计模式.简单工厂模式.具体产品类.LenovoComputer;

/**
 * Created by zeners on 2018/1/25.
 */

public class Client {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new XXComputerFactory();

        LenovoComputer lenovoComputer = computerFactory.createComputer(LenovoComputer.class);
//        LenovoComputer lenovoComputer = new XXComputerFactory().createComputer(LenovoComputer.class);
        lenovoComputer.start();

        HpComputer hpComputer = computerFactory.createComputer(HpComputer.class);
        hpComputer.start();

        AsusComputer asusComputer = computerFactory.createComputer(AsusComputer.class);
        asusComputer.start();

    }

}
