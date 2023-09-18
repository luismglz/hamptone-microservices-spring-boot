package com.ruisu.hamptoneapigateway.controller;

import com.ruisu.hamptoneapigateway.request.ListingServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gateway/listing")
public class ListingController {

    @Autowired
    private ListingServiceRequest listingServiceRequest;

    @PostMapping
    public ResponseEntity<?> saveListing(@RequestBody Object listing) {
        return new ResponseEntity<>(listingServiceRequest.saveListing(listing), HttpStatus.CREATED);
    }

    @DeleteMapping("{listingId}")
    public ResponseEntity<?> deleteListing(@PathVariable("listingId") Long listingId) {
        listingServiceRequest.deleteListing(listingId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<?> getAllListings() {
        return ResponseEntity.ok(listingServiceRequest.getAllListings());
    }
}
