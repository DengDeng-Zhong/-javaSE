package cn.targetpath.d3;

/**
 * while循环有一个标准格式，还有一个扩展格式。
 *
 * 标准格式：
 * while (条件判断) {
 * 	循环体
 * }
 *
 * 扩展格式：
 *
 * 初始化语句;
 * while (条件判断) {
 * 	循环体;
 * 	步进语句;
 * }
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/11/1 23:52
 */
public class Demo10While {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("我错啦！" + i);
        }
        System.out.println("=================");

        // 1. 初始化语句
        int i = 1;
        // 2. 条件判断
        while (i <= 10) {
            // 3. 循环体
            System.out.println("我错啦！" + i);
            i++; // 4. 步进语句
        }
    }
}
