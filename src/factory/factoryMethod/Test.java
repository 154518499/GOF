package factory.factoryMethod;

/**
 * @Auther: y
 * @Date: 2018/10/26 17:23
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Bank icbc=new ICBCFactory().chooseBank();
        Bank ccb=new CCBFactory().chooseBank();
        icbc.applyCard();
        ccb.applyCard();
    }
}