package com.ruisu.hamptonemicroservicelisting.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="listing")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "address", length = 150, nullable = false)
    private String address;

    @Column(name = "location", length = 150, nullable = false)
    private String location;

    @Column(name="image", length = 1200, nullable = true)
    private String image;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "size", nullable = false)
    private Double size;

    @Column(name = "is_rent", nullable = false)
    private Boolean isRent;

    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
