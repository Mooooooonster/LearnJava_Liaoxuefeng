// 本章介绍了if语句的基本用法和相关注意事项

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        System.out.println("----------------- if基础结构 ------------------");
        var scanner = new Scanner(System.in);
        System.out.print("Please input your score: ");
        int n = scanner.nextInt();
        if (n >= 90) { // ()表示判断语句，{}表示满足条件后的执行语句
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
        System.out.println("END");

        // if判断需要特别注意顺序，否则容易导致有的条件永远无法被满足（比如把>=60写在最前面，就没法判断>=90了）
        // 使用if时，还要特别注意边界条件，不要因为遗漏边界条件导致边界值执行了else语句

        // 记得浮点数不要用==判断，而是用差值很小来判断
        System.out.println("----------------- if判断浮点数是否相等 ------------------");
        double x = 1 - 9.0 / 10;
        double y = 0.1;
        if (Math.abs(x - y) < 0.00001) {
            System.out.println("x is 0.1");
        } else {
            System.out.println("x is NOT 0.1");
        }

        System.out.println("----------------- if判断引用类型是否相等 ------------------");
        // 即使内容是相同的，但分别指向不同的对象，最后也是不等的
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else if (s1.equals(s2)){ // 要判断引用类型的变量内容是否相等，必须使用equals()方法
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 != s2");
        }
        // 执行语句s1.equals(s2)时，如果变量s1为null，会报【NullPointerException空指针异常】
        // String s1 = null;
        // if (s1.equals("hello")) {
        //    System.out.println("hello");
        // }

        // 可以通过短路语句 if (s1 != null && s1.equals(s2)) 来避免报错
        // 可以通过把一定不是null的对象"hello"放到前面来避免报错，如：if ("hello".equals(s))

        // 可尝试ReadMe.md 中练习题 Ex.2
    }
}
