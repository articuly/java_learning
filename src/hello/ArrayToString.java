package hello;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args){
        String str = "0,1,2,3,4,5";
        String[] arr = str.split(","); // 用,分割
        String str2 = java.util.Arrays.toString(arr);
        System.out.println(str2); // [0, 1, 2, 3, 4, 5]


    }
}
