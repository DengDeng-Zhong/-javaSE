package cn.targetpath.d5.demo02;

/**
 * 数组的索引编号从0开始，一直到“数组的长度-1”为止。
 *
 * 如果访问数组元素的时候，索引编号并不存在，那么将会发生
 * 数组索引越界异常
 * ArrayIndexOutOfBoundsException
 *
 * 原因：索引编号写错了。
 * 解决：修改成为存在的正确索引编号。
 *
 * *********************************************************
 *  所有的引用类型变量，都可以赋值为一个null值。但是代表其中什么都没有。
 *
 * 数组必须进行new初始化才能使用其中的元素。
 * 如果只是赋值了一个null，没有进行new创建，
 * 那么将会发生：
 * 空指针异常 NullPointerException
 *
 * 原因：忘了new
 * 解决：补上new
 *
 * *********************************************************
 *
 *如何获取数组的长度，格式：
 * 数组名称.length
 *
 * 这将会得到一个int数字，代表数组的长度。
 *
 * 数组一旦创建，程序运行期间，长度不可改变。
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/11/29 22:14
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = { 15, 25, 35 };

        System.out.println(array[0]); //15
        System.out.println(array[1]); // 25
        System.out.println(array[2]); // 35

        // 错误写法
        // 并不存在3号元素，所以发生异常
        System.out.println(array[3]);

        //************************************************
        int[] array2 = null;
//        array = new int[3];
        System.out.println(array2[0]);

        //************************************************
        int[] arrayA = new int[3];

        int[] arrayB = {10, 20, 30, 3, 5, 4, 6, 7, 8, 8, 65, 4, 44, 6, 10, 3, 5, 4, 6, 7, 8, 8, 65, 4};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);
        System.out.println("=============");

        int[] arrayC = new int[3];
        // 3
        System.out.println(arrayC.length);
        arrayC = new int[5];
        // 5
        System.out.println(arrayC.length);

    }
}
