package cn.targetpath.d6.demo02;

/**
 * 属性：品牌、价格、颜色
 * 行为：打电话、发短信
 *
 * 对应到类当中：
 * 成员变量（属性）：
 *     String brand; // 品牌
 *     double price; // 价格
 *     String color; // 颜色
 * 成员方法（行为）：
 *     public void call(String who) {} // 打电话
 *     public void sendMessage() {} // 群发短信
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/18 20:25
 */
public class Phone {
    // 成员变量
    public String brand;
    public String color;
    public double price;
    // 成员方法
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
