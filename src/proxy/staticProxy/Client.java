package proxy.staticProxy;

/**
 * @Auther: scp
 * @Date: 2018/12/20 14:00
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
//        Student stu=new Student("张三");
//        StudentProxy studentProxy=new StudentProxy(stu);
//        studentProxy.giveMoney();
        System.out.println(Student.class.getClassLoader());
        System.out.println(Integer.class.getClassLoader());

    }
}
