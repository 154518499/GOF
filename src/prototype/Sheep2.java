package prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: scp
 * @Date: 2018/11/19 16:57
 * @Description: 深克隆
 */
public class Sheep2 implements Cloneable,Serializable{
    private String name;
    private Date birthday;

    public Sheep2(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj=super.clone();
        Sheep2 sheep=(Sheep2)obj;
        System.out.println(obj.equals(sheep));
        sheep.birthday=(Date)this.birthday.clone();
        return obj;
    }
}
