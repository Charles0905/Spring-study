package org.Charles;

import org.Charles.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Charles
 * @date 2021-05-17 18:45
 */
public class MyTest {

    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        BuyGoodsService service = (BuyGoodsService) ctx.getBean("buyService");

        // Call function
        service.buy(1001, 10);
    }
}
