// 本章介绍了布尔运算的比较运算符、三元运算符，介绍了短路运算的概念
public class BoolCalculation {
    public static void  main(String[] args){
        System.out.println("----------------------------- 比较运算符 ------------------------------ ");
        // 比较运算符：> >= < <= == !=
        // 与或非运算：&& || !
        System.out.println(5>3); // true
        System.out.println(15==0); // false
        System.out.println(!(15==0)); // true
        System.out.println(15>6 && 15<18); // true
        // 运算优先级：非 > 大小比较 > 等值比较 > 与 > 非
        System.out.println();

        System.out.println("----------------------------- 短路运算 ------------------------------ ");
        // 如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果
        boolean b = 5 < 3;
        boolean result = b && (5/0>0); // 如计算5/0会报错
        System.out.println(result);
        System.out.println();

        System.out.println("----------------------------- 三元运算符 ------------------------------ ");
        // b ? x : y，它根据第一个布尔表达式的结果，分别返回后续两个表达式之一的计算结果
        // x、y必须是同类系
        // 三元运算也是短路运算，如果输出x则不会计算y
        int n = -100;
        int x = n >= 0? n:-n; // 计算绝对值
        System.out.println(x);

        // 可尝试ReadMe.md 中练习题 Ex.3
    }
}
