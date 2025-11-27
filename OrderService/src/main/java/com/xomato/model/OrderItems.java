package com.xomato.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "order_items")
public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Integer orderItemId;

    @Column(name = "order_id", nullable = false)
    private Integer orderId;   // FK → orders.order_id

    @Column(name = "menu_item_id", nullable = false)
    private Integer menuItemId; // FK → menu_items.menu_item_id

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Double price;  // price per item at time of order
}
