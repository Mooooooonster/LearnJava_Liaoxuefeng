// 本节介绍了一个基本java程序的结构

// 文件名必须和类名保持一致（包括大小写）
// java程序通过class类定义，public表示该类是公开的
// 关键字小写（如：public、class）,{}中进行类的定义
// 类名首字母大写(大驼峰命名，如HelloWorld）
public class HelloWorld {

    // 在类中定义了一个main方法，{}中进行方法定义，一个类中可以定义多个method方法
    // 方法命名以小写字母开头（小驼峰命名，如mainMethod）
    // ()中表示入参，参数类型是string[]，参数名字叫做args
    // public static表示静态公开类，void表示返回类型（没有任何返回值）
    // 每个类定义的 public static void main(String[] args) 为java程序的固定入口，java程序总是从main方法开始执行
    public static void main(String[] args) {

        // 方法代码的每一行用;结束
        // println: print line 表示打印并换行
        System.out.println("Hello, world!");
    }
}
// java本身是一个文本文件，需要先用javac将其编译为.class文件，然后用java命令执行这个字节码
// javac是编译器，java是虚拟机
// 蛇形命名法：小写+下划线，如：param_name，一般用于属性命名