package com.example.hotel_indi_project.Services;

import com.example.hotel_indi_project.UserPojo.CabPojo;
import com.example.hotel_indi_project.entity.Cab;

import java.util.List;


public interface CabService {
    String save_cab_record(CabPojo cabPojo);
    List<Cab> findAll();
    void deleteById(Integer id);
}
