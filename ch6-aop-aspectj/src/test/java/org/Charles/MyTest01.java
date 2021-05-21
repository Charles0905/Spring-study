package org.Charles;

import org.Charles.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Charles
 * @date 2021-05-13 19:12
 */
public class MyTest01 {
    @Test
    public void test01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService proxy = (SomeService) ctx.getBean("SomeService");

        // 通过代理的对象执行方法，实现目标方法执行时，增强了功能
        proxy.doSome("John", 25);
    }
}
