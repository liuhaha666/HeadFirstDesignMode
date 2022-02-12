package ss.pt;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
*参考https://www.cnblogs.com/adamjwh/p/9102037.html
*代理模式初理解：相当于通过代理Proxy操作实际的类RealSubject
* */
public class proxynetone {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }

}