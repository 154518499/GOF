package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: scp
 * @Date: 2018/12/20 15:28
 * @Description:
 */
public class MyInvocationHandler<T>implements InvocationHandler {
    //invocationHandler持有的被代理对象
    T target;

    public MyInvocationHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" +method.getName() + "方法");
        //System.out.println(Arrays.toString(args));
        args=new Object[]{888};
        MonitorUtil.start();
        Object result = method.invoke(target, args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}
