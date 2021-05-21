package org.Charles.service.service.impl;

import org.Charles.service.service.SomeService;

/**
 * @author Charles
 * @date 2021-05-11 17:10
 */
public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl is being created");
    }

    @Override
    public void doSome() {
        System.out.println("Process executed");
    }
}
