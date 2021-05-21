package org.Charles.service;


/**
 * @author Charles
 * @date 2021-05-13 15:37
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("Execute doSome");
    }

    @Override
    public void doOther() {
        System.out.println("Execute doOther");
    }
}
