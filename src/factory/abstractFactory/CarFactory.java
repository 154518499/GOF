package factory.abstractFactory;

/**
 * @Auther: y
 * @Date: 2018/11/13 15:21
 * @Description:
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}