package com.czxy.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author haoannan 169650@qq.com
 * @date 2019/10/22
 * @infos
 */
@Table(name = "tbl_goods")
public class Goods {
    /*`goods_id` INT(10) NOT NULL AUTO_INCREMENT,
  `goods_name` VARCHAR(20) DEFAULT NULL,
  `goods_number` INT(10) DEFAULT NULL,
  `goods_price` DOUBLE DEFAULT NULL,
  `guarantee_period` DATE DEFAULT NULL COMMENT '保质期',
  `cid` VARCHAR(10) DEFAULT NULL COMMENT '所属分类ID',
  PRIMARY KEY (`goods_id`)*/
    @Id
    private Integer goods_id;
    private String goods_name;
    private Integer goods_number;
    private Double goods_price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date guarantee_period;
    private String cid;

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_number=" + goods_number +
                ", goods_price=" + goods_price +
                ", guarantee_period=" + guarantee_period +
                ", cid='" + cid + '\'' +
                '}';
    }

    public Goods(Integer goods_id, String goods_name, Integer goods_number, Double goods_price, Date guarantee_period, String cid) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_number = goods_number;
        this.goods_price = goods_price;
        this.guarantee_period = guarantee_period;
        this.cid = cid;
    }

    public Goods() {
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Integer getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(Integer goods_number) {
        this.goods_number = goods_number;
    }

    public Double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Double goods_price) {
        this.goods_price = goods_price;
    }

    public Date getGuarantee_period() {
        return guarantee_period;
    }

    public void setGuarantee_period(Date guarantee_period) {
        this.guarantee_period = guarantee_period;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
