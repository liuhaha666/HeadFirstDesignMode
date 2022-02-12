package ss.pt;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Proxy;
import java.util.HashMap;

/*
*dt需要加到file project structure里的modules dependencies里面。
*  */
public class reflectwo{

    private static String jar = "lib/dt.jar";

    public static void main(String[] args) throws Exception {
        ReflexDemo.getJar(jar);
    }
}