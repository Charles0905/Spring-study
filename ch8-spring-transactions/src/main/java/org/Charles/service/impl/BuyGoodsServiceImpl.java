package org.Charles.service.impl;

import org.Charles.dao.GoodsDao;
import org.Charles.dao.SaleDao;
import org.Charles.domain.Goods;
import org.Charles.domain.Sale;
import org.Charles.excep.NotEnoughException;
import org.Charles.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Charles
 * @date 2021-05-17 18:31
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }


    @Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NullPointerException.class,
                    NotEnoughException.class
            }
    )
    @Override
    public void buy(Integer goodsId, Integer nums) {
        // Record Sale info, add to sale table
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setSaleAmt(nums);
        saleDao.insertSale(sale);

        // Update storage
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null) {
            //No such goods
            throw new NullPointerException("No such goods with id " + goodsId);
        }
        else if (goods.getAmount() < nums) {
            throw new NotEnoughException("The product with id "+goodsId+" is out of stock");
        }
        // Update storage
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        int num = goodsDao.updateGoods(buyGoods);
        System.out.println(num == 1 ? "Purchase Successes" : "Purchase Fails");
    }
}
