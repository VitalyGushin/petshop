package com.delivery.dao;

import com.delivery.entity.Order;

import java.util.Date;
import java.util.List;

public interface OrderDao {

    void save(Order order);

    Order GetById(int id);

    void postpone(int id);

    void delivere(int id);

    void update(Order order);

    void delete(int id);

    List<Order> findAll();

    List<Order> findUndelivered();

    List<Order> findPostponed();

}
