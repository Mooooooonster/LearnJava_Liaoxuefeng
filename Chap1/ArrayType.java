// 本章介绍了 整型数组（各元素是基本类型）和字符串类型（各元素是引用类型）
public class ArrayType {
    public static void main(String[] args){
        // 当有一组相同类型的变量，其实没有必要定义5次，可以通过定义一个数组来实现
        /* Java的数组有几个特点：
           数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
           数组一旦创建后，大小就不可改变。
        */
        System.out.println("-------------------- 整型数组 ---------------------------");
        int[] array_1 = new int[5]; // 创建一个可容纳5个int元素的数组。
        array_1[0] = 68; // 依次为每个元素赋值
        array_1[1] = 79;
        array_1[2] = 91;
        array_1[3] = 85;
        System.out.println(array_1[4]); // 0 不设置[4]就是默认值0

        // 通过.length可以获取数组长度
        System.out.println(array_1.length);// 5

        // 数组是引用类型，在使用索引访问数组元素时，如果索引超出范围，运行时将报错
        // System.out.println(array_n[5]); // 会报错，ArrayIndexOutOfBoundsException

        // 也可以在定义数组时直接指定初始化的元素，这样就不必写出数组大小，而是由编译器自动推算数组大小
        int[] array_2 = new int[] {100,95,84,35,99};
        System.out.println(array_2.length); // 5
        // 进一步简写
        int[] array_3 = {99,85,76,84};
        System.out.println(array_3.length); // 4

        // 和字符串一样，如果重新赋值，只是指向的存储地址变了，原有数组依然存在
        int[] array_4 = array_2;
        array_2 = new int[] {1,2,3};
        System.out.println(array_2.length); // 3
        System.out.println(array_4.length);// 5
        System.out.println();

        System.out.println("-------------------- 字符串数组 ---------------------------");
        // 数组元素不再是基本类型，而是引用类型
        String[] names = {"ABC", "XYZ", "zoo"};
        // 对于String[]类型的数组变量names，它实际上包含3个元素，但每个元素都指向某个字符串对象
        // 修改字符型数组的某个元素值，实际修改的是指向的存储位置
        var a = names[0];
        names[0] = "HAHA";
        System.out.println(a); // ABC
        System.out.println(names[0]); //HAHA
    }
}
