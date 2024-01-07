// 本章介绍了 字符型char和字符串类型String的区别，字符串拼接、多行字符串，字符串的不可变特性 和 空值
public class CharAndString {
    public static void main(String[] args){
        System.out.println("------------------------------- 字符类型char ----------------------------------- ");
        // 在Java中，字符char和字符串string是两个完全不同的类型
        // 字符类型char是基本数据类型，一个char保存一个Unicode字符，用单引号'表示
        // Java在内存中总是使用Unicode表示字符，所以，一个英文字符和一个中文字符都用一个char类型表示，它们都占用两个字节
        char c1 = 'A';
        char c2 = '中';
        // 要显示一个字符的Unicode编码，只需将char类型直接赋值给int类型即可
        System.out.println((int) c1); // 字母“A”的Unicodde编码是65
        System.out.println((int) c2); // 汉字“中”的Unicode编码是20013
        // 还可以直接用【转义字符+Unicode编码】来表示一个字符
        // 注意是十六进制:
        char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
        char c4 = '\u4e2d'; // '中'，因为十六进制4e2d = 十进制20013
        System.out.println(c3); // 字母“A”的Unicodde编码是65
        System.out.println(c4); // 汉字“中”的Unicode编码是20013
        System.out.println();

        System.out.println("------------------------------- 字符串类型String ----------------------------------- ");
        // 字符串类型String是引用类型，可以存储0到任意个字符，用双引号"表示
        // 如果字符串中包含"，可通过转义字符\实现
        String s1 = "字符串中的双引号\"可以这样表现";
        String s2 = "字符串中的斜杠\\可以这样表现";
        System.out.println(s1); System.out.println(s2);
        /* 其他常见转义字符：
            \' 表示字符'
            \n 表示换行符
            \r 表示回车符
            \t 表示Tab
            \\u#### 表示一个Unicode编码的字符 */
        String s = "ABC\n\u4e2d\u6587";
        System.out.println(s);
        System.out.println();

        System.out.println("------------------------------- 字符串拼接 ----------------------------------- ");
        // 和python一样，字符串可以通过+进行拼接
        s1 = "Hello";
        s2 = "world";
        s = s1 + " " + s2 + "!";
        System.out.println(s);
        // 如果加入其他数据类型，会自动先转到str
        int i = 0xff0000; // 十六进制表示的16711680
        s = s1 + " " + s2 + "!" + " " + i;
        System.out.println(s);
        System.out.println();

        System.out.println("------------------------------- 多行字符串 ----------------------------------- ");
        // 如果通过+或者/n表示多行字符串，非常不友好。从java13开始，支持通过""".."""进行多行字符串定义
        // 会以最短的共同行首空格为准，统一删除，如下面只会有第二行行首有空格
        String mul_s = """
                太阳当空照，
                  花儿对我笑，
                小鸟说，早早早，
                你为什么背上小书包"""; // 如果把"""放到下一行，就会多打一个回车
        System.out.println(mul_s);

        System.out.println("------------------------------- 不可变特性 ----------------------------------- ");
        // 当定义一个字符串时，把值存在了内存的一个位置
        s = "a";
        s1 = s;
        s = "b";
        // 执行上述操作时，内存中存储的字符串"a"并未改变，改变的只是存储的s的指向位置,我们只是不能在通过s访问原来存储的"a"而已
        System.out.println(s);  // b
        System.out.println(s1); // a
        /*
                ----------           ----------
                |        |           |        |
                ----------           ----------
            s-> |    a   |      s1-> |   a    |
                ----------  -->      ----------
                |        |       s-> |   b    |
                ----------           ----------
                |        |           |        |
                ----------           ----------
         */

        System.out.println("------------------------------- 空值 ----------------------------------- ");
        // null不指向任何位置，空字符串指向存着“”的位置
        String nan = null;
        String blank = "";
        System.out.println(nan);
        System.out.println(blank);

        // 可尝试ReadMe.md 中练习题 Ex.4

    }
}
