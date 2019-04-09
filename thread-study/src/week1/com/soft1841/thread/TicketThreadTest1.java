package week1.com.soft1841.thread;

/**
 * 多线程售票程序1
 * 继承Thread类方式实现
 * @author 黄敬理
 *2019.04.09
 */
public class TicketThreadTest1 {
    public static void main(String[] args) {
        TicketThead1 tt1 = new TicketThead1();
        tt1.start();
        TicketThead1 tt2 = new TicketThead1();
        tt2.start();
        TicketThead1 tt3 = new TicketThead1();
        tt3.start();
        /**
         * 数据无法共享
         */
    }
}
class TicketThead1 extends Thread{
    private int tickets = 10;

    @Override
    public void run() {
        while(tickets > 0){
            System.out.println(Thread.currentThread().getName() + "售票，当前售票：" +--tickets);//先减
        }
    }
}
