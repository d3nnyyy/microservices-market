package ua.dtsebulia.inventoryservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.dtsebulia.inventoryservice.dto.InventoryResponse;
import ua.dtsebulia.inventoryservice.service.InventoryService;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
