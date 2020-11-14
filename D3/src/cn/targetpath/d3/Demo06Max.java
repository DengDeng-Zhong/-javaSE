package cn.targetpath.d3;

/**
 * 题目：使用三元运算符和标准的if-else语句分别实现：取两个数字当中的最大值
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/11/1 23:45
 */
public class Demo06Max {
    public static void main(String[] args) {
        int a = 105;
        int b = 100;
        int max;

        // 首先使用三元运算符
        // int max = a > b ? a : b;

        if (a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println("最大值为:"+max);
    }
}
