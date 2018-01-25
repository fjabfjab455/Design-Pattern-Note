package 设计模式.创建型设计模式.单例模式;

/**
 * Created by zeners on 2018/1/25.
 */

public class Singleton {


    /**
     * 饿汉模式
     * 在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
     * 这种方式基于类加载机制，避免了多线程的同步问题，在类加载的时候就完成了实例化，没有达到懒加载的效果
     * 如果一直未使用这个实例，会造成内存的浪费
     */
//    private static Singleton instance = new Singleton();
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }


    /**
     * 懒汉模式（线程不安全）
     * 声明了一个静态对象，在用户第一次调用的时候会初始化
     * 虽然节约了资源，但第一次加载需要实例化，反应稍慢，且在多线程时不能正常工作
     */
//    private static Singleton instance;
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) instance = new Singleton();
//
//        return instance;
//    }






    /**
     * 懒汉模式（线程安全）
     * 它能够在多线程中很好地工作
     * 但每次调用getInstance()方法时都需要同步，造成不必要的开销
     * 而且大部分时候我们是不需要同步的，所以不建议使用该模式
     */
//    private static Singleton instance;
//    private Singleton() {
//    }
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null) instance = new Singleton();
//
//        return instance;
//    }





    /**
     * 双重检查模式（DCL）
     * 进行两次判空：
     * 第一次是为了不必要的同步
     * 第二次是在Singleton为null的情况下才创建实例
     *
     * 这里使用volatile虽然会影响性能，但考虑到程序的正确性，值得牺牲这点性能
     *
     * DCL的优点是资源利用率高，第一次执行getInstance()时单例对象才被实例化，效率高
     * 缺点是第一次加载反应稍慢，在高并发的环境下有缺陷
     * DCL虽然在一定程度上解决了资源的消耗和多余的同步、线程安全等问题，但在某些情况下还是会出现失效的问题，即DCL失效
     * 所以建议使用静态内部类单例来替代DCL
     */
//    private volatile static Singleton instance;
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) instance = new Singleton();
//            }
//        }
//
//        return instance;
//    }










    /**
     * 静态内部类单例模式
     * 第一次加载Singleton类时并不会初始化sInstance，只有第一次调用getInstance()方法时虚拟机加载SingletonHolder并初始化sInstance
     * 这样不仅能保证线程安全，也能保证Singleton类的唯一性，所以推荐使用该方法
     */
//    private Singleton() {
//    }
//
//    static Singleton getInstance() {
//        return SingletonHolder.sInstance;
//    }
//
//    private static class SingletonHolder {
//        private static final Singleton sInstance  = new Singleton();
//    }








    /**
     * 枚举单例
     * 默认枚举实例的创建是线程安全的，并且在任何情况下都是单例
     */
//    public enum Singleton {
//        INSTANCE;
//        public void doSometing() {
//            //do someting...
//        }
//    }










    public String getHello() {
        return "Hello,world! ";
    }

}
