package com.ruisu.hamptonemicroservicelisting.service;

import com.ruisu.hamptonemicroservicelisting.model.Listing;

import java.util.List;

public interface ListingService {
    Listing saveListing(Listing listing);

    void deleteListing(Long listingId);

    List<Listing> findAllListings();
}
