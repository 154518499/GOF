package factory.abstractFactory;

/**
 * @Auther: y
 * @Date: 2018/11/13 14:57
 * @Description:
 */
public class SeatLow implements Seat{
    @Override
    public void comfortLevel() {
        System.out.println("硬板,难受");
    }
}