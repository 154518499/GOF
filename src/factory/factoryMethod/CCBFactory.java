package factory.factoryMethod;

/**
 * @Auther: scp
 * @Date: 2018/10/26 17:21
 * @Description:
 */
public class CCBFactory implements BankFactory{
    @Override
    public Bank chooseBank() {
        return new CCB();
    }
}