package cn.targetpath.d1;

/**
 * 变量：程序运行期间，内容可以发生改变的量。
 * 创建一个变量并且使用的格式：
 *
 * 数据类型 变量名称; // 创建了一个变量
 * 变量名称 = 数据值; // 赋值，将右边的数据值，赋值交给左边的变量
 *
 * 一步到位的格式：
 *
 * 数据类型 变量名称 = 数据值; // 在创建一个变量的同时，立刻放入指定的数据值
 * @author DengBo_Zhong
 * @date 2020/11/1 19:00
 * @version V1.0
 */
public class Demo02Variable {
    public static void main(String[] args) {
        // 创建一个变量
        // 格式：数据类型 变量名称;
        int num1;
        // 向变量当中存入一个数据
        // 格式：变量名称 = 数据值;
        num1 = 10;
        // 当打印输出变量名称的时候，显示出来的是变量的内容
        // 10
        System.out.println(num1);

        // 改变变量当中本来的数字，变成新的数字
        num1 = 20;
        // 20
        System.out.println(num1);

        // 使用一步到位的格式来定义变量
        // 格式：数据类型 变量名称 = 数据值;
        int num2 = 25;
        // 25
        System.out.println(num2);

        num2 = 35;
        // 35
        System.out.println(num2);
        System.out.println("===============");

        // 注意：右侧数值的范围不能超过左侧数据类型的取值范围
        byte num3 = 30;
        // 30
        System.out.println(num3);

        // byte num4 = 400; // 右侧超出了byte数据范围，错误！

        short num5 = 50;
        // 50
        System.out.println(num5);

        long num6 = 3000000000L;
        // 3000000000
        System.out.println(num6);

        float num7 = 2.5F;
        // 2.5
        System.out.println(num7);

        double num8 = 1.2;
        // 1.2
        System.out.println(num8);

        char zifu1 = 'A';
        // A
        System.out.println(zifu1);

        zifu1 = '中';
        // 中
        System.out.println(zifu1);

        boolean var1 = true;
        // true
        System.out.println(var1);

        var1 = false;
        // false
        System.out.println(var1);

        // 将一个变量的数据内容，赋值交给另一个变量
        // 右侧的变量名称var1已经存在，里面装的是false布尔值
        // 将右侧变量里面的false值，向左交给var2变量进行存储
        // false
        boolean var2 = var1;
        System.out.println(var2);
    }
}
