package 设计模式.创建型设计模式.建造者模式;

/**
 * Created by zeners on 2018/1/25.
 */


import 设计模式.创建型设计模式.建造者模式.Builder类.Builder;
import 设计模式.创建型设计模式.建造者模式.Builder类.MoonComputerBuilder;
import 设计模式.创建型设计模式.建造者模式.导演类.Director;

/**
 * 使用场景：
 *   # 创建复杂对象的算法应该独立于该对象的组成部分以及他们的装配方式时
 *   # 相同的方法，不同的执行顺序，产生不同的事件结果时
 *   # 多个部件或零件都可以被装配到一个对象中，但是产生的运行结果又不相同时
 *   # 产品类非常复杂，或者产品类中的调用顺序不同而产生了不同的效果时
 *   # 在创建一些复杂的对象时，这些对象的内部组成构件间的建造顺序是稳定的，但是对象内部组成构件面临着复杂的变化
 * 优点：
 *   # 使用建造者模式可以使客户端不必知道产品内部组成的细节
 *   # 具体的建造者类之间是相互独立的，容易扩展
 *   # 由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对其他的模块产生任何影响
 * 缺点：
 *   # 产生多余的Builder对象以及导演类
 *
 * */
public class CreateComputer {
    public static void main(String[] args) {
        Builder builder = new MoonComputerBuilder();
        Director director = new Director(builder);
        //开始组装计算机
        director.createComputer("i7-6700", "华擎玩家至尊", "三星 DDR4");
    }

}
