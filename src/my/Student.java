package my;

public class Student {
    public int id;
    public String name;
    public boolean sex;
    public String mobile;

    // 空的默认构造方法
    public Student() {
    }

    // 重载一个有参数的构造方法
    public Student(int id, String name, boolean sex, String mobile) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.mobile = mobile;
    }

    // 重写，方便显示
    @Override
    public String toString() {
        String strSex = "男";
        if (sex == false) {
            strSex = "女";
        }

        return (id + ", " + name + ", " + strSex + ", " + mobile);
    }
}
