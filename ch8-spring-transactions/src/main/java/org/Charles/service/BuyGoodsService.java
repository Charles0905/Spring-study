package org.Charles.service;

/**
 * @author Charles
 * @date 2021-05-17 18:29
 */
public interface BuyGoodsService {
    /**
     * Buy method
     * @param goodsId
     * @param nums nums of buying
     */
    void buy(Integer goodsId, Integer nums);
}
