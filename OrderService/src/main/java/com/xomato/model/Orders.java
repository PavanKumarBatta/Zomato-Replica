package com.xomato.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;   // FK → users.user_id

    @Column(name = "restaurant_id", nullable = false)
    private Integer restaurantId;  // FK → restaurants.restaurant_id

    @Column(name = "total_price", nullable = false)
    private Double totalPrice;

    @Column(nullable = false)
    private String status;   // CREATED, CONFIRMED, PREPARING...

    @Column(name = "payment_status", nullable = false)
    private String paymentStatus;  // PENDING, SUCCESS, FAILED

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
}
