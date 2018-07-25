package com.example.demo.entity;

/**
 * @Author: 余锡鸿
 * @Description:
 * @Date: Create in 1:58 PM 7/25/2018
 * @Modified By:
 */
public class ParkLot {

    public int id;
    public int size;
    public int remain;
    public int parkingBoyId;

    public ParkLot() {
    }

    public ParkLot(int id, int size, int remain, int parkingBoyId) {
        this.id = id;
        this.size = size;
        this.remain = remain;
        this.parkingBoyId = parkingBoyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    public int getParkingBoyId() {
        return parkingBoyId;
    }

    public void setParkingBoyId(int parkingBoyId) {
        this.parkingBoyId = parkingBoyId;
    }

    @Override
    public String toString() {
        return "ParkLot{" +
                "id=" + id +
                ", size=" + size +
                ", remain=" + remain +
                ", parkingBoyId=" + parkingBoyId +
                '}';
    }
}
