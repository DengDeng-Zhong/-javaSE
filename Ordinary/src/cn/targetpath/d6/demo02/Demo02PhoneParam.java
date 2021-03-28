package cn.targetpath.d6.demo02;

/**
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/19 17:22
 */
public class Demo02PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.color = "黑色";
        one.price = 8388.01;
        method(one);

    }
    public static void method(Phone param){
        System.out.println(param.price);
        System.out.println(param.color);
        System.out.println(param.brand);
    }
}
