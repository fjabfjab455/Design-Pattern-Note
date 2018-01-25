package 设计模式.创建型设计模式.建造者模式.Builder类;

/**
 * Created by zeners on 2018/1/25.
 */


import 设计模式.创建型设计模式.建造者模式.产品类.Computer;

/**
 * 功能：规范产品的组建
 *
 * 商家组装计算机有一套组装方法的模板，就是一个抽象的Builder类
 * 其里面提供了安装CPU、主板和内存的方法，以及组装成计算机的create方法，如下所示
 */
public abstract class Builder {
    public abstract void buildCpu (String cpu);
    public abstract void buildMainboard (String mainboard);
    public abstract void buildRam (String ram);

    public abstract Computer create();
}
