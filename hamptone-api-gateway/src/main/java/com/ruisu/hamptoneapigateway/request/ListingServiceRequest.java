package com.ruisu.hamptoneapigateway.request;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(
        value = "listing-service",
        path = "/api/listing",
        //url = "${listing.service.url}",
        configuration = FeignConfiguration.class
)
public interface ListingServiceRequest {
    @PostMapping
    Object saveListing(@RequestBody Object requestBody);

    @DeleteMapping("{listingId}")
    void deleteListing(@PathVariable("listingId") Long listingId);

    @GetMapping()
    List<Object> getAllListings();

}
