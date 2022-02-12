package ss.pt;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Proxy;
import java.util.HashMap;

/*
*从这个结果我们只能看到有人登陆了这个账号，他正在打怪升级，但并不知道是不是代练，这就是代理模式。
*  */
public class proxytesttwo {

    public static void main(String[] args) {
        //定义一个玩家
        IGamePlayer player = new GamePlayer("桐人");
        //定义一个代练
        IGamePlayer proxy = new GamePlayerProxy(player);

        //开始打游戏
        //登陆
        proxy.login("adam", "123456");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
    }
}