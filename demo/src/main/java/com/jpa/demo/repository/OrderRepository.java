/**
 * 
 */
package com.jpa.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.jpa.demo.pojo.Order;


public interface OrderRepository extends JpaRepository<Order, Integer> 
{
    Collection<Order> findByOrderStatus(String orderStatus);
}
