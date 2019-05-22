package demo.demo2;

public class Proxy implements Subiect {
    @Override
    public void buyMac() {
        RealSubiect realSubiect = new RealSubiect();
        realSubiect.buyMac();
        this.WrapMac();
    }
    public void WrapMac(){
        System.out.println("用盒子包装好Mac");
    }
}
