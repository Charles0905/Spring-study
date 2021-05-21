package org.Charles.util;

import java.util.Date;

/**
 * @author Charles
 * @date 2021-05-13 17:03
 */
public class ServiceTools {

    public static void doLog() {
        System.out.println("Time:" + new Date());
    }

    public static void doTrans() {
        System.out.println("Execute finished. The transaction submitted");
    }
}
