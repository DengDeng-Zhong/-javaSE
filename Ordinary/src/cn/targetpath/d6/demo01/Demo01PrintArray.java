package cn.targetpath.d6.demo01;

/**
 * 面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事儿。
 *
 * 通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。
 *
 * 1. 导包：也就是指出需要使用的类，在什么位置。
 * import 包名称.类名称;
 * 对于和当前类属于同一个包的情况，可以省略导包语句不写。
 *
 * 2. 创建，格式：
 * 类名称 对象名 = new 类名称();
 * Student stu = new Student();
 *
 * 3. 使用，分为两种情况：
 * 使用成员变量：对象名.成员变量名
 * 使用成员方法：对象名.成员方法名(参数)
 * （也就是，想用谁，就用对象名点儿谁。）
 *
 * 注意事项：
 * 如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/17 20:52
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.age);
        System.out.println(student1.name);
        System.out.println("================");

        student1.age=18;
        student1.name="赵丽颖";
        System.out.println(student1.age);
        System.out.println(student1.name);
        System.out.println("================");

        student1.eat();
        student1.sleep();
        student1.study();

    }
}
