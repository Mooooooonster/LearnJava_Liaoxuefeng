// 用for循环倒序输出每一个元素
public class Ex7 {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=ns.length-1; i>=0; i--) {
            System.out.println(ns[i]);
        }
    }
}
