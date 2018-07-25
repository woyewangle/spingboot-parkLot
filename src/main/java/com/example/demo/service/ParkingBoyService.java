package com.example.demo.service;

import com.example.demo.DB.MemoryDB;
import com.example.demo.entity.ParkingBoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 2:30 PM 7/25/2018
 * @Modified By:
 */
@Service
public class ParkingBoyService {
    public final MemoryDB memoryDB;

    @Autowired
    public ParkingBoyService(MemoryDB memoryDB) {
        this.memoryDB = memoryDB;
    }

    public List getParkingBoys(){
        return memoryDB.getParkingBoys();
    }


    public ParkingBoy find(int id) {
        return memoryDB.getParkingBoys().stream().filter(e->e.getId()==id).collect(Collectors.toList()).get(0);
    }

    public ParkingBoy add(ParkingBoy parkingBoy) {
        memoryDB.getParkingBoys().add(parkingBoy);
        return parkingBoy;
    }

    public ParkingBoy update(ParkingBoy parkingBoy, int id) {
        List<ParkingBoy> ParkingBoys = memoryDB.getParkingBoys();
        ParkingBoy newParkingBoy = new ParkingBoy();
        for (ParkingBoy oldParkingBoy : ParkingBoys) {
            if (oldParkingBoy.getId() == id) {
                oldParkingBoy.setId(parkingBoy.getId());
                newParkingBoy = oldParkingBoy;
            }
        }
        return newParkingBoy;
    }

    public void delete(int id) {
        memoryDB.getParkingBoys().removeIf(parkLot -> parkLot.getId()==id);
    }
}
