// 本章介绍了变量、基本数据类型、常量 和 变量的作用范围
public class VarAndDataType {
    public static void main(String[] args) {
        // 在java中，变量必须先定义后使用，在定义时可以给他一个初始值，如果不给则使用默认值
        int x = 1;
        System.out.println(x);
        x = 2;  // 重新赋值时，不需要再次定义变量类型
        System.out.println(x);
        int n = x;  // 可将变量值赋给其他变量；
        System.out.println(n);
        x = 3;  // 因为int是基本类型（不是引用类型），x、n存储在内存的不同位置，修改x的值不会改变n
        System.out.println(n);

        // 基本数据类型
        /* P.s.一个字节8bit，1bit可以存储一个0/1
           整数类型：byte，short，int，long 分别占用1/2/4/8个字节，分别可以表示±2^7/15/31/63范围内的整数（左闭右开）
           整数类型的首位0/1被用来标识正负，所以会有溢出问题，详见IntCalculation
           浮点数类型：float，double
           字符类型：char
           布尔类型：boolean
         */
        // 整型 int
        // P.s.特别注意：同一个数的不同进制的表示是完全相同的，例如15=0xf＝0b1111
        int i1 = 2_000_000_000; // 加下划线更容易识别
        int i2 = 0xff0000; // 十六进制表示的16711680
        int i3 = 0b1000000000; // 二进制表示的512
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        // 整型 long
        long n1 = 9000000000000000000L; // long型的结尾需要加L
        long n2 = 900; // 没有加L，此处900为int，但int类型可以赋值给long
        // int i = 900L; // 会报错：不能把long型赋值给int
        System.out.println(n1);
        System.out.println(n2);

        // 浮点型
        // 对于float类型，需要加上f后缀。
        // 浮点数可表示的范围非常大，float类型可最大表示3.4x10^38，而double类型可最大表示1.79x10^308。
        // 浮点型float
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        // float f = 1.0; // 会报错：不带f结尾的是double类型，不能赋值给float
        System.out.println(f1);
        System.out.println(f2);
        // 浮点型 double
        double d1 = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        // 布尔类型 boolean
        // 只有true和false两个值，布尔类型可以是关系运算的计算结果
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(isGreater);
        System.out.println(isAdult);

        // 字符类型 char
        // 字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符
        // 特别注意: char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开。
        char c1 = 'A';
        char c2 = '中';
        // char c = '中心极限定理'; // 会报错：只能存一个字符
        System.out.println(c1);
        System.out.println(c2);

        // 引用类型
        // 除上述基本类型外，都是引用类型，引用类型类似于C的指针，内部存储的是某个对象的内存位置
        // 最常见的引用类型为String
        String s = "hello";
        System.out.println(s);

        // 常量
        // 可通过final修饰符将变量指定为常量，常量名通常全部大写
        // 定义常量，可以便于理解代码含义，且可以避免在参数精度修改时寻找所有用到该常量的地方
        final double PI = 3.14;
        double r = 5.0;
        double area = PI * r * r;
        // PI = 300; // 常量不可以重新被赋值，会显示编译错误，报错 java:无法为final变量PI分配值

        // var关键字
        // 当类型名太长时，可以使用var关键字来省略变量类型，编译器会自动判断
        String s1 = "a";
        var s2 = "a";
        System.out.println(s1==s2);

        // 变量的作用范围
        // 定义变量时，要遵循作用域最小化原则，尽量将变量定义在尽可能小的作用域，并且，不要重复使用变量名。
        // 变量的作用域为定义他的花括号及其内部的花括号，例如：
        /* {
            int i = 0; // 变量i从这里开始定义
            ...
                {
                 int x = 1; // 变量x从这里开始定义
                 ...
                    {
                     String s = "hello"; // 变量s从这里开始定义
                     ...
                    } // 变量s作用域到此结束
                 // 注意，这是一个新的变量s，它和上面的变量同名，
                 // 但是因为作用域不同，它们是两个不同的变量:
                 String s = "hi";
                 ...
                } // 变量x和s作用域到此结束
            ...
            } // 变量i作用域到此结束
        */
    }
}
