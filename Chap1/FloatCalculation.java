// 本章介绍了浮点数的正确比较方法，类型提升、溢出、强制转换
public class FloatCalculation {
    public static void main(String[] args){
        // 浮点数的最大特点就是常常无法精确表示，如二进制的0.1是一个无限循环小数，只能存储近似值
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        System.out.println(x==y); // false
        System.out.println(" --------------------------- 正确比较浮点数方法 ------------------------------- ");
        // 正确的比较方法是判断两个浮点数之差的绝对值是否小于一个很小的数
        double r = Math.abs(x - y);
        if (r < 0.00001) {
            System.out.println(true); // false// 可以认为相等
        } else {
            System.out.println(false); // false// 不相等
        }
        // 浮点数在内存的表示方法和整数比更加复杂，Java的浮点数完全遵循【IEEE-754】标准，感兴趣可以搜
        System.out.println();

        System.out.println(" --------------------------- 类型提升 ------------------------------- ");
        int n = 5;
        double d = 1.2 + 24.0 / n; System.out.println(d);// 6.0 如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型
        d = 1.2 + 24 / 5; System.out.println(d); // 5.2 特别注意，两个整数的运算不会出现自动提升的情况,24/5这里仍会输出4
        System.out.println();

        System.out.println(" --------------------------- 溢出 ------------------------------- ");
        // 浮点数运算在除数为0时，不会报错，但会返回几个特殊值
        double d1 = 0.0 / 0; System.out.println(d1);// NaN
        double d2 = 1.0 / 0; System.out.println(d2);// Infinity
        double d3 = -1.0 /0;System.out.println(d3); // -Infinity
        System.out.println();

        System.out.println(" --------------------------- 强制转换 ------------------------------- ");
        // 可以将浮点数强制转型为整数。
        // 在转型时，浮点数的小数部分会被丢掉（.后面直接丢掉，不会四舍五入）
        int n1 = (int) 12.3; System.out.println(n1);// 12
        int n2 = (int) 12.7; System.out.println(n2);// 12
        int n3 = (int) -12.7; System.out.println(n3);// -12
        int n4 = (int) (12.7 + 0.5); System.out.println(n4);// 13 如果要进行四舍五入，可以对浮点数加上0.5再强制转型
        int n5 = (int) 1.2e20; System.out.println(n5);// 2147483647 如果转型后超过了整型能表示的最大范围，将返回整型的最大值
        System.out.println();

        // 可尝试ReadMe.md 中练习题 Ex.2

    }
}
