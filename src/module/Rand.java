package module;

import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        int[] result = new int[3];
        int count = 0;

        Random rand = new Random();
        while (count < 3) {
            // 抽一个幸运员工, s是它的号码
            int s = rand.nextInt(100);

            // 检查s是否已经中过奖了, 检查s是否在result里
            boolean exist = false;
            for (int i = 0; i < count; i++) {
                if (result[i] == s) {
                    exist = true;
                    break;
                }
            }

            if (exist) {
                continue;
            } else {
                result[count] = s;
                count++;
            }
        }


        for (int i = 0; i < result.length; i++) {
            System.out.println("第" + (result[i] + 1) + "号获奖!");
        }

    }
}
