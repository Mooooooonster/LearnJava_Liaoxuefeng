public class ParamSetting
{
    public static void main(String[] args) {
        Person3 ming3 = new Person3();
        // 调用时，必须按照定义方法时的顺序和数据类型进行输入
        // 参数个数、类型不对都会报错
        ming3.setNameAndAge("XiaoMing", 28);
        Group g = new Group();
        g.setNames("Xiao Ming", "Xiao Hong", "Xiao Jun"); // 传入3个String
        g.setNames("Xiao Ming"); // 传入1个String
        g.setNames(); // 传入0个String
    }
}

class Person3{
    // 方法参数: 方法可以包含0个或任意个参数。方法参数用于接收传递给方法的变量值。调用方法时，必须严格按照参数的定义一一传递
    public void setNameAndAge(String name, int age) {
        System.out.println(name+": "+age);
    }
}

class Group {
    private String[] names;
    // 可变参数用类型...定义，可变参数相当于数组类型,可传入0~N个参数
    // 传入0个参数时，是空数组，不是null
    public void setNames(String... names) {
        this.names = names;
    }
    // 可以把可变参数改写为String[]类型，但这样在main中调用时
    // 1. 需要自己先构造String[]
    // 2. 调用方可以传入null： g.setNames(null);
}