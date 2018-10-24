package singleton;

/**
 * @Auther: scp
 * @Date: 2018/10/24 16:05
 * @Description: 双重检查锁实现单例模式
 */
public class SingletonDemo3 {

    private static SingletonDemo3 instance=null;

    public SingletonDemo3() {
    }

    public static SingletonDemo3 getInstance(){
        if (instance == null){
            SingletonDemo3 sc;
            synchronized (SingletonDemo3.class){
                sc=instance;
                if (sc == null){
                    synchronized (SingletonDemo3.class){
                        if (sc == null){
                            sc=new SingletonDemo3();
                        }
                    }
                }
                instance=sc;
            }
        }
        return instance;
    }


}