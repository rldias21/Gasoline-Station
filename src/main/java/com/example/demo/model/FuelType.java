package com.example.demo.model;

import java.math.BigDecimal;

public class FuelType {

    private Long id;
    private String name;
    private BigDecimal pricePerLiter;
    private String description;

    public FuelType() {
    }

    public FuelType(Long id, String name, BigDecimal pricePerLiter) {
        this.id = id;
        this.name = name;
        this.pricePerLiter = pricePerLiter;
    }

    public FuelType(Long id, String name, BigDecimal pricePerLiter, String description) {
        this.id = id;
        this.name = name;
        this.pricePerLiter = pricePerLiter;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(BigDecimal pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal calculatePrice(BigDecimal liters) {
        return pricePerLiter.multiply(liters);
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pricePerLiter=" + pricePerLiter +
                ", description='" + description + '\'' +
                '}';
    }
}
