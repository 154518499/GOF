package factory.staticFactory;

/**
 * @Auther: scp
 * @Date: 2018/10/26 16:53
 * @Description:
 */
public class CCB implements Bank {

    @Override
    public void applyCard() {
        System.out.println("建行卡办理成功!");
    }
}