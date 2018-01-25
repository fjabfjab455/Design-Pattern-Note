package 设计模式.创建型设计模式.工厂方法模式;

import 设计模式.创建型设计模式.简单工厂模式.抽象产品类.Computer;

/**
 * Created by zeners on 2018/1/25.
 */

public class XXComputerFactory extends ComputerFactory {
    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer computer = null;
        String className = clz.getName();

        try {
            //通过反射来产生不同厂家的计算机
            computer = (Computer) Class.forName(className).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return (T) computer;
    }
}
