# Chap2. java流程控制
本章介绍了条件判断、循环等多种流程控制相关语句。
### 本章内容&代码阅读顺序：
1. 输出 --> Output
   - 本章介绍了基本输出、标准化输出相关内容
2. 输入 --> Input
3. if判断 --> IfCondition
4. switch多重选择 -> SwitchCondition
5. while循环 --> WhileCondition
6. do while循环 --> DoWhileCondition
7. for循环 & for each循环 --> ForCondition
8. break & continue --> BreakAndContinue



### 本章练习题
**【Ex.1】** 定义一个【输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）】的类\

    public class Main {
        public static void main(String[] args) {
           // @TODO: 请在这里补全代码
           ???;
        }
    }

**【Ex.2】** 
请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。\
BMI = 体重(kg)除以身高(m)的平方\
BMI结果：\
过轻：低于18.5 \
正常：18.5-25 \
过重：25-28 \
肥胖：28-32 \
非常肥胖：高于32

    public class Main {
        public static void main(String[] args) {
           // @TODO: 请在这里补全代码
           ???;
        }
    }

**【Ex.3】** 使用switch实现一个简单的石头、剪子、布游戏。

    public class Main {
        public static void main(String[] args) {
           // @TODO: 请在这里补全代码
           ???;
        }
    }

**【Ex.4】** 使用while计算从m到n的和

    public class Main {
        public static void main(String[] args) {
            int sum = 0;
            int m = 20;
            int n = 100;
            // @TODO：使用while计算M+...+N:
            while (???) {
                ???
            }
            System.out.println(sum);
        }
    }

**【Ex.5】** 使用do while计算从m到n的和
```
    public class Main {
        public static void main(String[] args) {
            int sum = 0;
            int m = 20;
            int n = 100;
            // @TODO：使用while计算M+...+N:
            do {
               ???  
            } while (???);
            System.out.println(sum);
        }
    }
```

**【Ex.6】** 对一个整型数组的所有元素求和
```
   public class Main {
      public static void main(String[] args) {
         int[] ns = { 1, 4, 9, 16, 25 };
         int sum = 0;
         for (???) {
            ???
         }
         System.out.println("sum = " + sum);
      }
   }
```

**【Ex.7】** 用for循环倒序输出每一个元素
```
   public class Main {
       public static void main(String[] args) {
           int[] ns = { 1, 4, 9, 16, 25 };
           for (int i=?; ?; ?) {
               System.out.println(ns[i]);
           }
       }
   }
```

**【Ex.8】** 利用for each循环对数组每个元素求和
```
   public class Main {
       public static void main(String[] args) {
           int[] ns = { 1, 4, 9, 16, 25 };
           int sum = 0;
           for (???) {
               // TODO
           }
           System.out.println(sum); // 55
       }
   }
```

**【Ex.9】** 请利用for循环计算π，圆周率π可以使用公式计算：\
π/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ...
```
   public class Main { 
       public static void main(String[] args) {
           int[] ns = { 1, 4, 9, 16, 25 };
           int sum = 0;
           for (???) {
               // TODO
           }
           System.out.println(sum); // 55
       }
   }
```