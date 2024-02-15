/*  请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。\
    BMI = 体重(kg)除以身高(m)的平方\
    BMI结果：\
    过轻：低于18.5 \
    正常：18.5-25 \
    过重：25-28 \
    肥胖：28-32 \
    非常肥胖：高于32
 */
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please intput your height(m): ");
        double height = scanner.nextDouble();
        System.out.print("Please input your weight(kg): ");
        double weight = scanner.nextDouble();
        double bmi = weight/height/height;
        if (bmi>0 && bmi<18.5) {
            System.out.printf("你的BMI指数为：%.2f,属于过轻",bmi);
        } else if (bmi>=18.5 && bmi<25) {
            System.out.printf("你的BMI指数为：%.2f,属于正常",bmi);
        } else if (bmi>=25 && bmi<28) {
            System.out.printf("你的BMI指数为：%.2f,属于过重",bmi);
        } else if (bmi>=28 && bmi<32){
            System.out.printf("你的BMI指数为：%.2f,属于肥胖",bmi);
        } else if (bmi>=32) {
            System.out.printf("你的BMI指数为：%.2f,属于过度肥胖",bmi);
        } else {
            System.out.printf("你的BMI指数为：%.2f",bmi);
            System.out.println("是不是哪搞错了？？？");
        }
    }
}
