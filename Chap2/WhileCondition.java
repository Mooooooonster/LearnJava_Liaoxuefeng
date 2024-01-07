public class WhileCondition {
    public static void main(String[] args) {
        // 循环语句就是让计算机根据条件做循环计算，在条件满足时继续循环，条件不满足时退出循环
        int sum = 0; // 累加的和，初始化为0
        int n = 1;
        System.out.println(" ------------------- while基本结构 ------------------------");
        while (n <= 100) { // 在满足()中条件时，会一直执行{}中代码
            sum = sum + n;
            n ++;
        }
        System.out.println(sum); // 5050

        // 使用while时要特别注意边界条件，以及计算和变量自增的先后顺序
        // 需检查while逻辑，避免死循环

        // 可尝试ReadMe.md 中练习题 Ex.4
    }

}
