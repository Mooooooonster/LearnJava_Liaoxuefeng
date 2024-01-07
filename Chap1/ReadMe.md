# Chap1. Java基础程序
本章介绍了java程序的基本结构和常见数据类型。
### 本章内容&代码阅读顺序：
1. Java程序的基本结构 --> HelloWorld
2. Java的几种注释方法 --> JavaComment
3. 变量和基本数据类型 --> VarAndDataType
   - 介绍了变量、常量，基本的数据类型，以及变量的作用范围（作用域）
4. 整数计算 --> IntCalculation
   - 介绍了整型的四则运算、取余、溢出、移位、位运算、运算顺序、类型自动提升和强制转换
5. 浮点数计算 --> FloatCalculation
   - 介绍了浮点数的正确比较方法，类型提升、溢出、强制转换
6. 布尔计算 --> BoolCalculation
   - 本章介绍了布尔运算的比较运算符、三元运算符，介绍了短路运算的概念
7. 字符和字符串 --> CharAndString
   - 本章介绍了 字符型char和字符串类型String的区别，字符串拼接、多行字符串，字符串的不可变特性 和 空值
8. 数组类型 --> ArrayType

### 本章练习题
**【Ex.1】** 定义一个【计算前N个自然数的和】的类\

    // 计算前N个自然数的和
    public class Main {
        public static void main(String[] args) {
           int n = 100;
           // @TODO: 请在这里补全代码
           int sum = ???;
           System.out.println(sum);
           System.out.println(sum == 5050 ? "测试通过" : "测试失败");
        }
    }

**【Ex.2】** 定义一个【计算一元二次方程的两个解】的类\

      // 一元二次方程
      public class Main {
         public static void main(String[] args) {
            double a = 1.0;
            double b = 3.0;
            double c = -4.0;
            // 求平方根可用 Math.sqrt():
            // System.out.println(Math.sqrt(2)); ==> 1.414
            // TODO: 请在此处补全r1、r2计算方法
            double r1 = ???;
            double r2 = ???;
           System.out.println(r1);
           System.out.println(r2);
           System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
         }
      }

**【Ex.3】** 定义一个【判断是否小学生】的类\

      // 布尔运算
      public class Main {
         public static void main(String[] args) {
            int age = 7;
            // primary student的定义: 6~12岁
            // @TODO: 请在这里补全代码
            boolean isPrimaryStudent = ???;
            System.out.println(isPrimaryStudent ? "Yes" : "No");
         }
      }

**【Ex.4】** 定义一个类，将一组int值视为字符的Unicode编码，然后将它们拼成一个字符串
      
      public class Main {
         public static void main(String[] args) {
          // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
         int a = 72;
         int b = 105;
         int c = 65281;
         // @TODO: 请在这里补全代码
         var a1 = ???;
         var b1 = ???;
         var c1 = ???;
         String s = a1 + b1 + c1;
         System.out.println(s);
      
          }
      }
