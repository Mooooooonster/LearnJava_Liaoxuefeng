// 定义一个类，将一组int值视为字符的Unicode编码，然后将它们拼成一个字符串
public class Ex4 {
    public static void main(String[] args) {
        int a = 72;
        int b = 105;
        int c = 65281;
        var a1 = (char) a;
        var b1 = (char) b;
        var c1 = (char) c;
        System.out.println(String.valueOf(a1)+b1+c1);
    }
}
