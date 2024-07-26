package com.pedromarzig.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedromarzig.demo.entitties.OrderItem;
import com.pedromarzig.demo.entitties.pk.OrderItemPK;



public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}