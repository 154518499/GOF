package factory.abstractFactory;

/**
 * @Auther: y
 * @Date: 2018/11/13 15:24
 * @Description:
 */
public class CarLuxuryFactory implements CarFactory{
    @Override
    public Engine createEngine() {
        return new EngineLuxury();
    }

    @Override
    public Seat createSeat() {
        return new SeatLuxury();
    }

    @Override
    public Tyre createTyre() {
        return new TyreLuxury();
    }
}