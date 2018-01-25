package 设计模式.创建型设计模式.建造者模式.导演类;

import 设计模式.创建型设计模式.建造者模式.Builder类.Builder;
import 设计模式.创建型设计模式.建造者模式.产品类.Computer;

/**
 * Created by zeners on 2018/1/25.
 */


/**
 * 功能：统一组装过程
 *
 * 商家的导演类用来规范组装计算机的流程，先安装主板，再安装CPU，最后安装内存，并组装成计算机
 */
public class Director {
    Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer(String cpu, String mainboard, String ram) {
        //规范建造流程
        this.builder.buildCpu(cpu);
        this.builder.buildMainboard(mainboard);
        this.builder.buildRam(ram);

        return builder.create();
    }

}
