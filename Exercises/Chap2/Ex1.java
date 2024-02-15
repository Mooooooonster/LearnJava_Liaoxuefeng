// 定义一个【输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）】的类\
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your score last time: ");
        double last_score = scanner.nextInt(); // 如果这里写 int last_score下面计算的时候就会自动取整
        System.out.print("Please input your score this time: ");
        double this_score = scanner.nextInt();
        double inc = 100*(this_score-last_score)/last_score;
        System.out.println("You score has changed by: ");
        System.out.printf("%.2f%%", inc);
    }
}
