package com.ruisu.hamptonemicroservicepurchase.service;

import com.ruisu.hamptonemicroservicepurchase.model.Purchase;

import java.util.List;

public interface PurchaseService {

    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}
