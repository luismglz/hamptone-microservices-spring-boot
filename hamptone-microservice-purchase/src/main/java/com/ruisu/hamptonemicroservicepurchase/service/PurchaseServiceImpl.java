package com.ruisu.hamptonemicroservicepurchase.service;

import com.ruisu.hamptonemicroservicepurchase.model.Purchase;
import com.ruisu.hamptonemicroservicepurchase.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase){
        purchase.setPurchasedAt(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<Purchase> findAllPurchasesOfUser(Long userId){
        return purchaseRepository.findAllByUserId(userId);
    }

}
