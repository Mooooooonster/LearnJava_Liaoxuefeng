// 使用do while计算从m到n的和
public class Ex5 {
    public static void main(String[] args) {
        int sum = 0;
        int m = 20;
        int n = 100;
        do {
            sum+=m;
            m+=1;
        } while (m<=n);
        System.out.println(sum);
    }
}
