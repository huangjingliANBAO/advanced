package com.java.util.one.test;
/**
 * 学习枚举类型
 * @author 黄敬理
 * 2019.03.21
 */
enum Week {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    String week;
    Week(String week) {
        this.week = week;
    }
    public String getName() {
        return week;
    }
    public static Week getWeek(String week) {
        //定义一个静态方法，根据一个简称得到完整的星期名称
        switch (week) {
            case "mon":
                return Week.MONDAY;
            case "tues":
                return Week.TUESDAY;
            case "wed":
                return Week.WEDNESDAY;
            case "thru":
                return Week.THURSDAY;
            case "fri":
                return Week.FRIDAY;
            case "sat":
                return Week.SATURDAY;
            case "sun":
                return Week.SUNDAY;
            default:
                return Week.MONDAY;
        }
    }
}
public class EnumSetTest {
    public static void main(String[] args) {
        Week weekArray[] = Week.values();
        //遍历枚举
        for (Week k : weekArray) {
            System.out.println(k + "----" + k.getName());
        }
    }
}
