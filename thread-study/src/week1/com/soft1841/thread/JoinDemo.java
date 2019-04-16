package week1.com.soft1841.thread;

/**
 * join()方法加入
 * @author 黄敬理
 * 2019.04.17
 */
public class JoinDemo extends Thread {
    @Override
    public void run() {
        for (int i = 10;i>0;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("开始倒数");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JoinDemo joinDemo  = new JoinDemo();
        Thread thread = new Thread(joinDemo);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

}