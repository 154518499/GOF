package factory.abstractFactory;

/**
 * @Auther: y
 * @Date: 2018/11/13 15:25
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        CarFactory factory1=new CarLowFactory();
        CarFactory factory2=new CarLuxuryFactory();
        factory1.createEngine().run();
        factory2.createEngine().run();

    }



}