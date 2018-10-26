package factory.staticFactory;

/**
 * @Auther: scp
 * @Date: 2018/10/26 17:00
 * @Description:
 */
public class BankFactory {
    public static Bank chooseBank(int type){
        if(1==type){
            return new ICBC();
        }else if(2==type){
            return new CCB();
        }else{
            return null;
        }
    }
}