public class CommandLineParam {
    // Java程序的入口是main方法，main方法可以接受一个String[]数组的命令行参数
    // 通过命令行执行 java CommandLineParam -version 实现
    public static void main(String[] args) {
        for (String arg : args) {
            if ("-version".equals(arg)) { //如果输入时传递的参数为-version，则会打印v1.0
                System.out.println("v 1.0");
                break;
        // 如何解析命令行参数在Terminal里运行下述命令实现
        // java CommandLineParam -version
            }
        }
    }
}
