// 使用switch实现一个简单的石头、剪子、布游戏。
import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        String[] opt = {"石头","剪刀","布"};
        // 电脑的选择
        Random random = new Random();
        int cpt = random.nextInt(3);
        // 玩家的选择
        Scanner scanner = new Scanner(System.in);
        System.out.print("请给出你的选择（石头、剪刀、布）：");
        String usr = scanner.nextLine();
        int result = -1;
        if (opt[cpt].equals(usr)) {
            result = 0;
        } else if ((opt[cpt].equals("石头") && usr.equals("布")) || (opt[cpt].equals("剪刀") && usr.equals("石头")) || (opt[cpt].equals("布")&&usr.equals("剪刀")) ){
            result = 1;
        } else if ((opt[cpt].equals("石头") && usr.equals("剪刀")) || (opt[cpt].equals("剪刀") && usr.equals("布")) || (opt[cpt].equals("布")&&usr.equals("石头")) ){
            result = 2;
        }
        // 结果计算
        switch (result) {
            case 1 -> System.out.printf("电脑出了%s,你出了%s，你赢了",opt[cpt],usr);
            case 2 -> System.out.printf("电脑出了%s,你出了%s，你输了",opt[cpt],usr);
            case 0 -> System.out.printf("电脑出了%s,你出了%s，平局",opt[cpt],usr);
            default -> System.out.println("输入有误，你输了，请重新来过！");
        }
    }
}
