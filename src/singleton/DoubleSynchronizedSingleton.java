package singleton;

/**
 * @Auther: scp
 * @Date: 2018/10/24 16:05
 * @Description: 双重检查锁实现单例模式
 */
public class DoubleSynchronizedSingleton {

    private static DoubleSynchronizedSingleton instance=null;

    private DoubleSynchronizedSingleton() {
    }

    public static DoubleSynchronizedSingleton getInstance(){
        if (instance == null){
            DoubleSynchronizedSingleton sc;
            synchronized (DoubleSynchronizedSingleton.class){
                sc=instance;
                if (sc == null){
                    synchronized (DoubleSynchronizedSingleton.class){
                        if (sc == null){
                            sc=new DoubleSynchronizedSingleton();
                        }
                    }
                }
                instance=sc;
            }
        }
        return instance;
    }


}