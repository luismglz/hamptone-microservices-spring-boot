package com.ruisu.hamptonemicroservicepurchase.controller;

import com.ruisu.hamptonemicroservicepurchase.model.Purchase;
import com.ruisu.hamptonemicroservicepurchase.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase) {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }
    
    @GetMapping("{userId}")
    public ResponseEntity<?> getAllPurchasesOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(purchaseService.findAllPurchasesOfUser(userId));
    }
}
