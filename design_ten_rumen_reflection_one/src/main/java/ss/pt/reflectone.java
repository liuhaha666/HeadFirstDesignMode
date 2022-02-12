package ss.pt;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Proxy;
import java.util.HashMap;

/*
*从这个结果我们只能看到有人登陆了这个账号，他正在打怪升级，但并不知道是不是代练，这就是代理模式。
*  */
public class reflectone {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(10L);
        customer.setName("adam");
        customer.setAge(3);
        try {
            new ReflectTester().copy(customer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}