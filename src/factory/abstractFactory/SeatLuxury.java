package factory.abstractFactory;

/**
 * @Auther: y
 * @Date: 2018/11/13 14:58
 * @Description:
 */
public class SeatLuxury implements Seat {
    @Override
    public void comfortLevel() {
        System.out.println("真皮沙发,舒适");
    }
}