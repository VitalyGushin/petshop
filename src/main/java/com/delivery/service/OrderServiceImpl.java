package com.delivery.service;

import com.delivery.dao.OrderDao;
import com.delivery.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    public OrderDao orderDao;

    @Override
    public void save(Order order) {
        orderDao.save(order);
    }

    @Override
    public Order GetById(int id) {
        return orderDao.GetById(id);
    }

    @Override
    public void postpone(int id) {
        orderDao.postpone(id);
    }

    @Override
    public void delivere(int id) {
        orderDao.delivere(id);
    }

    @Override
    public void update(Order order) {
        orderDao.update(order);
    }

    @Override
    public void delete(int id) {
        orderDao.delete(id);
    }

    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    @Override
    public List<Order> findUndelivered() {
        return orderDao.findUndelivered();
    }

    @Override
    public List<Order> findPostponed() {
        return orderDao.findPostponed();
    }
}
