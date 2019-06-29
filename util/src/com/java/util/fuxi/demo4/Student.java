package com.java.util.fuxi.demo4;

public class Student extends Person {
    private String number;
    private double scoreOfEn ;
    private double scoreOfJave ;
    private double scoreOfHtml ;

    /**
     * 求三门课程的平均数
     * @return
     */
    public double aver(){
        return (scoreOfEn + scoreOfJave + scoreOfHtml)/3;
    }

    /**
     * 求三门课程的最高分
     * @return
     */
    public double max(){
        return scoreOfEn > scoreOfJave ? (scoreOfEn > scoreOfHtml ? scoreOfEn : scoreOfHtml):(scoreOfJave > scoreOfHtml ? scoreOfJave : scoreOfHtml);
    }

    /**
     * 求三门课程的最低分
     * @return
     */
    public double min(){
        return  scoreOfEn < scoreOfJave ? (scoreOfEn < scoreOfHtml ? scoreOfEn : scoreOfHtml):(scoreOfJave < scoreOfHtml ? scoreOfJave : scoreOfHtml);
    }

    /**
     * 重写父类的同名方法
     * @return
     */
    public String toString(){
        return "学号" + number + "姓名" + getName() + "性别" + getSex() +"平均分" + aver() + "最高分" + max() + "最低分信息" + min();
    }
}
