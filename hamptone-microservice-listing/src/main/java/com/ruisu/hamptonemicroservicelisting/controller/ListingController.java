package com.ruisu.hamptonemicroservicelisting.controller;

import com.ruisu.hamptonemicroservicelisting.model.Listing;
import com.ruisu.hamptonemicroservicelisting.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/listing")
public class ListingController {
    @Autowired
    private ListingService listingService;

    @PostMapping
    public ResponseEntity<?> saveListing(@RequestBody Listing listing){
        try {
            return new ResponseEntity<>(listingService.saveListing(listing), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("{listingId}")
    public ResponseEntity<?> deleteListing(@PathVariable Long listingId){
        try {
            listingService.deleteListing((listingId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping
    public ResponseEntity<?> getAllListings(){
        try {
            return ResponseEntity.ok(listingService.findAllListings());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
