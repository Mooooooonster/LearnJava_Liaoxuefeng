// 本章介绍了输入的方法
import java.util.Scanner; // 导入某个类的语句，必须放到Java源代码的开头，会在将package的章节详细讲

public class Input {
    public static void main(String[] args) {
        // System.out代表标准输出流，而System.in代表标准输入流
        // 通过创建scanner对象可以简化System.in获取用户输入的代码
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: ");
        // 通过 nextLine() 读取用户输入的字符串
        String name = scanner.nextLine();
        System.out.print("Input your age: ");
        // 通过 nextInt() 读取用户输入的整数，通过nextDouble() 读取用户输入的浮点数
        int age = scanner.nextInt();
        System.out.printf("Hi, %s, you are %d.\n", name, age); // 格式化输出

        // 可尝试ReadMe.md 中练习题 Ex.1
    }
}
