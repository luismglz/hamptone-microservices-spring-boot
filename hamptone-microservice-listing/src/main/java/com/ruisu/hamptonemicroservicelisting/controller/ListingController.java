package com.ruisu.hamptonemicroservicelisting.controller;

import com.ruisu.hamptonemicroservicelisting.model.Listing;
import com.ruisu.hamptonemicroservicelisting.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/listing")
public class ListingController {
    @Autowired
    private ListingService listingService;

    @PostMapping
    public ResponseEntity<?> saveListing(@RequestBody Listing listing) {
        return new ResponseEntity<>(listingService.saveListing(listing), HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteListing(@RequestBody Long listingId) {
        listingService.deleteListing((listingId));
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<?> getAllListings() {
        try {
            return ResponseEntity.ok(listingService.findAllListings());
        } catch (Exception ex) {
            return ResponseEntity.badRequest().build();
        }

    }
}
