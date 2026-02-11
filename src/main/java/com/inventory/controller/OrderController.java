package com.inventory.controller;

import com.inventory.model.Order;
import com.inventory.service.OrderManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderManager orderManager;

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        // TODO: Get all orders
        // Call orderManager.getAllOrders()
        // Return ResponseEntity with order list
        throw new UnsupportedOperationException("TODO: Implement getAllOrders");
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrder(@PathVariable String orderId) {
        // TODO: Get order by orderId
        // Call orderManager.getOrder(orderId)
        // If order exists: return ResponseEntity.ok(order)
        // If order not found: return ResponseEntity.notFound()
        throw new UnsupportedOperationException("TODO: Implement getOrder");
    }
}
