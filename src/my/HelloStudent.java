package my;

import java.util.ArrayList;

public class HelloStudent {
    public Student getStudent(my.AfConsole cons) {
        Student stu = new Student();
        cons.print("学号：");
        stu.id = cons.readInt(0);

        cons.print("姓名：");
        stu.name = cons.readString("");

        cons.print("性别（1/0）：");
        int nValue = cons.readInt(1);
        stu.sex = nValue > 0; // 读取Int，转成boolean

        cons.print("手机：");
        stu.mobile = cons.readString("");
        return stu;
    }

    public void start() {
        AfConsole cons = new AfConsole();
        StudentDB db = new StudentDB();
        cons.println("** 学生管理系统 **");
        while (true) {
            cons.print("\n>"); // 命令提示符
            String cmd = cons.readString("");
            cmd = cmd.trim();

            if (cmd.equals("exit")) {
                System.out.println("退出");
                break;
            } else if (cmd.equals("add")) {
                Student stu = getStudent(cons);
                System.out.println("\n添加了：" + stu);
                db.add(stu);
                System.out.println("共 " + db.list.size() + " 条记录");
            } else if (cmd.equals("show")) {
                System.out.println("共 " + db.list.size() + " 条记录");
                for (int i = 0; i < db.list.size(); i++) {
                    Student stu = (Student) db.list.get(i);
                    System.out.println(stu);
                }
            } else if (cmd.equals("find")) {
                cons.print("输入要查找的姓名：");
                String n = cons.readString("");
                n = n.trim();

                ArrayList results = db.find(n);
                System.out.println("匹配到 " + results.size() + " 条记录");
                for (int i = 0; i < results.size(); i++) {
                    Student stu = (Student) results.get(i);
                    System.out.println(stu);
                }
            } else if (cmd.equals("remove")) {
                cons.print("输入删除的学号：");
                int id = cons.readInt(0);
                if (id >= 0) {
                    db.remove(id);
                    System.out.println("已删除学生：ID=" + id);
                }
            } else {
                System.out.println("命令错误");
            }
        }
    }

    public static void main(String[] args) {
        HelloStudent hello = new HelloStudent();
        hello.start();

//        AfConsole cons = new AfConsole();
//        Student stu = hello.getStudent(cons);
//        System.out.println("输入了：" + stu);

        System.out.println("Exit");
    }
}
