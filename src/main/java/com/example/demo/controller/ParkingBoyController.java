package com.example.demo.controller;

import com.example.demo.entity.ParkLot;
import com.example.demo.entity.ParkingBoy;
import com.example.demo.service.ParkingBoyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 2:00 PM 7/25/2018
 * @Modified By:
 */
@RestController
public class ParkingBoyController {

    @Autowired
    public ParkingBoyService parkingBoyService;

    @GetMapping("/parkingBoys")
    public List getparkingBoys(){
        return parkingBoyService.getParkingBoys();
    }

    @GetMapping("/parkingBoys/{id}")
    public ParkingBoy find(@PathVariable int id){
        return parkingBoyService.find(id);
    }

    @PostMapping("/parkingBoys")
    public ParkingBoy add(@RequestBody ParkingBoy parkingBoy){
        return parkingBoyService.add(parkingBoy);
    }

    @PutMapping("/parkingBoys/{id}")
    public ParkingBoy update(@RequestBody ParkingBoy parkingBoy,@PathVariable int id){
        return parkingBoyService.update(parkingBoy,id);
    }

    @DeleteMapping("parkingBoys/{id}")
    public void delete(@PathVariable int id){
        parkingBoyService.delete(id);
    }


}
