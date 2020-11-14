package cn.targetpath.d3;

/**
 * 标准的if-else语句
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/11/1 23:41
 */
public class Demo03IfElse {
    public static void main(String[] args) {
        int num = 666;
        // 如果除以2能够余数为0，说明是偶数
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
