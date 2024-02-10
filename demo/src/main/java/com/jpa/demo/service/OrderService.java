/**
 * 
 */
package com.jpa.demo.service;

import java.util.Collection;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.demo.pojo.Order;
import com.jpa.demo.repository.OrderRepository;

@Service
public class OrderService
{
    @Autowired
    private OrderRepository orderRepository;
    
    /**
     * 
     * @author Prateek Kapoor
     * @since 11-Feb-2024 
     * @package com.jpa.demo.service
     * @param orderDetails
     * @return
     * Order
     */
    public Order saveOrderDetails(Order orderDetails)
    {
	return orderRepository.save(orderDetails);
    }
    
    /**
     * 
     * @author Prateek Kapoor
     * @since 11-Feb-2024 
     * @package com.jpa.demo.service
     * @param orderStatus
     * @return
     * Collection<Order>
     */
    public Collection<Order> findByOrderStatus(String orderStatus)
    {
	return orderRepository.findByOrderStatus(orderStatus);
    }
    
    /**
     * 
     * @author Prateek Kapoor
     * @since 11-Feb-2024 
     * @package com.jpa.demo.service
     * @param id
     * @param orderStatus
     * @return
     * Order
     */
    public Order updateOrderStatus(int id, String orderStatus)
    {
	Order order = orderRepository.findById(id).orElse(null);
	if(Objects.nonNull(order))
	{
	    order.setOrderStatus(orderStatus);
	    orderRepository.save(order);
	    return order;
	}
	else
	{
	    return null;
	}
    }

    /**
     * @author Prateek Kapoor
     * @since 11-Feb-2024 
     * @package com.jpa.demo.service
     * @return
     * Collection<Order>
     */
    public Collection<Order> getAllOrders() 
    {	
	return orderRepository.findAll();
    }
}
