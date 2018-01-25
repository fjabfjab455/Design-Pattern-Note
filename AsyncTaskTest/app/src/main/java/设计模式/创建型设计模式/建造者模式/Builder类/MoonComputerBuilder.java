package 设计模式.创建型设计模式.建造者模式.Builder类;

/**
 * Created by zeners on 2018/1/25.
 */


import 设计模式.创建型设计模式.建造者模式.产品类.Computer;

/**
 * MoonComputerBuilder类用于组装计算机
 */
public class MoonComputerBuilder extends Builder {
    private Computer computer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildMainboard(String mainboard) {
        computer.setMainboard(mainboard);
    }

    @Override
    public void buildRam(String ram) {
        computer.setRam(ram);
    }

    @Override
    public Computer create() {
        return computer;
    }
}
