package org.Charles.handler;

import org.Charles.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Charles
 * @date 2021-05-13 17:11
 */
public class MyInvocationHandler implements InvocationHandler {
    // 目标对象 -> SomeServiceImpl
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过代理对象执行方法时，会调用执行这个invoke（）
        Object res = null;
        String methodName = method.getName();
        if ("doSome".equals(methodName)) {
            ServiceTools.doLog();
            //执行目标类的方法，通过method实现
            res = method.invoke(target, args); // SomeServiceImpl.doOther(), doSome()
            ServiceTools.doTrans();
        } else {
            res = method.invoke(target, args); // SomeServiceImpl.doOther(), doSome()
        }

        // 目标方法执行结果
        return res;
    }
}
