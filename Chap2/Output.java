// 本章介绍了基本输出、标准化输出相关内容
public class Output {
    public static void main(String[] args){
        System.out.println("--------------------- 输出 --------------------");
        // println表示打印并换行(print line)
        System.out.println("打印并换行！");
        // 如果不想换行可以用print()
        System.out.print("我不换行");
        System.out.print("!");
        System.out.print("\n"); // 用我也可以来换行！

        System.out.println("--------------------- 标准化输出 --------------------");
        // 因为有时候直接输出的是计算机语言，人类看不懂
        double d = 12900000;
        System.out.print("格式化前: ");
        System.out.println(d); // 1.29E7
        // 格式化输出使用printf()，通过使用占位符%?，可以把后面的参数变成指定格式
        /* 常见占位符：
           占位符	   说明
            %d	    格式化输出整数
            %x	    格式化输出十六进制整数
            %f	    格式化输出浮点数
            %e	    格式化输出科学计数法表示的浮点数
            %s	    格式化字符串
         */
        System.out.print("格式化后: ");
        System.out.printf("%.0f\n", d);
        // 小数位数保留
        d = 3.1415926;
        System.out.printf("%.2f\n", d); // 3.14
        System.out.printf("%.4f\n", d); // 3.1416
        // 由于%表示占位符，因此，连续两个%%表示一个%字符本身
        System.out.printf("%.4f%%\n", d); // 3.1416%
        // 更多格式化内容可参考官方文档：
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Formatter.html#syntax
    }
}
