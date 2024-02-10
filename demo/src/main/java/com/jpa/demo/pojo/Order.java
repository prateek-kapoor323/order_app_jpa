
package com.jpa.demo.pojo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order_details")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="customer_name")
    private String customerName;
    
    @Column(name="pizza_type")
    private String pizzaType;
    
    @Column(name="price")
    private Double pizzaPrice;
    
    @Column(name="order_status")
    private String orderStatus;

    @CreationTimestamp
    @Column(name = "ordered_on", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public Double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(Double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Order(Integer id, String customerName, String pizzaType, Double pizzaPrice, String orderStatus,
	    LocalDateTime createdAt) {
	super();
	this.id = id;
	this.customerName = customerName;
	this.pizzaType = pizzaType;
	this.pizzaPrice = pizzaPrice;
	this.orderStatus = orderStatus;
	this.createdAt = createdAt;
    }

    public Order() {
	super();
	// TODO Auto-generated constructor stub
    }

    
    
    
}
