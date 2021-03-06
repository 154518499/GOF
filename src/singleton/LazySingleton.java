package singleton;

/**
 * @Auther: scp
 * @Date: 2018/10/24 15:26
 * @Description: 懒汉式单例模式
 */
public class LazySingleton {

    //类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
    private static LazySingleton instance;

    //防止反射
    private LazySingleton() throws Exception {
        if(instance !=null){
            throw new Exception("只能创建一个对象");
        }
    }

    //方法同步，调用效率低！
    public static synchronized LazySingleton getInstance() throws Exception {
        if (null == instance){
            instance= new LazySingleton();
        }
        return instance;
    }
}