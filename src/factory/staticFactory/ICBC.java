package factory.staticFactory;

/**
 * @Auther: scp
 * @Date: 2018/10/26 16:54
 * @Description:
 */
public class ICBC implements Bank {

    @Override
    public void applyCard() {
        System.out.println("工行卡办理成功!");
    }
}