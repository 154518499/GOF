package factory.factoryMethod;

/**
 * @Auther: y
 * @Date: 2018/10/26 17:19
 * @Description:
 */
public class ICBCFactory implements BankFactory{
    @Override
    public Bank chooseBank() {
        return new ICBC();
    }
}