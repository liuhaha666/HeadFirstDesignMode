package ss.pt;
//　被代理的对象。实际对象
public class Business implements IBusiness {

    @Override
    public void doWork() {
        System.out.println("进行业务逻辑处理");
    }

}
