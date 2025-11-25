package com.example.demo.model;

public class FuelPump {

    private Long id;
    private String code;
    private FuelType fuelType;
    private boolean active;

    public FuelPump() {
    }

    public FuelPump(Long id, String code, FuelType fuelType) {
        this.id = id;
        this.code = code;
        this.fuelType = fuelType;
        this.active = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


    @Override
    public String toString() {
        return "FuelPump{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", fuelType=" + fuelType +
                ", active=" + active +
                '}';
    }
}
