package prototype;

import java.io.*;
import java.util.Date;

/**
 * @Auther: scp
 * @Date: 2018/11/19 15:45
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

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
        //序列化
        ByteArrayOutputStream bos=new ByteArrayOutputStream(); //创建一个字节数组缓冲区
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[]bytes=bos.toByteArray();
        //反序列化
        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
        ObjectInputStream ois=new ObjectInputStream(bis);
        Sheep sheep2=(Sheep) ois.readObject();

        System.out.println(sheep2.toString()+" ===to");
        date.setTime(234567891231l);
        System.out.println(s1.getBirthday());
        System.out.println(sheep2.getBirthday());




    }

}
