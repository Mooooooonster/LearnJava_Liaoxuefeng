// 本章介绍了整型的四则运算、取余、溢出、移位、位运算、运算顺序、类型自动提升和强制转换

public class IntCalculation {
    public static void main(String[] args){
        System.out.println("------ 四则运算 ------");
        // Java的整数运算遵循四则运算规则，可以使用任意嵌套的小括号。四则运算规则和初等数学一致
        int i = (100 + 200) * (99 - 88); System.out.println(i);// 3300
        int n = 7 * (5 + (i - 9)); System.out.println(n);// 23072

        // 整数计算返回值也是整数，会自动向下取整
        // 使用%取除法余数
        int x = 12345 / 67; System.out.println(x); // 184
        int y = 12345 % 67; System.out.println(y); // 17
        // int z = 123/0; // 特别注意：整数的除法对于除数为0时运行时将报错，但编译不会报错
        System.out.println();

        System.out.println("------ 溢出 ------");
        // 溢出：整数由于存在范围限制，如果计算结果超出了范围，就会产生溢出，而溢出不会出错，只是答案不对
        // （因为首位被用来标记正负，会从正数变成负数）
        x = 2147483647; int y1 = 1;
        int sum1 = x + y1; System.out.println(sum1); // -2147483648
        /*
        要解释上述结果，我们把整数2147483640和15换成二进制做加法：
          0111 1111 1111 1111 1111 1111 1111 1111
        + 0000 0000 0000 0000 0000 0000 0000 0001
        -----------------------------------------
          1000 0000 0000 0000 0000 0000 0000 0000 // 注意，这是最小的int负数，而不是-1或者0
         */

        // 运算符简写: +=、-=、*=、/=
        // x+=1 等价于 x = x+1

        // java还提供++、--的整数型+1、-1自增\自减计算
        // 不建议把++运算混入到常规运算中
        n = 3300;
        System.out.println(n++); // 3301, 相当于 n = n + 1;
        System.out.println(n--); // 3300, 相当于 n = n - 1;
        y = 100 + (++n); System.out.println(y); // 不要这么写,++写在前面表示先+1再引用n）【还没搞懂为啥不让这么写，说在有时候结果会不一样
        y = 100 + (n++); System.out.println(y);
        System.out.println();

        System.out.println("----------- 移位 -------------------");
        // 移位运算
        // 在计算机中，整数总是以二进制的形式表示，可以对整数进行移位计算
        n = 7; // 00000000 00000000 00000000 00000111 = 7
        System.out.println("----------- 左移<< -------------------");
        // 左移，整体往左移【左边超出的数字会从右边再进来，这是我测的，但是跟右移用0补位就不太一样，逻辑不太懂
        int a = n << 1;  System.out.println(a);// 00000000 00000000 00000000 00001110 = 14
        int b = n << 2;  System.out.println(b);// 00000000 00000000 00000000 00011100 = 28
        int c = n << 29; System.out.println(c);// 11100000 00000000 00000000 00000000 = -536870912 = -2^31+(2^30+2^29)
        int d = n << 30; System.out.println(d);// 11000000 00000000 00000000 00000001 = -1073741824 = -2^31+(2^30+1)
        int e = n << 32; System.out.println(e); // = 7
        int f = n << 33; System.out.println(f); // = 14

        System.out.println("----------- 右移>> -------------------");
        // 右移，1往右移，用0补位【?，也是我测的，而且很神奇，>>31的结果都还是0,但是32就又是7了，怀疑他先取余再移的
        a = n >> 1; System.out.println(a); // 00000000 00000000 00000000 00000011 = 3
        b = n >> 2; System.out.println(b); // 00000000 00000000 00000000 00000001 = 1
        c = n >> 3; System.out.println(c); // 00000000 00000000 00000000 00000000 = 0
        d = n >> 31; System.out.println(d); // = 0
        e = n >> 32; System.out.println(e); // = 7
        f = n >> 33; System.out.println(f); // = 3

        System.out.println("----------- 负数右移>> -------------------");
        // 如果对一个负数进行右移，最高位的1不动，结果仍然是一个负数,用1进行补位
        n = -536870912; // 11100000 00000000 00000000 00000000
        a = n >> 1;  System.out.println(a); // 11110000 00000000 00000000 00000000 = -268435456
        b = n >> 2;  System.out.println(b); // 11111000 00000000 00000000 00000000 = -134217728
        c = n >> 28; System.out.println(c); // 11111111 11111111 11111111 11111110 = -2
        d = n >> 29; System.out.println(d); // 11111111 11111111 11111111 11111111 = -1
        f = n >> 32; System.out.println(f); // -536870912 【强烈怀疑是先取余再移的

        // 对byte和short类型进行移位时，会首先转换为int再进行位移。
        // 在移动位数小于32位时，左移实际上就是不断地×2，右移实际上就是不断地÷2。

        System.out.println("----------- 无符号负数右移>>> -------------------");
        // 还有一种无符号的右移 >>>，它的特点是不管符号位，右移后高位总是补0
        n = -536870912;
        a = n >>> 1;  System.out.println(a); // 01110000 00000000 00000000 00000000 = 1879048192
        b = n >>> 2;  System.out.println(b); // 00111000 00000000 00000000 00000000 = 939524096
        c = n >>> 29; System.out.println(c); // 00000000 00000000 00000000 00000111 = 7
        d = n >>> 31; System.out.println(d); // 00000000 00000000 00000000 00000001 = 1
        f = n >>> 32; System.out.println(f); // -536870912
        // a = n<<<1; //左移没有这个操作，会编译报错
        System.out.println();

        System.out.println("----------- 位运算 -------------------");
        // 位运算是按位进行与&、或|、~非（0与1互换）和异或^（两个数不同结果为1否则为0）的运算
        System.out.println(0^0); // 0
        System.out.println(0^1); // 1
        System.out.println(1^0); // 1
        System.out.println(1^1); // 0
        // 对两个整数进行位运算，实际上就是按位对齐，然后依次对每一位进行运算
        i = 167776589; // 00001010 00000000 00010001 01001101
        n = 167776512; // 00001010 00000000 00010001 00000000
        System.out.println(i & n); // 167776512
        // 使用与运算，可以快速判断一个IP是否在给定的网段内【虽然怎么用还没学会，但是听起来很有道理
        System.out.println();

        // 运算优先级
        // () 优先于 ! ~ ++ -- 优先于 * / % 优先于 + - 优先于 << >> >>> 优先于 & 优先于 | 优先于 += -= *= /=
        // ! 是一元运算符，用来取反boolean
        System.out.println(!false);

        // 类型自动提升与强制转型
        System.out.println("----------- 类型自动提升 -------------------");
        // 如果参与运算的两个数类型不一致，那么计算结果为较大类型的整型。例如，short和int计算，结果是int，原因是short首先自动被转型为int
        short s = 1234;
        i = 123456;
        x = s + i; System.out.println(x);// s自动转型为int
        // short y = s + i; // 编译错误!

        System.out.println("----------- 类型强制转换 -------------------");
        // 可通过强制转型 将大范围的整数转型为小范围的整数，但如果超出范围会丢失字节
        i = 32769;
        s = (short) i; System.out.println(s);// 12345
        int i1 = 65536; // 00000000 00000001 00000000 00000000
        short s1 = (short) i1; // 00000000 00000000 =  -1
        System.out.println(s1);

        // 可尝试ReadMe.md 中练习题 Ex.1
    }
}
