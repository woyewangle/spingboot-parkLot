package com.example.demo;

import com.example.demo.entity.ParkLot;
import com.example.demo.entity.ParkingBoy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 2:20 PM 7/25/2018
 * @Modified By:
 */
@Component
public class MemoryDB {
    public ArrayList<ParkingBoy> parkingBoys=new ArrayList<>();
    public ArrayList<ParkLot> parkLots=new ArrayList<>();

    public MemoryDB() {
        //初始化

    }

    public ArrayList<ParkingBoy> getParkingBoys() {
        return parkingBoys;
    }

    public void setParkingBoys(ArrayList<ParkingBoy> parkingBoys) {
        this.parkingBoys = parkingBoys;
    }

    public ArrayList<ParkLot> getParkLots() {
        return parkLots;
    }

    public void setParkLots(ArrayList<ParkLot> parkLots) {
        this.parkLots = parkLots;
    }
}
