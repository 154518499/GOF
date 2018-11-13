package factory.abstractFactory;

/**
 * @Auther: y
 * @Date: 2018/11/13 14:54
 * @Description:
 */
public class EngineLuxury implements Engine{
    @Override
    public void run() {
        System.out.println("跑的快");
    }

    @Override
    public void start() {
        System.out.println("启动快");
    }
}