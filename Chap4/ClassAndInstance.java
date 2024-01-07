public class ClassAndInstance {
    // 一个类别这种抽象的概念，就是类Class，比如：人、书本
    // 与该概念相对的、具体的东西，就是实例Instance，比如：小王、小张，《Java核心》、《Python入门》

    // class是一种对象模版，它定义了如何创建实例，因此，class本身就是一种数据类型
    // instance是对象实例，根据class创建
    // 一个class可以创建多个instance，每个instance类型相同，但各自属性可能不相同

    // main方法必须在最前面
    public static void main(String[] args) {
        // 创建实例
        Person1 ming1 = new Person1(); // 指向instance的变量都是引用变量
        // 可以用 变量.字段 访问实例变量
        ming1.name = "XiaoMing";
        ming1.age = 24;
        System.out.println(ming1.name);
    }
} // public类在这里已经结束了！！！
//  一个Java源文件可以包含多个类的定义，但只能定义一个public类，且public类名必须与文件名一致。
//  如果要定义多个public类，必须拆到多个Java源文件中。


// 定义Class
 class Person1 { // 一个类class可以包含多个字段field，用于描述其属性、特征
    public String name; // public用于修饰这个字段，表示其可被外部访问
    public int age;
}


// 可尝试ReadMe.md 中练习题 Ex.1

