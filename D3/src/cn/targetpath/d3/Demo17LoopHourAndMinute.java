package cn.targetpath.d3;

/**
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/11/2 0:04
 */
public class Demo17LoopHourAndMinute {
    public static void main(String[] args) {
        // 外层控制小时
        for (int hour = 0; hour < 24; hour++) {

            // 内层控制小时之内的分钟
            for (int minute = 0; minute < 60; minute++) {
                System.out.println(hour + "点" + minute + "分");
            }

        }
    }
}
