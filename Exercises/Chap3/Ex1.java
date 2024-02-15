// 实现对数组进行降序排序

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        // 排序前:
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println(Arrays.toString(ns));

        // 进行排序
        for (int i=ns.length-1; i>0; i--){
            // 从右往左，每次把最大的数字移到最左边
            for (int j=ns.length-1; j>ns.length-i-1;j--){
                if (ns[j]>ns[j-1]) {
                    int tmp = ns[j];
                    ns[j] = ns[j-1];
                    ns[j-1] = tmp;
                }
            }
        }

        // 法二：正向排序后，在首位交换直到中间

        // 排序后:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
