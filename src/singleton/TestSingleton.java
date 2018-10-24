package singleton;

/**
 * @Auther: scp
 * @Date: 2018/10/24 15:32
 * @Description:
 */
public class TestSingleton {
    public static void main(String[] args) {
        System.out.println(SingletonDemo5.INSTANCE==SingletonDemo5.INSTANCE);
        SingletonDemo5.INSTANCE.singletonOperation();
    }
}