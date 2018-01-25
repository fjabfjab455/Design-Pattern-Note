package 设计模式.创建型设计模式.建造者模式.产品类;

/**
 * Created by zeners on 2018/1/25.
 */

public class Computer {
    private String cpu;
    private String mainboard;
    private String ram;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

}
