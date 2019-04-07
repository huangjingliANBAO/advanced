package week1;

public class ThreadTest1 extends Thread {
    private int count = 10;
    //重写run（）方法
    public void run(){
        while (true){
            System.out.print(count + "  ");
            if (--count == 0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest1 test1 = new ThreadTest1();
        //启动线程
        test1.start();
    }
}
