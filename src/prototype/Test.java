package prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;

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
//        Date date=new Date(123456789123l);
//        Sheep s1=new Sheep("hahah",date);
//        System.out.println(s1.getBirthday());
//        //序列化
//        ByteArrayOutputStream bos=new ByteArrayOutputStream(); //创建一个字节数组缓冲区
//        ObjectOutputStream oos=new ObjectOutputStream(bos);
//        oos.writeObject(s1);
//        byte[]bytes=bos.toByteArray();
//        //反序列化
//        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
//        ObjectInputStream ois=new ObjectInputStream(bis);
//        Sheep sheep2=(Sheep) ois.readObject();



//        FileInputStream fis=new FileInputStream("F:\\重点实验室员工工作月报 2018.09 宋春鹏.doc");
//        FileOutputStream fos=new FileOutputStream("F:\\6666.doc");
//        byte[]buf=new byte[1024];
//        int len=0;
//        while((len=fis.read(buf))>0){
//            fos.write(buf,0,len);
//        }
//        fis.close();
//        fos.close();

//        FileInputStream fis=new FileInputStream("F:\\test123.doc");
//        FileOutputStream fos1=new FileOutputStream("F:\\777.doc");
//        int a=-1;
//        while((a=fis.read())!=-1){
//            System.out.println(a);
//            fos1.write(a);
//        }
//        fis.close();
//        fos.close();

//        String str1="gfgdg342fsdfg";
//        ByteArrayInputStream bis1=new ByteArrayInputStream(str1.getBytes());
//        ByteOutputStream bos1=new ByteOutputStream();
//        int a=-1;
//        while ((a=bis1.read())!=-1){
//            bos1.write(a);
//        }
//        System.out.println(Arrays.toString(bos1.getBytes())+"=========");
//        System.out.println(bos1.getBytes().length);


        BufferedInputStream bis1=new BufferedInputStream(new FileInputStream("F:\\重点实验室员工工作月报 2018.09 宋春鹏.doc"));
        BufferedOutputStream bos2=new BufferedOutputStream(new FileOutputStream("F:\\6666.doc"));
        byte[] buff = new byte[1024];
        int a=-1;
        while((a=bis1.read(buff))!=-1){
            bos2.write(buff);
        }
        bis1.close();
        bos2.close();
    }

}
