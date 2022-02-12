package ss.pt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
 * 其中 method.invoke(person, args) 相当于 person.method(args) 。
 * */
public class OwnerInvocationHandler implements InvocationHandler {
    Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws IllegalAccessException {
        System.out.println("in OwnerInvocationHandler invoke");
        System.out.println(method.getName());
        try {
            if (method.getName().startsWith("get")) {
                System.out.println("before get  and invoke");
                //method.invoke 初步理解相当于person.getName
                return method.invoke(person, args);
            } else if (method.getName().equals("setGeekRating")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                System.out.println("before set  and invoke");
                //method.invoke 初步理解相当于person.setInterests
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
