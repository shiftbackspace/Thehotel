package com.example.hotel_indi_project.repo;

import com.example.hotel_indi_project.entity.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface CabRepo extends JpaRepository<Cab,Integer> {

    Optional<Cab> findCabByFullname(String fullname);
}
