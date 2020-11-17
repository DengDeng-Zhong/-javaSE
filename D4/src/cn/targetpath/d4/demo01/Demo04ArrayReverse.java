package cn.targetpath.d4.demo01;

/**
 * 数组的索引编号从0开始，一直到“数组的长度-1”为止。
 *
 * 如果访问数组元素的时候，索引编号并不存在，那么将会发生
 * 数组索引越界异常
 *
 * 所有的引用类型变量，都可以赋值为一个null值。但是代表其中什么都没有。
 *
 * 数组必须进行new初始化才能使用其中的元素。
 * 如果只是赋值了一个null，没有进行new创建，
 * 那么将会发生：
 * 空指针异常 NullPointerException
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/11/17 23:04
 */
public class Demo04ArrayReverse {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        // 遍历打印数组本来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");

        /*
        初始化语句：int min = 0, max = array.length - 1
        条件判断：min < max
        步进表达式：min++, max--
        循环体：用第三个变量倒手
         */
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        // 再次打印遍历输出数组后来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
