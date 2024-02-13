// 定义一个【判断是否小学生】的类
public class Ex3 {
    public static void main(String[] args) {
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = 6<=age & age<=12;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}
