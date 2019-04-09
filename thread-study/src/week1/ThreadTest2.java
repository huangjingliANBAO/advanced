package week1;

public class ThreadTest2 extends Object implements Runnable {
    private int count = 10;
    @Override
    //重写run()方法
    public void run() {
        while (true){
            System.out.print(count + "  ");
            if (--count == 0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        ThreadTest2 test2 = new ThreadTest2();
        Thread tt = new Thread(test2);
        tt.start();

    }
    }

