# Chap4. 面向对象编程
本章介绍了面向对象编程的基本概念。
面向对象编程，英文是Object-Oriented Programming，简称OOP，是一种通过对象的方式，把现实世界映射到计算机模型的一种编程方法。\
与之对应的，是面向过程编程，是把模型分解成一步一步的过程进行编程。
### 本章内容&代码阅读顺序：
1. 类与实例 --> ClassAndInstance
2. 方法 --> ClassMethod
3. 方法参数设置 --> ParamSetting 
4. 参数绑定 --> ParamBinding

### 本章练习题
**【Ex.1】** 请定义一个City类，该class具有如下字段:\
name: 名称，String类型\
latitude: 纬度，double类型\
longitude: 经度，double类型
```
// City
public class Main {
    public static void main(String[] args) {
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
    }
}

class City {
    // @TODO: 编写City类
    ???
}
```

**【Ex.2】** 给Person类增加getAge/setAge方法
```
// 引用类型参数绑定
public class Main {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("小明");
        ming.setAge(12);
        System.out.println(ming.getAge());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // @TODO：增加getAge和setAge方法 
}

```