package hello;

import java.util.ArrayList;
import java.util.List;


public class NullTest {
    public static void main(String[] args) {
//        Integer in=null;
//
//        if (in != null){
//            System.out.println("非空");
//        } else {
//            System.out.println("空");
//        }

        List<String> a = new ArrayList<>();

        if (a.size() == 0) {
            System.out.println("空");
        } else {
            System.out.println("非空");
        }
    }
}
