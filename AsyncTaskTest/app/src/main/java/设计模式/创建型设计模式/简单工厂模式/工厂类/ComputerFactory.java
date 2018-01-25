package 设计模式.创建型设计模式.简单工厂模式.工厂类;

import 设计模式.创建型设计模式.简单工厂模式.具体产品类.AsusComputer;
import 设计模式.创建型设计模式.简单工厂模式.具体产品类.HpComputer;
import 设计模式.创建型设计模式.简单工厂模式.具体产品类.LenovoComputer;
import 设计模式.创建型设计模式.简单工厂模式.抽象产品类.Computer;

/**
 * Created by zeners on 2018/1/25.
 */

public class ComputerFactory {
    public static Computer createComputer(String type) {
        Computer computer = null;
        switch (type) {
            case "lenovo":
                computer = new LenovoComputer();
                break;
            case "hp":
                computer = new HpComputer();
                break;
            case "asus":
                computer = new AsusComputer();
                break;
            default:
                break;
        }
        return computer;
    }


}
