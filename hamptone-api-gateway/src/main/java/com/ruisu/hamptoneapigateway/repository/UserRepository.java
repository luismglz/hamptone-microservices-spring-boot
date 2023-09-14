package com.ruisu.hamptoneapigateway.repository;

import com.ruisu.hamptoneapigateway.model.Role;
import com.ruisu.hamptoneapigateway.model.User;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    @Modifying
    @Query("UPDATE User set role = :role WHERE username = :username ")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}
