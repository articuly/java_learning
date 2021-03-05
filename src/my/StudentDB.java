package my;

import types.Arr;

import java.util.ArrayList;

public class StudentDB {
    public ArrayList list = new ArrayList();

    public void add(Student stu) {
        list.add(stu);
    }

    public void remove(int id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = (Student) list.get(i);
            if (stu.id == id) {
                list.remove(i);
                break;
            }
        }
    }

    public ArrayList find(String n) {
        ArrayList result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
            Student stu = (Student) list.get(i);
            if (stu.name.indexOf(n) >= 0) {
                result.add(stu);
            }
        }
        return result;
    }
}
