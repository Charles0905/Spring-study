package org.Charles.ba01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author Charles
 * @date 2021-05-13 18:45
 */

/**
 * @Aspect : 是指aspectJ框架中的注解
 *      作用L表示当前类是切面类
 *      切面类： 用来给业务方法增加功能的类
 *      位置： 在类定义的上面
 */

@Aspect
public class MyAspect {
    /**
     * 定义方法，方法是实现切面功能的
     * 要求：
     *  1. 公共方法 public
     *  2. 方法没有返回值
     *  3. 方法名称自定义
     *  4. 方法可以有参数，也可以没有参数
     *     如果有参数，参数不是自定义的，有几个参数类型可以使用
     */

    /**
     * @Before: 前置通知注解
     *  属性：value， 是切入点表达式，表示切面的功能执行的位置
     *  位置： 在方法的上面
     *  特点：
     *  1.在目标方法之前先执行的
     *  2.不会改变目标方法的执行结果
     *  3.不会影响目标方法的执行
     */
//    @Before(value = "execution(public void org.Charles.ba01.SomeServiceImpl.doSome(String, Integer))")
    @Before(value = "execution(* *..SomeServiceImpl.doSome(..))")
    public void myBefore() {
        // 就是你切面要执行的功能代码
        System.out.println("(Before) Executed Time is : " + new Date());
    }


}
