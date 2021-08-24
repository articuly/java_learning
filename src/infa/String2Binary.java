package infa;

public class String2Binary {
    public static byte[] BinaryConverter(String str) {
        byte[] result = null;
        try{
            result = str.getBytes("UTF-8");
        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args){
        String s1;
        byte[] res;
        s1="hello, 你好， 系統上線";
        res=BinaryConverter(s1);
        System.out.println(s1);
        System.out.println(res);
    }
}
