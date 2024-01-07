public class ForCondition {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("-------------------------- for循环 ----------------------------------");
        // for循环使用【计数器】实现循环：先初始化计数器，然后在每次循环前检测循环条件，在每次循环后更新计数器
        // 计数器变量通常命名为i
        // for（初始条件; 循环检测条件; 循环后更新计数器方法）
        for (int i=1; i<=100; i++) { //初始值1，判断条件i<=100, 计数器更新逻辑i++，可省略，但对应【;】须保留
            sum = sum + i; // 执行语句
        } // for的计数器更新语句不必放在循环体内部（如果这样做，常常会有意想不到的麻烦）
        System.out.println(sum);
        System.out.println();

        // 可尝试ReadMe.md 中练习题 Ex.6

        System.out.println("-------------------------- for each循环 ----------------------------------");
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int n : ns) { // 相较for循环，for each循环直接应对数组中各个元素，能遍历所有可迭代的数据类型
            System.out.println(n);
        }

        // 可尝试ReadMe.md 中练习题 Ex.7 - 9
    }
}
