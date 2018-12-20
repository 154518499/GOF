package proxy.staticProxy;

/**
 * @Auther: scp
 * @Date: 2018/12/20 13:57
 * @Description:
 */
public class StudentProxy implements Person{
    private Student stu;

    public StudentProxy(Person stu) {
        if (stu.getClass()==Student.class){
            this.stu = (Student)stu;
        }
    }
    @Override
    public void giveMoney() {
        System.out.println(stu.getName()+"学习有进步!");
        stu.giveMoney();
    }
}
