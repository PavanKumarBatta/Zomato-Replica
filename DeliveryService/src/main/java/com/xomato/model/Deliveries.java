package com.xomato.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "deliveries")
public class Deliveries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private Integer deliveryId;

    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    @Column(name = "rider_id", nullable = false)
    private Integer riderId;   // FK → users.user_id (role = RIDER)

    @Column(nullable = false)
    private String status;     // ASSIGNED, PICKED_UP, EN_ROUTE, DELIVERED

    @Column(name = "assigned_at", nullable = false)
    private LocalDateTime assignedAt = LocalDateTime.now();
}
