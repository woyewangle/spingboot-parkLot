package com.example.demo.service;

import com.example.demo.DB.MemoryDB;
import com.example.demo.entity.ParkLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 2:29 PM 7/25/2018
 * @Modified By:
 */
@Service
public class ParkLotService {
    public final MemoryDB memoryDB;

    @Autowired
    public ParkLotService(MemoryDB memoryDB) {
        this.memoryDB = memoryDB;
    }

    public List getParkLots(){
        return memoryDB.getParkLots();
    }


    public ParkLot find(int id) {
        return memoryDB.getParkLots().stream().filter(e->e.getId()==id).collect(Collectors.toList()).get(0);
    }

    public ParkLot add(ParkLot parkLot) {
        memoryDB.getParkLots().add(parkLot);
        return parkLot;
    }

    public ParkLot update(ParkLot parkLot, int id) {
        List<ParkLot> parkLots = memoryDB.getParkLots();
        ParkLot newParKLot = new ParkLot();
        for (ParkLot oldparkLot : parkLots) {
            if (oldparkLot.getId() == id) {
                oldparkLot.setSize(parkLot.getSize());
                oldparkLot.setRemain(parkLot.getRemain());
                oldparkLot.setParkingBoyId(parkLot.getParkingBoyId());
                newParKLot = oldparkLot;
            }
        }
        return newParKLot;
    }

    public void delete(int id) {
        memoryDB.getParkLots().removeIf(parkLot -> parkLot.getId()==id);
    }
}
