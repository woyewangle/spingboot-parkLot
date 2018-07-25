package com.example.demo.controller;

import com.example.demo.entity.ParkLot;
import com.example.demo.service.ParkLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 2:01 PM 7/25/2018
 * @Modified By:
 */
@RestController
public class ParkLotController {
    @Autowired
    public ParkLotService parkLotSerivce;

    @GetMapping("/parkLots")
    public List getParkLots(){
        return parkLotSerivce.getParkLots();
    }

    @GetMapping("/parkLots/{id}")
    public ParkLot find(@PathVariable int id){
        return parkLotSerivce.find(id);
    }

    @PostMapping("/parkLots")
    public ParkLot add(@RequestBody ParkLot parkLot){
        return parkLotSerivce.add(parkLot);
    }

    @PutMapping("/parkLots/{id}")
    public ParkLot update(@RequestBody ParkLot parkLot,@PathVariable int id){
        return parkLotSerivce.update(parkLot,id);
    }

    @DeleteMapping("parkLots/{id}")
    public void delete(@PathVariable int id){
         parkLotSerivce.delete(id);
    }

}
