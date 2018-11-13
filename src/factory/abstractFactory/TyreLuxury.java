package factory.abstractFactory;

/**
 * @Auther: y
 * @Date: 2018/11/13 15:18
 * @Description:
 */
public class TyreLuxury implements Tyre{
    @Override
    public void revolve() {
        System.out.println("旋转不磨损！");
    }
}