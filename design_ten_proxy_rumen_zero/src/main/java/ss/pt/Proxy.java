package ss.pt;
//代理类。一个代理类可以代理多个被委托者或被代理者，因此一个代理类具体代理哪个真实主题角色，是由场景类决定的。
public class Proxy extends Subject {

    private RealSubject realSubject = null;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void request() {
        this.before();
        this.realSubject.request();
        this.after();
    }

    //预处理
    private void before() {
        System.out.println("-------before------");
    }

    //善后处理
    private void after() {
        System.out.println("-------after-------");
    }
}