/*
    请利用for循环计算π，圆周率π可以使用公式计算：
    π/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ...
*/
public class Ex9 {
    public static void main(String[] args) {
        double x = 0.0;
        for (int i=1,j=1;Math.abs(i)<1/0.00001; i+=2,j*=-1){
            // System.out.println(i*j);
            x += 1.0/(i*j);
        }
        double pi = x*4.0;
        System.out.println("The value of π is " + pi);
    }
}
