package types;

public class Arr {
    public static void main(String[] args) {
        int arr1[] = new int[4];
        arr1[0] = 12;
        arr1[1] = 23;
        arr1[2] = 34;
        arr1[3] = 45;
        for (int i = 3; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        int arr2[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\n");
        String arr3[] = {"陈", "李", "王", "何"};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + "：" + arr1[i]);
        }
    }
}
