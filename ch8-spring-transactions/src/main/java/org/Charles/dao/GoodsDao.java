package org.Charles.dao;

import org.Charles.domain.Goods;

/**
 * @author Charles
 * @date 2021-05-17 18:19
 */
public interface GoodsDao {
    //Update storage
    //goods represents the goods information, id and amount the user buy
    int updateGoods(Goods goods);

    // Query goods information
    Goods selectGoods(Integer id);
}
