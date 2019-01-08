package com.delivery.mapper;

import com.delivery.entity.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<Order> {

    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
        Order order = new Order();
        order.setId(rs.getInt("id"));
        order.setAdded(rs.getString("added").substring(0,19));
        order.setDeliver(rs.getString("deliver").substring(0,19));
        order.setCustomer(rs.getString("customer"));
        order.setAddress(rs.getString("address"));
        order.setProduct(rs.getString("product"));
        order.setPhone(rs.getString("phone"));
        order.setStatus(rs.getInt("status"));
        return order;
    }
}
