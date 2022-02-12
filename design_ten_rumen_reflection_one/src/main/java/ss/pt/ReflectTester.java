package ss.pt;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*
*

通过Object类中的getClass()方法获取对象的类型。
Class classType=object.getClass();
而Class类是Reflection API中的核心类，主要方法如下：
getName()：获得类的完整名字。 getFields()：获得类的public类型的属性。
getDeclaredFields()：获得类的所有属性。
getMethods()：获得类的public类型的方法。
getDeclaredMethods()：获得类的所有方法。
getMethod(String name, Class[] parameterTypes)：获得类的特定方法，name参数指定方法的名字，parameterTypes参数指定方法的参数类型。
getConstrutors()：获得类的public类型的构造方法。
getConstrutor(Class[] parameterTypes)：获得类的特定构造方法，parameterTypes参数指定构造方法的参数类型。
newInstance()：通过类的不带参数的构造方法创建这个类的一个对象。
* */
public class ReflectTester {

    public Object copy(Object object) throws Exception{
        //获得对象的类型
        Class classType=object.getClass();
        //getName()：获得类的完整名字
        System.out.println("Class:"+classType.getName());

        //通过默认构造方法创建一个新的对象
        //getFields()：获得类的public类型的属性。
        //getDeclaredFields()：获得类的所有属性。
        //newInstance()：通过类的不带参数的构造方法创建这个类的一个对象。
        //第二步，通过默认构造方法创建一个新的对象，
        //即先调用Class类的getConstructor()方法获得一个Constructor对象，
        //它代表默认的构造方法，然后调用Constructor对象的newInstance()方法构造一个实例。
        Object objectCopy=classType.getConstructor(new Class[]{}).newInstance(new Object[]{});

        //获得对象的所有属性
        //第三步，获得对象的所有属性，即通过Class类的getDeclaredFields()方法返回类的所有属性，
        // 包括public、protected、default和private访问级别的属性，
        Field fields[]=classType.getDeclaredFields();

        //第四步，获得每个属性相应的get/set方法，然后执行这些方法，把原来的对象属性拷贝到新的对象中。
        for(int i=0; i<fields.length;i++){
            Field field=fields[i];

            String fieldName=field.getName();
            //System.out.println("field name is");
            //System.out.println(fieldName);
            String firstLetter=fieldName.substring(0,1).toUpperCase();
            //获得和属性对应的getXXX()方法的名字
            String getMethodName="get"+firstLetter+fieldName.substring(1);
            //System.out.println("getMethodName");
            //System.out.println(getMethodName);
            //获得和属性对应的setXXX()方法的名字
            String setMethodName="set"+firstLetter+fieldName.substring(1);
            //System.out.println("setMethodName");
            //System.out.println(setMethodName);

            //获得和属性对应的getXXX()方法
            Method getMethod=classType.getMethod(getMethodName,new Class[]{});
            //System.out.println("getMethod");
            //System.out.println(getMethod);
            //获得和属性对应的setXXX()方法
            Method setMethod=classType.getMethod(setMethodName,new Class[]{field.getType()});
            //System.out.println("setMethod");
            //System.out.println(setMethod);
            //调用原对象的getXXX()方法
            //method.invoke(iBusiness, args) 相当于 iBusiness.method(args)
            //相当于object.getMethod(args)
            Object value=getMethod.invoke(object,new Object[]{});
            System.out.println(fieldName+":"+value);
            //调用拷贝对象的setXXX()方法
            //通过此打印可以看到。此处就是objectCopy调用相应的set方法。把相应的值set。
            //从而造成copy的效果.
            System.out.println("before copy");
            System.out.println(setMethod);
            setMethod.invoke(objectCopy,new Object[]{value});
            System.out.println(objectCopy);
        }
        return objectCopy;
    }

}