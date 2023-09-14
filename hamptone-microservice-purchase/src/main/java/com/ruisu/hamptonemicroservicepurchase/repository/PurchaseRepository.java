package com.ruisu.hamptonemicroservicepurchase.repository;

import com.ruisu.hamptonemicroservicepurchase.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
    List<Purchase> findAllByUserId(Long userId);

}
