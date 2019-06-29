package com.java.util.fuxi.demo4;

public class Person {
    private String name;
    private char sex;
    private int age;

    /**
     * 空构造方法
     * @return
     */

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    /**
     * 含参构造方法
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * toString()方法
     * @return
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
