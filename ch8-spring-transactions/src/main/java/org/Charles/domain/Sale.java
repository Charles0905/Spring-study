package org.Charles.domain;

/**
 * @author Charles
 * @date 2021-05-17 18:10
 */
public class Sale {
    private Integer id;
    private Integer gid;
    private Integer saleAmt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(Integer saleAmt) {
        this.saleAmt = saleAmt;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", gid=" + gid +
                ", saleAmt=" + saleAmt +
                '}';
    }
}
