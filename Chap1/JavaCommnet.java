// 本章介绍java的几种基本注释方法
// java中有三种注释：文档注释（算一种特殊的多行注释），单行注释，多行注释
/** 文档注释，可以用来自动生成文档的注释，用/和2个*标示开头和结尾
 *  每行均以*开头
 *  @author：Zoey
 *  有固定的JavaDoc标签，用于标示作者、版本等，可参考以下链接：
 *  https://zhuanlan.zhihu.com/p/619502562?utm_id=0
 *  https://blog.csdn.net/qq_43085982/article/details/130381243
 *  IDEA可以通过 Tools（工具）-> Generate JavaDoc（生成JavaDoc）生成文档
 */
public class JavaCommnet {
    // 单行注释，以双斜线开头，到本行末尾结束
    public static void main(String[] arges){
        /* 多行注释，以*和/定义开头和结尾
           这是注释
           这也是注释
         */
        System.out.println("This is a tutorial for java comment!");
    }
}
