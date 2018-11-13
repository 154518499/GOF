package factory.abstractFactory;

/**
 * @Auther: y
 * @Date: 2018/11/13 15:22
 * @Description:
 */
public class CarLowFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new EngineLow();
    }

    @Override
    public Seat createSeat() {
        return new SeatLow();
    }

    @Override
    public Tyre createTyre() {
        return new TyreLow();
    }
}