package factory.abstractFactory;

/**
 * @Auther: y
 * @Date: 2018/11/13 14:53
 * @Description:
 */
public class EngineLow implements Engine{
    @Override
    public void run() {
        System.out.println("跑的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}