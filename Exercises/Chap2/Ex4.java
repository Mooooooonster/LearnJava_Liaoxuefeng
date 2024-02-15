// 使用while计算从m到n的和
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input int m: ");
        int m = scanner.nextInt();
        System.out.println("Please input int n: ");
        int n = scanner.nextInt();
        int sum = 0;
        while (m<=n) {
            sum += m;
            m += 1;
        }
        System.out.printf("The sum from %d to %d is %d.",m,n,sum);
    }
}
