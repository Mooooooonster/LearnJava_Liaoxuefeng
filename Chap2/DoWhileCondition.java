public class DoWhileCondition {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        // while循环是先判断循环条件，再执行循环
        // do while循环则是先执行循环，再判断条件，条件满足时继续循环，条件不满足时退出
        do { // 循环执行语句
            sum = sum + n;
            n ++;
        } while (n <= 100); // 判断条件
        // 较while可能不会执行而言，do while至少会执行一次
        System.out.println(sum);

        // 可尝试ReadMe.md 中练习题 Ex.5
    }
}
