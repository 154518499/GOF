package singleton;

/**
 * @Auther: scp
 * @Date: 2018/10/24 15:26
 * @Description: 懒汉式单例模式
 */
public class SingletonDemo2 {

    //类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
    private static SingletonDemo2 instance;

    public SingletonDemo2() {
    }

    //方法同步，调用效率低！
    public static SingletonDemo2 getInstance(){
        if (null == instance){
            instance= new SingletonDemo2();
        }
        return instance;
    }
}