package com.delivery.service;

import com.delivery.entity.Order;

import java.util.List;

public interface OrderService {

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
