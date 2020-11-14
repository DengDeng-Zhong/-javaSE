package cn.targetpath.d2;

/**
 * 比较运算符：
 * 大于：		>
 * 小于：		<
 * 大于等于：	>=
 * 小于等于：	<=
 * 相等：		==	【两个等号连写才是相等，一个等号代表的是赋值】
 * 不相等：	!=
 *
 * 注意事项：
 * 1. 比较运算符的结果一定是一个boolean值，成立就是true，不成立就是false
 * 2. 如果进行多次判断，不能连着写。
 * 数学当中的写法，例如：1 < x < 3
 * 程序当中【不允许】这种写法。
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/11/1 22:36
 */
public class Demo08Operator {
    public static void main(String[] args) {
        // true
        System.out.println(10 > 5);
        int num1 = 10;
        int num2 = 12;
        // true
        System.out.println(num1 < num2);
        // false
        System.out.println(num2 >= 100);
        // true
        System.out.println(num2 <= 100);
        // true
        System.out.println(num2 <= 12);
        System.out.println("===============");

        // true
        System.out.println(10 == 10);
        // true
        System.out.println(20 != 25);
        // false
        System.out.println(20 != 20);

        int x = 2;
        // System.out.println(1 < x < 3); // 错误写法！编译报错！不能连着写。
    }
}
