package week1.com.soft1841.thread;

/**
 * 售票线程程序3
 * 实现Runnable接口并同步线程（加锁）
 * @author 黄敬理
 * 2019.04.09
 */
public class TicketThreadTest3 {
    public static void main(String[] args) {
        TicketThread3 tt = new TicketThread3();
        Thread thread1 = new Thread(tt,"南工院");
        thread1.start();
        Thread thread2 = new Thread(tt,"南信院");
        thread2.start();
        Thread thread3 = new Thread(tt,"南铁院");
        thread3.start();
    }
}
class TicketThread3 implements Runnable{
private  int tickets = 10;
    /**
     * 数据共享 同步代码块的方式加锁
     */
    @Override
    public void run() {
        while (true){
            //同步售票代码块，也就是线程关键字
            synchronized (this){
                if (tickets > 0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("中断异常");
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，当前售票" + --tickets);
                }else {
                    break;
                }
                }
            }
    }
}