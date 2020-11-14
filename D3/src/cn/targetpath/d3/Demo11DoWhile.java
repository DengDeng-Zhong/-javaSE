package cn.targetpath.d3;

/**
 * do-while循环的标准格式：
 *
 * do {
 * 	循环体
 * } while (条件判断);
 *
 * 扩展格式：
 *
 * 初始化语句
 * do {
 * 	循环体
 * 	步进语句
 * } while (条件判断);
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/11/1 23:54
 */
public class Demo11DoWhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("原谅你啦！起来吧！地上怪凉！" + i);
        }
        System.out.println("===============");

        // 1. 初始化语句
        int i = 1;
        do {
            // 3. 循环体
            System.out.println("原谅你啦！起来吧！地上怪凉！" + i);
            i++; // 4. 步进语句
            // 2. 条件判断
        } while (i <= 10);
    }
}
