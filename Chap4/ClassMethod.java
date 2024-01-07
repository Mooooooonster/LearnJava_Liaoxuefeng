public class ClassMethod {
    // 直接把class包含的field用public暴露给外部可能会破坏封装性
    // 即外部使用时可能给属性赋无意义的值，如给age赋负数值 -> 直接操作field容易有逻辑错误

    // 可通过private修饰field来拒绝外部访问
    public static void main(String[] args) {
        Person2 ming2 = new Person2();
        // ming2.name = "Xiao Ming"; // 由于是private，会编译错误；java: name 在 Person2 中是 private 访问控制

        // 通过定义的方法来访问private field
        // 调用方法的语法是 实例变量.方法名(参数);
        ming2.setName("XiaoMing");
        // ming2.setAge(-99); // 由于设置逻辑判断，无意义的传入值会报错 invalid age value
        ming2.setAge(12);
        ming2.setBirth(1995);
        System.out.println(ming2.getAge());

    }
}

class Person2 { // 必须得重新换个名字，跨文件的同名类也会报错
    private String name;
    private int age;
    private int birth;

    // 通过创建Method来访问private类
    public String getName() {
        return this.name; // 在方法内部，可以使用一个隐含的变量this，它始终指向当前实例
    }

    // 除逻辑判断外，还可以对输入值进行预处理
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip(); // 去掉首尾空格
        // 如果没有命名冲突，可以省略this
        // 如果有局部变量和字段重名，那么局部变量优先级更高，就必须加上this
    }

    public int getAge() {
        // return this.age;
        return calcAge(2023); // 通过访问private方法，用户请求年龄时无需关注计算逻辑
    }

    // 可通过在方法中对传入值进行判断，来确保赋值的逻辑性
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value"); // 在不合逻辑的时候抛出异常
        }
        this.age = age;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    // 同field一样，有public method就有private method，只允许内部调用
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }
}