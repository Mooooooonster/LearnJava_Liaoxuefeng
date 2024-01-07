// 本章介绍了另一种条件判断switch的使用

import java.util.Scanner;

public class SwitchCondition {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Please input a number between 1-3: ");
        int option = scanner.nextInt();
        // switch语句根据switch (表达式)计算的结果，跳转到匹配的case结果，执行后续语句，直到遇到break结束执行
        // 如果option的值没有匹配到任何case，不会执行任何语句
        // 可通过给switch语句加一个default，当没有匹配到任何case时，执行default
        // 对于多个==判断的情况，使用switch结构较if结构更加清晰
        System.out.println("--------------------- 正常情况 ----------------------");
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Wrong input. Please check again.");
                break;
        }
        System.out.println();

        System.out.println("--------------------- 穿透情况 ----------------------");
        // 注意case语句并没有花括号{}，而且，case语句具有【穿透性】
        // 当option = 2时，将依次输出"Selected 2"、"Selected 3"、"Wrong input. Please check again."
        // 原因是从匹配到case 2开始，后续语句将全部执行，直到遇到break语句。因此，任何时候都不要忘记写break。
        switch (option) {
            case 1:
                System.out.println("Selected 1");
            case 2:
                System.out.println("Selected 2");
            case 3:
                System.out.println("Selected 3");
            default:
                System.out.println("Wrong input. Please check again.");
        }
        System.out.println();

        System.out.println("--------------------- 字符串匹配  ----------------------");
        // switch语句还可以匹配字符串。字符串匹配时，是比较“内容相等”，而非指向的存储地址相同
        String fruit = "apple";
        switch (fruit) {
            case "apple":
                System.out.println("Selected apple");
                break;
            case "pear":
                System.out.println("Selected pear");
                break;
        }
        System.out.println();

        // switch语句还可以使用枚举类型，枚举类型我们在后面讲解。

        // 使用IDE时，可以自动检查是否漏写了break语句和default语句，方法是打开IDE的编译检查。
        /* 在Idea中，选择Preferences - Editor - Inspections - Java - Control flow issues，将以下检查标记为Warning：
            - Fallthrough in 'switch' statement
            - 'switch' statement without 'default' branch
         */

        System.out.println("--------------------- 优化语法  ----------------------");
        // 上述表达不太友好，所以java12更新了switch表达式，可以不用写break了
        var opt = -1;
        switch (option) {
            case 1 -> opt = 1;
            case 2 -> opt = 2;
            case 3 -> opt = 3;
            default -> System.out.println("Wrong input. Please check again.");
        }
        System.out.println("opt= "+ opt);

        // 还可以使用switch语句直接返回值
        opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> 0;
        }; // 注意赋值语句要以;结束
        System.out.println("opt = " + opt);
        System.out.println();

        System.out.println("--------------------- yield语法  ----------------------");
        // 如果需要复杂的语句，可以放到{...}里，然后用yield返回一个值作为switch语句的返回值
        fruit = "orange";
        opt = switch (fruit) {
            case "apple" -> 1;
            case "pear", "mango" -> 2;
            default -> {
                int code = fruit.hashCode();
                yield code; // switch语句返回值
            }
        };
        System.out.println("opt = " + opt);

        // 可尝试ReadMe.md 中练习题 Ex.3
    }
}
