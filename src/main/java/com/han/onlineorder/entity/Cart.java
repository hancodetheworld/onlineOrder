package com.han.onlineorder.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Mysql 自增 随机生成id 自己不用做
    private int id;

    private double totalPrice;
    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<OrderItem> orderitemList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<OrderItem> getOrderitemList() {
        return orderitemList;
    }

    public void setOrderitemList(List<OrderItem> orderitemList) {
        this.orderitemList = orderitemList;
    }
}
