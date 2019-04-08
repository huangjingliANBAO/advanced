package week1;

/**
 * 多线程起步扩展训练
 * @author 黄敬理
 * 2019.04.08
 */
public class Admission {
    public static void main(String[] args) {
        System.out.println("a b队分别入场");
        A a = new A();
        a.start();
        B b = new B();
        b.start();
    }
    static class A extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <= 11; i++){
                System.out.print("a" + i + "  ");
            }
        }
    }
    static class B extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <= 11; i++){
                System.out.print("b" + i + "  ");
            }
        }
    }
}
