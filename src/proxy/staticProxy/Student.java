package proxy.staticProxy;

/**
 * @Auther: scp
 * @Date: 2018/12/20 13:55
 * @Description:
 */
public class Student implements Person{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name+"上交学费50元!");
    }
}
