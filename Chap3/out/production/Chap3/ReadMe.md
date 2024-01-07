# Chap3. 数组操作
本章介绍了对数组的遍历、排序操作，及多维数组概念。
### 本章内容&代码阅读顺序：
1. 遍历数组 --> ArrayLoopWithFor
2. 数组排序 --> SortForArray
3. 多维数组 --> MultiDimArray
4. 命令行参数 --> CommandLineParam



### 本章练习题
**【Ex.1】** 实现对数组进行降序排序
```
// 降序排序
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 排序前:
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.println(Arrays.toString(ns));
        
        // @TODO: 对数组进行降序排序
        ？？？

        // 排序后:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
```

**【Ex.2】** 使用二维数组表示一组学生的各科成绩，计算所有学生的平均分
```
public class Main {
    public static void main(String[] args) {
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double average = 0;
        System.out.println(average);

        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
```

