package ss.pt;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Proxy;
import java.util.HashMap;

/*
*动态代理
* 参考https://www.cnblogs.com/adamjwh/p/10907526.html
*
* 此处通过java.lang.reflect.Proxy类的newProxyInstance()方法来生成代理类对象，
* 它的完整定义如下：

public static Object
* newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) throws IllegalArgumentException
* 参数loader指定动态代理类的类加载器，参数interfaces指定动态代理类需要实现的所有接口，
* 参数handler指定与动态代理类相关联的InvocationHandler对象。
* 所以我们只需调用newProxyInstance()方法就可以某一个对象的代理对象了。
*（有关ClassLoader类加载器的内容这里就不再赘述了，
* 它的作用是将class文件加载到jvm虚拟机中去）。
*  */
public class dynamicproxy {

    public static void main(String[] args) {
        Business business = new Business();

        //生成代理类对象
        //BusinessHandler就是代理类
        IBusiness proxy = (IBusiness) Proxy.newProxyInstance(
                business.getClass().getClassLoader(),
                business.getClass().getInterfaces(),
                new BusinessHandler(business));

        proxy.doWork();
    }
}