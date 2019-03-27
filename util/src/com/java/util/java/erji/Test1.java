package com.java.util.java.erji;

public class Test1 {
    public static void main(String[] args) {
        int count,xPos = 25;
        for (count = 1;count <= 10; count++){
            if (count == 5){
                break;
            }
            System.out.print(count);
            xPos += 10;

        }
    }
}
