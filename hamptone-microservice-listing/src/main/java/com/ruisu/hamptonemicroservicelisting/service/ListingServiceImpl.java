package com.ruisu.hamptonemicroservicelisting.service;

import com.ctc.wstx.shaded.msv_core.driver.textui.Debug;
import com.ruisu.hamptonemicroservicelisting.model.Listing;
import com.ruisu.hamptonemicroservicelisting.repository.ListingRepository;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ListingServiceImpl implements ListingService {

    private final ListingRepository listingRepository;

    public ListingServiceImpl(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

    @Override
    public Listing saveListing(Listing listing) {
        listing.setCreatedAt(LocalDateTime.now());
        return listingRepository.save(listing);
    }

    @Override
    public void deleteListing(Long listingId) {
        listingRepository.deleteById(listingId);
    }

    @Override
    public List<Listing> findAllListings() {
        return listingRepository.findAll();
    }
}
