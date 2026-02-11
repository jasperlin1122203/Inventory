package com.inventory.controller;

import com.inventory.model.InventoryItem;
import com.inventory.service.InventoryManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryManager inventoryManager;

    @GetMapping("/{sku}")
    public ResponseEntity<InventoryItem> getInventory(@PathVariable String sku) {
        // TODO: Get inventory by SKU
        // Call inventoryManager.getInventory(sku)
        // If item exists: return ResponseEntity.ok(item)
        // If item not found: return ResponseEntity.notFound()
        throw new UnsupportedOperationException("TODO: Implement getInventory");
    }

    @PostMapping("/initialize")
    public ResponseEntity<String> initializeInventory(
            @RequestParam String sku,
            @RequestParam int quantity,
            @RequestParam(required = false, defaultValue = "AMBIENT") String temperatureZone) {
        // TODO: Initialize inventory
        // Call inventoryManager.initializeInventory(sku, quantity, temperatureZone)
        // Return ResponseEntity with success message
        throw new UnsupportedOperationException("TODO: Implement initializeInventory");
    }
}
