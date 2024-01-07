import java.util.Arrays;

public class ArrayLoopWithFor {
    // 在Chap2的for小节，介绍了通过for和for each对数组进行循环
    // for通过拿到【索引】对数字进行循环
    // for each通过直接拿到【元素】进行循环
    public static void main(String[] args){
        // 直接打印数组，会得到JVM中的引用地址
        int[] ns = { 1, 1, 2, 3, 5, 8 };
        System.out.println(ns); // [I@b4c966a
        // 需要通过循环进行打印
        System.out.println("-------------- 通过循环打印 -----------------");
        for (int n:ns){
            System.out.println(n+",");
        }
        System.out.println();

        System.out.println("-------------- 通过Java标准库打印 -----------------");
        System.out.println(Arrays.toString(ns));

    }
}
