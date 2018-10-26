package factory.staticFactory;

/**
 * @Auther: y
 * @Date: 2018/10/26 17:05
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Bank icbc=BankFactory.chooseBank(1);
        icbc.applyCard();
        Bank ccb=BankFactory2.chooseCCB();
        ccb.applyCard();

    }
}