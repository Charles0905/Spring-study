package org.Charles.ba01;

/**
 * @author Charles
 * @date 2021-05-13 18:43
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        // give doSome some functions. Show time before execute it
        System.out.println("doSome() executed!");
    }
}
