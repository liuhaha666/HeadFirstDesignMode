package ss.pt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/*
* BusinessHandler类实现类Invocation接口，它是方法调用接口，
* 声明了负责调用任意一个方法的invoke()方法，参数proxy指定动态代理类实例，
* 参数method指定被调用的方法，参数args指定向被调用方法传递的参数，
* 而invoke()方法的返回值表示被调用方法的返回值。
* 其中 method.invoke(iBusiness, args) 相当于 iBusiness.method(args) 。
* */
public class BusinessHandler implements InvocationHandler {

    private IBusiness iBusiness;

    public BusinessHandler(IBusiness iBusiness) {
        this.iBusiness = iBusiness;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        System.out.println("即将进行的操作");
        System.out.println(method.getName());
        method.invoke(iBusiness, args);
        System.out.println("after");
        return null;
    }

}