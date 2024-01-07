public class ParamBinding {
    public static void main(String[] args) {
        Person p = new Person();
        // 基本类型的参数传递
        // 基本类型参数的传递，是调用方值的复制。双方各自的后续修改，互不影响
        System.out.println("---------------- 基本类型的参数传递 ---------------------");
        int n = 15; // n的值为15
        p.setAge(n); // 传入n的值
        System.out.println(p.getAge()); // 15
        n = 20; // n的值改为20
        System.out.println(p.getAge()); // 仍是15

        // 引用类型的参数传递
        // 引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对方
        System.out.println("---------------- 引用类型的参数传递 ---------------------");
        String[] fullname = new String[] { "Homer", "Simpson" };
        p.setNames(fullname);
        System.out.println(p.getNames()); // "Homer Simpson"
        fullname[0] = "Bart";
        System.out.println(p.getNames()); // Bart Simpson

        String bob = "Bob";
        p.setName(bob); // 传入bob变量
        System.out.println(p.getName()); // "Bob"
        bob = "Alice"; // bob改名为Alice
        System.out.println(p.getName()); // "Bob"

        // 在 Java 中，String 和 String[] 都是引用类型，存储的是对象的引用。
        // 但是，String 类型的对象是不可变的.
        // 也就是说，一旦创建了一个 String 对象，就无法再修改它的值.任何对 String 对象的修改都会创建一个新的对象。

        // 而 String[] 类型的对象是可变的，也就是说，可以修改数组中的元素值。

        // 当我们将一个 String[] 类型的变量传递给一个方法时，实际上传递的是该变量所引用的数组对象在内存中的地址。
        // 因此，当我们在方法中修改数组中的元素值时，对数组进行的修改会影响到原始数组，在方法返回后也能保留。
        //
        // 而 String 类型因为不可变，修改即创建新的对象也就有了新的地址，所以方法中引用的地址的值没有改变，输出的结果也就没有改变
    }
}

class Person {
    private int age;
    private String[] names;
    private String name;

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNames() {
        return this.names[0] + " " + this.names[1];
    }
    public void setNames(String[] names) {
        this.names = names;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// 可尝试ReadMe.md 中练习题 Ex.2

/* 其他补充：
栈内存（Stack Memory）：

栈内存是用于存储函数调用、局部变量和临时数据的一种内存空间。
数据在栈上以一种有序的方式存储，遵循后进先出（Last In, First Out，LIFO）的原则。
栈内存的分配和释放是自动进行的，由编译器或解释器负责管理。
堆内存（Heap Memory）：

堆内存用于存储程序运行时动态分配的数据，如对象、数组等。
堆内存的分配和释放需要手动管理，程序员负责在适当的时候申请和释放内存，否则可能导致内存泄漏或者内存溢出。
基本类型（Primitive Types）：

基本类型是语言中最基本的数据类型，通常包括整数、浮点数、字符、布尔等。
这些类型的值直接存储在栈内存中，其大小是固定的，由语言规范定义。
引用类型（Reference Types）：

引用类型是指那些存储在堆内存中，并通过引用在栈内存中存储地址的数据类型，如对象、数组等。
引用类型的大小不固定，它们的值是对象在堆内存中的地址。
浅拷贝（Shallow Copy）：

浅拷贝复制对象时，只复制对象本身和对象中的基本类型数据，不会复制引用类型的内容。
如果被复制的对象包含引用类型的成员，浅拷贝将复制这些引用，而不是引用指向的实际数据。
深拷贝（Deep Copy）：

深拷贝在复制对象时，不仅复制对象本身和基本类型数据，还递归地复制引用类型的所有成员及其关联的数据。
深拷贝得到的是一个完全独立于原始对象的新对象，对新对象的修改不会影响原始对象。
ps: Python中有一个叫copy的模块, 可以用他做简单的实验,  pandas的DataFrame就是一个很好的例子; Java中可以使用clone(), 但也要注意区分Shallow OR Deep.
 */