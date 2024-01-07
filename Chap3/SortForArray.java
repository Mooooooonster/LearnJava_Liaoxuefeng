import java.util.Arrays;

public class SortForArray {
    public static void main(String[] args) {
        // 排序前:
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println(Arrays.toString(ns));
        System.out.println();

        System.out.println("------------------ 通过【冒泡算法】进行排序 ---------------------");
        // 冒泡排序的特点是，每一轮循环后，最大的一个数被交换到末尾
        // 因此，下一轮循环就可以“刨除”最后的数，每一轮循环都比上一轮循环的结束位置靠前一位
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j+1]) { // 每个数和他右边的数比大小，如果左边大，就换位置
                    // 交换两个变量的值必须借助一个临时变量
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));  // 排序后
        System.out.println();

        System.out.println("------------------ 通过标准库JDK进行排序 ---------------------");
        // Java的标准库内置了排序功能，通过调用JDK提供的Arrays.sort()实现
        Arrays.sort(ns); // 排序修改了函数本身！！
        System.out.println(Arrays.toString(ns));
        // 如果是字符串，内存中字符串本身的存储位置不会改变，但数组中每个元素指向的存储位置变了

        // 可尝试ReadMe.md 中练习题 Ex.1
    }
}
