package singleton;


/**
 * @Auther: scp
 * @Date: 2018/10/24 17:00
 * @Description: 枚举实现单例模式
 */
public enum EnumSingleton {
    //这个枚举元素，本身就是单例对象！
    INSTANCE;
    //添加自己需要的操作！
    public void singletonOperation(){
        System.out.println("a enum singleton");
    }
}
