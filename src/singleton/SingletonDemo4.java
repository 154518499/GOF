package singleton;

/**
 * @Auther: scp
 * @Date: 2018/10/24 16:35
 * @Description: 静态内部类单例模式
 * 这种方式：线程安全，调用效率高，并且实现了延时加载！
 */
public class SingletonDemo4 {

    private static class SingletonClassInstance{
          private static final SingletonDemo4 instance=new SingletonDemo4();
    }

    public SingletonDemo4() {
    }

    public static SingletonDemo4 getInstance(){
        return SingletonClassInstance.instance;
    }
}