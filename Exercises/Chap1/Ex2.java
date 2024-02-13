// Ex.2 定义一个【计算一元二次方程的两个解】的类
public class Ex2 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        // 求平方根可用 Math.sqrt():
        // System.out.println(Math.sqrt(2)); ==> 1.414
        // TODO: 请在此处补全r1、r2计算方法
        double r1 = (-b+Math.sqrt(b*b-4*a*c))/2/a;
        double r2 = (-b-Math.sqrt(b*b-4*a*c))/2/a;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }
}
