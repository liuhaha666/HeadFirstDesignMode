package ss.pt;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @ClassName: ReflexDemo
 * @Description: 通过反射获取类、属性及方法
 * @author adamjwh
 * @date 2018年5月28日
 *
 */
public class ReflexDemo {

    private static StringBuffer sBuffer;

    public static void getJar(String jar) throws Exception {
        try {
            File file = new File(jar);
            URL url = file.toURI().toURL();
            URLClassLoader classLoader = new URLClassLoader(new URL[] { url },
                    Thread.currentThread().getContextClassLoader());

            JarFile jarFile = new JarFile(jar);
            Enumeration<JarEntry> enumeration = jarFile.entries();
            JarEntry jarEntry;

            sBuffer = new StringBuffer();    //存数据

            while (enumeration.hasMoreElements()) {
                jarEntry = enumeration.nextElement();

                if (jarEntry.getName().indexOf("META-INF") < 0) {
                    String classFullName = jarEntry.getName();
                    if (classFullName.indexOf(".class") < 0) {
                        classFullName = classFullName.substring(0, classFullName.length() - 1);
                    } else {
                        // 去除后缀.class，获得类名
                        //classLoader.loadClass
                        //Class.forName
                        //此两步都可以加载类。所以把
                        //clazz.getDeclaredFields换成myClass.getDeclaredFields也行。
                        String className = classFullName.substring(0, classFullName.length() - 6).replace("/", ".");
                        Class<?> myClass = classLoader.loadClass(className);
                        sBuffer.append("类名\t：" + className);
                        System.out.println("类名\t：" + className);
                        //Class.forName：返回与给定的字符串名称相关联类或接口的Class对象。
                        //通过Class类的getDeclaredFields()方法返回类的所有属性
                        Class<?> clazz = Class.forName(className);
                        Field[] fields = clazz.getDeclaredFields();
                        for (Field field : fields) {
                            sBuffer.append("属性名\t：" + field.getName() + "\n");
                            System.out.println("属性名\t：" + field.getName());
                            sBuffer.append("-属性类型\t：" + field.getType() + "\n");
                            System.out.println("-属性类型\t：" + field.getType());
                        }

                        // 获得方法名
                        //getMethods()：获得类的public类型的方法。
                        Method[] methods = myClass.getMethods();
                        for (Method method : methods) {
                            if (method.toString().indexOf(className) > 0) {
                                sBuffer.append("方法名\t：" + method.toString().substring(method.toString().indexOf(className)) + "\n");
                                System.out.println("方法名\t：" + method.toString().substring(method.toString().indexOf(className)));
                            }
                        }
                        sBuffer.append("--------------------------------------------------------------------------------" + "\n");
                        System.out.println("--------------------------------------------------------------------------------");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sBuffer.append("End");
            System.out.println("End");

            WriteFile.write(sBuffer);    //写文件
        }
    }

}