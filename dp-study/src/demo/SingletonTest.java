package demo;

/**
 * java设计模式HelloWorld程序
 * @author 黄敬理
 * 2019.05.20
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        object.showMessage();
    }
}