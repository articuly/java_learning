package function;

public class MyMath {
    public int getMax(int[] data) {
        int result = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > result) {
                result = data[i];
            }
        }
        return result;
    }

    public boolean checkSum(int[] data) {
        int sum = 0;
        for (int i : data) {
            sum += i;
            if (sum > 100) {
                return true;
            }
        }
        return false;
    }

    public int[] find8(int[] data) {
        // 创建等长的数组
        int[] temp = new int[data.length];
        int c = 0;
        for (int i : data) {
            if (i % 8 == 0) {
                temp[c] = i;
                c++;
            }
        }
        // 复制到结果数组
        int[] result = new int[c];
        for (int j = 0; j < c; j++) {
            result[j] = temp[j];
        }
        return result;
    }

    public static void main(String[] args) {
        MyMath sth = new MyMath();

        int[] arr1 = {123, 45, 213, 27, 444};
        int max = sth.getMax(arr1);
        System.out.println(max);

        int[] arr2 = {12, 23, 34};
        boolean result2 = sth.checkSum(arr2);
        System.out.println(result2);

        boolean result1 = sth.checkSum(arr1);
        System.out.println(result1);

        int[] arr3 = {18, 24, 32, 36, 28, 63};
        int[] result3 = sth.find8(arr3);
        for (int i : result3) {
            System.out.println(i);
        }
    }
}
