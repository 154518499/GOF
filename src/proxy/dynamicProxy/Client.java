package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Auther: scp
 * @Date: 2018/12/20 15:35
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建一个实例对象，这个对象是被代理的对象
        Person s=new Student("张三");

        //创建一个与代理对象相关联的InvocationHandler
        InvocationHandler sHandler = new MyInvocationHandler<Person>(s);
        //创建一个代理对象
        Person sProxy=(Person)Proxy.newProxyInstance(Person.class.getClassLoader(),new Class<?>[]{Person.class}, sHandler);
        sProxy.giveMoney(666);
    }
}
