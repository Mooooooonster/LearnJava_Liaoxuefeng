import java.util.Arrays;

public class MultiDimArray {
        public static void main(String[] args) {
            // 二维数组就是数组的数组
            int[][] ns = {
                    { 1, 2, 3, 4 },
                    { 5, 6 }, // 二维数组的每个数组元素的长度并不要求相同
                    { 9, 10, 11, 12 }
            };
            System.out.println(ns.length); // 3
            System.out.println(Arrays.toString(ns)); // 存储的是3个数组的内存地址

            int[] arr0 = ns[0];
            System.out.println(arr0.length); // 4
            System.out.println(Arrays.toString(arr0));

            // 访问二维数组的某个元素需要使用array[row][col]
            System.out.println(ns[2][2]); // 7

            // 打印完整的多维数组，也有对应的标准库
            System.out.println(Arrays.deepToString(ns));

            // 同理我们还可以定义三维、四维、....、n维数组，n维数组的内部元素为n-1维数组

            // 可尝试ReadMe.md 中练习题 Ex.2
    }
}
