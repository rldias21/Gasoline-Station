package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Refueling {

    private Long id;
    private FuelPump fuelPump;
    private BigDecimal liters;
    private BigDecimal totalValue;
    private LocalDateTime dateTime;
    private String customerName;


    public Refueling() {
    }

    public Refueling(FuelPump fuelPump, BigDecimal liters) {
        this.fuelPump = fuelPump;
        this.liters = liters;
        this.dateTime = LocalDateTime.now();
        this.totalValue = fuelPump.getFuelType().calculatePrice(liters);
    }

    public Refueling(Long id, FuelPump fuelPump, BigDecimal liters, String customerName) {
        this.id = id;
        this.liters = liters;
        this.fuelPump = fuelPump;
        this.customerName = customerName;
        this.dateTime = LocalDateTime.now();
        this.totalValue = fuelPump.getFuelType().calculatePrice(liters);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FuelPump getFuelPump() {
        return fuelPump;
    }

    public void setFuelPump(FuelPump fuelPump) {
        this.fuelPump = fuelPump;
    }

    public BigDecimal getLiters() {
        return liters;
    }

    public void setLiters(BigDecimal liters) {
        this.liters = liters;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Refueling{" +
                "id=" + id +
                ", fuelPump=" + fuelPump +
                ", liters=" + liters +
                ", totalValue=" + totalValue +
                ", dateTime=" + dateTime +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
