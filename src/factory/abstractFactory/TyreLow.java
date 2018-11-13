package factory.abstractFactory;

/**
 * @Auther: y
 * @Date: 2018/11/13 15:16
 * @Description:
 */
public class TyreLow implements Tyre{
    @Override
    public void revolve() {
        System.out.println("旋转磨损快！");
    }
}