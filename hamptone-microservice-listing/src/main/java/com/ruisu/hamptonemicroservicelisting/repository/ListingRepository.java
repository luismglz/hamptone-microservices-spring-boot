package com.ruisu.hamptonemicroservicelisting.repository;
import com.ruisu.hamptonemicroservicelisting.model.Listing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListingRepository extends JpaRepository<Listing, Long> {


}
