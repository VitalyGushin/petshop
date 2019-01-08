package com.delivery.dao;

import com.delivery.entity.Order;
import com.delivery.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.joda.DateTimeParser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class OrderDaoImpl implements OrderDao{

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public OrderDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Order order) {
        String sql = "INSERT INTO orders SET added=now(), deliver=?, customer=?, address=?, product=?, phone=?";
        jdbcTemplate.update(sql, order.getDeliver(), order.getCustomer(), order.getAddress(), order.getProduct(), order.getPhone());
    }

    @Override
    public Order GetById(int id) {
        String sql = "SELECT * FROM orders WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new OrderMapper(), id);
    }

    @Override
    public void postpone(int id) {
        String sql = "UPDATE orders SET status=1 WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void delivere(int id) {
        String sql = "UPDATE orders SET status=2 WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void update(Order order) {
        String sql = "UPDATE orders SET deliver=?, status=0 WHERE id=?";
        jdbcTemplate.update(sql, order.getDeliver(), order.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM orders WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<Order> findAll() {
        String sql = "SELECT * FROM orders ORDER BY deliver";
        return jdbcTemplate.query(sql,new OrderMapper());
    }

    @Override
    public List<Order> findUndelivered() {
        String sql = "SELECT * FROM orders WHERE status=0 ORDER BY deliver";
        return jdbcTemplate.query(sql,new OrderMapper());
    }

    @Override
    public List<Order> findPostponed() {
        String sql = "SELECT * FROM orders WHERE status=1 ORDER BY deliver";
        return jdbcTemplate.query(sql,new OrderMapper());
    }
}
