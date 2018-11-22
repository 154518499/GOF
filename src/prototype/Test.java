package prototype;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @Auther: scp
 * @Date: 2018/11/19 15:45
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, IOException {

//        Date date=new Date(123456789123l);
//        Sheep2 s1=new Sheep2("hahah",date);
//        System.out.println(s1.getBirthday());
//        Sheep2 s2=(Sheep2)s1.clone();
//        date.setTime(234567891231l);
//        System.out.println(s1.getBirthday());
//        System.out.println(s2.getBirthday());
       //序列化克隆
        Date date=new Date(123456789123l);
        Sheep s1=new Sheep("hahah",date);
        System.out.println(s1.getBirthday());
        Sheep s2=(Sheep)s1.clone();
        date.setTime(234567891231l);
        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());

        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);

    }

}
