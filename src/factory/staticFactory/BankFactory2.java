package factory.staticFactory;

/**
 * @Auther: y
 * @Date: 2018/10/26 17:07
 * @Description:
 */
public class BankFactory2 {
    public static Bank chooseICBC(){
        return new ICBC();
    }
    public static Bank chooseCCB(){
        return new CCB();
    }
}