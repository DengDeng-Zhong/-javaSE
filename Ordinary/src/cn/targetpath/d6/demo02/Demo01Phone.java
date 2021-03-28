package cn.targetpath.d6.demo02;

/**
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/19 9:49
 */
public class Demo01Phone {


    public static void main(String[] args) {
        // 根据手机类,创建一个名为one的对象
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("================");

        one.brand = "苹果";
        one.color = "黑色";
        one.price = 8388.01;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.color);
        System.out.println("================");

        one.call("jobs");
        one.sendMessage();
        System.out.println("================");
        // 将one当中保存的对象地址值赋值给two
        Phone two = one;
        System.out.println(two.brand); // 苹果
        System.out.println(two.price); // 8388.0
        System.out.println(two.color); // 黑色
        System.out.println("=========");

        two.brand = "三星";
        two.price = 5999.0;
        two.color = "蓝色";
        System.out.println(two.brand); // 三星
        System.out.println(two.price); // 5999.0
        System.out.println(two.color); // 蓝色
        System.out.println("=========");

        two.call("欧巴"); // 给欧巴打电话
        two.sendMessage(); // 群发短信


    }
}
