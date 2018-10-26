package singleton;

/**
 * @Auther: scp
 * @Date: 2018/10/24 15:32
 * @Description:
 */
public class TestSingleton {
    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance()==LazySingleton.getInstance());
        System.out.println(EnumSingleton.INSTANCE== EnumSingleton.INSTANCE);
        EnumSingleton.INSTANCE.singletonOperation();
    }
}