package com.java.util.fuxi.demo5;

public class CallPhone implements Phone {
    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("发送信息");
    }
}
