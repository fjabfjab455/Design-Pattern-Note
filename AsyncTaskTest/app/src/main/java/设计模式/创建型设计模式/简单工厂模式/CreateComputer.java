package 设计模式.创建型设计模式.简单工厂模式;

import 设计模式.创建型设计模式.简单工厂模式.工厂类.ComputerFactory;

/**
 * Created by zeners on 2018/1/25.
 */




/**
 * 使用场景：
 *   # 工厂类负责创建的对象比较少
 *   # 客户只需知道传入工厂类的参数，而无需关心创建对象的逻辑
 * 优点：
 *   # 使用户根据参数获得对应类的实例，避免了直接实例化类，降低了耦合性
 * 缺点：
 *   # 可实例化的类型在编译期间已经被确定，如果增加新类型，则需要修改工厂，这违背了开放封闭原则
 *   # 简单工厂需要知道所有要生产的类型，其当子类过多或者子类层次过多时不适合使用
 *
 */
public class CreateComputer {
    public static void main(String[] args) {
        ComputerFactory.createComputer("hp").start();
    }


}
