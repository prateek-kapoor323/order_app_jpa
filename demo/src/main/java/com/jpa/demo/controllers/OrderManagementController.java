package com.jpa.demo.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.demo.pojo.Order;
import com.jpa.demo.service.OrderService;

@RestController
public class OrderManagementController 
{
    @Autowired
    private OrderService orderService;
    
    /**
     * 
     * @author Prateek Kapoor
     * @since 11-Feb-2024 
     * @package com.jpa.demo.controllers
     * @param order
     * @return
     * Order
     */
    @PostMapping("/createOrder")
    public Order postOrderDetails(@RequestBody Order order)
    {
	return orderService.saveOrderDetails(order);
    }
    
    /**
     * 
     * @author Prateek Kapoor
     * @since 11-Feb-2024 
     * @package com.jpa.demo.controllers
     * @param orderStatus
     * @return
     * Collection<Order>
     */
    @GetMapping("/getOrderDetailsByStatus/{orderStatus}")
    public Collection<Order> fetchOrderByStatus(@PathVariable String orderStatus)
    {
	return orderService.findByOrderStatus(orderStatus);
    }
    
    /**
     * 
     * @author Prateek Kapoor
     * @since 11-Feb-2024 
     * @package com.jpa.demo.controllers
     * @param orderId
     * @param orderStatus
     * @return
     * Order
     */
    @PutMapping("/updateOrderStatusById/{orderId}/{orderStatus}")
    public Order updateOrderStatusById(@PathVariable("orderId") int orderId, @PathVariable("orderStatus") String orderStatus)
    {
	return orderService.updateOrderStatus(orderId, orderStatus);
    }
    
    /**
     * 
     * @author Prateek Kapoor
     * @since 11-Feb-2024 
     * @package com.jpa.demo.controllers
     * @return
     * Collection<Order>
     */
    @GetMapping("/fetchAllOrders")
    public Collection<Order> getAllOrders()
    {
	return orderService.getAllOrders();
	
    }
}
