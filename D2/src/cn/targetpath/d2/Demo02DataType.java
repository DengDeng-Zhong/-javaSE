package cn.targetpath.d2;

/**
 * 强制类型转换
 * 	1. 特点：代码需要进行特殊的格式处理，不能自动完成。
 * 	2. 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;
 *
 * 注意事项：
 * 	1. 强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出。
 * 	2. byte/short/char这三种类型都可以发生数学运算，例如加法“+”.
 * 	3. byte/short/char这三种类型在运算的时候，都会被首先提升成为int类型，然后再计算。
 * 	4. boolean类型不能发生数据类型转换
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/11/1 19:32
 */
public class Demo02DataType {
    public static void main(String[] args) {
        // 左边是int类型，右边是long类型，不一样
        // long --> int，不是从小到大
        // 不能发生自动类型转换！
        // 格式：范围小的类型 范围小的变量名 = (范围小的类型) 原本范围大的数据;
        int num = (int) 100L;
        System.out.println(num);

        // long强制转换成为int类型
        int num2 = (int) 6000000000L;
        // 1705032704
        System.out.println(num2);

        // double --> int，强制类型转换
        int num3 = (int) 3.99;
        // 3，这并不是四舍五入，所有的小数位都会被舍弃掉
        System.out.println(num3);

        // 这是一个字符型变量，里面是大写字母A
        char zifu1 = 'A';
        // 66，也就是大写字母A被当做65进行处理
        System.out.println(zifu1 + 1);
        // 计算机的底层会用一个数字（二进制）来代表字符A，就是65
        // 一旦char类型进行了数学运算，那么字符就会按照一定的规则翻译成为一个数字

        // 注意！右侧的数值大小不能超过左侧的类型范围
        byte num4 = 40;
        byte num5 = 50;
        // byte + byte --> int + int --> int
        int result1 = num4 + num5;
        // 90
        System.out.println(result1);

        short num6 = 60;
        // byte + short --> int + int --> int
        // int强制转换为short：注意必须保证逻辑上真实大小本来就没有超过short范围，否则会发生数据溢出
        short result2 = (short) (num4 + num6);
        // 100
        System.out.println(result2);
    }
}
