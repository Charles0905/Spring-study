package org.Charles.service;

import org.Charles.handler.MyInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Charles
 * @date 2021-05-13 16:55
 */
public class myTest {
    public static void main(String[] args) {
//        SomeService service = new SomeServiceImpl();
//        service.doSome();
//        System.out.println("=============");
//        service.doOther();

        // 使用jdk的proxy创建代理对象
        // 创建目标对象
        SomeService target = new SomeServiceImpl();

        // 创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(target);

        // 使用proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);

        // 通过代理执行方法，会调用Handler中的invoke（）
        proxy.doSome();
        proxy.doOther();
    }
}
