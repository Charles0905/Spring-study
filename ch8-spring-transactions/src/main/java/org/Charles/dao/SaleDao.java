package org.Charles.dao;

import org.Charles.domain.Sale;

/**
 * @author Charles
 * @date 2021-05-17 18:13
 */
public interface SaleDao {
    // Insert Sale record
   int insertSale(Sale sale);
}
