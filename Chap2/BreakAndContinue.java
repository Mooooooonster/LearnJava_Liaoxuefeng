public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println(" ------------------------ break语句-1 ------------------------------");
        // 在循环过程中，可以使用break语句跳出当前循环
        int sum = 0;
        for (int i=1; ; i++) { // 未设置结束语句
            sum = sum + i;
            if (i == 100) { // 通过循环体中的if语句来判断是否结束
                break;
            }
        }
        System.out.println(sum);
        System.out.println();

        System.out.println(" ------------------------ break语句-2 ------------------------------");
        // 只跳出当前层的循环
        for (int i=1; i<=3; i++) {
            System.out.println("i = " + i);
            for (int j=1; j<=10; j++) {
                System.out.println("j = " + j);
                if (j >= i) {
                    break;
                }
            }
            // break跳到这里, j的循环停止，i的循环继续
            System.out.println("breaked");
        }
        System.out.println();

        System.out.println(" ------------------------ continue语句 ------------------------------");
        // continue提前结束本次循环(i=n)，直接继续执行下次循环(i=n+1)
        sum = 0;
        for (int i=1; i<=10; i++) {
            System.out.println("begin i = " + i);
            if (i % 2 == 0) { // 对所有偶数不执行
                continue; // continue语句会结束本次循环
            }
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println(sum); // 25
    }
}
