// 使用二维数组表示一组学生的各科成绩，计算所有学生的平均分
public class Ex2 {
    public static void main(String[] args) {
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };

        double average = 0;
        int x = 0;
        for (int[] i:scores){
            for (int j:i){
                average+=j;
                x+=1;
            }
        }
        average = average/x;
        System.out.println(average);

        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
