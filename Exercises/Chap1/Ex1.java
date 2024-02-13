// Ex.1 定义一个【计算前N个自然数的和】的类
public class Ex1 {
    public static void main(String[] args){
        int n = 100;
        int sum = (1+n)*n/2;
        System.out.println(sum);
        System.out.println(sum == 5050 ? "测试通过" : "测试失败");
    }
}
