package cn.targetpath.d6.demo03;

/**
 * 局部变量和成员变量
 *
 * 1. 定义的位置不一样【重点】
 * 局部变量：在方法的内部
 * 成员变量：在方法的外部，直接写在类当中
 *
 * 2. 作用范围不一样【重点】
 * 局部变量：只有方法当中才可以使用，出了方法就不能再用
 * 成员变量：整个类全都可以通用。
 *
 * 3. 默认值不一样【重点】
 * 局部变量：没有默认值，如果要想使用，必须手动进行赋值
 * 成员变量：如果没有赋值，会有默认值，规则和数组一样
 *
 * 4. 内存的位置不一样（了解）
 * 局部变量：位于栈内存
 * 成员变量：位于堆内存
 *
 * 5. 生命周期不一样（了解）
 * 局部变量：随着方法进栈而诞生，随着方法出栈而消失
 * 成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失
 *=========================
 * 面向对象三大特征：封装、继承、多态。
 *
 * 封装性在Java当中的体现：
 * 1. 方法就是一种封装
 * 2. 关键字private也是一种封装
 *
 * 封装就是将一些细节信息隐藏起来，对于外界不可见。
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/19 17:49
 */
public class Demo01VariableDifference {

    String name; // 成员变量

    public void methodA() {
        int num = 20; // 局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param) { // 方法的参数就是局部变量
        // 参数在方法调用的时候，必然会被赋值的。
        System.out.println(param);

        int age; // 局部变量
//        System.out.println(age); // 没赋值不能用

//        System.out.println(num); // 错误写法！
        System.out.println(name);
    }
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 20, 100};

        int max = getMax(array);
        System.out.println("最大值：" + max);
    }

    // 给我一个数组，我还给你一个最大值
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


}
