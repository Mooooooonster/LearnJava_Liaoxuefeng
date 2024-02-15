// 对一个整型数组的所有元素求和

public class Ex6 {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int i=0; i< ns.length; i++) {
            sum += ns[i];
        }
        System.out.println("sum = " + sum);
    }
}
