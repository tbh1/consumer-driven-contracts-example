package com.testing.cdc.producer.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by ted on 11/16/15.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement(
        name = "Vehicle"
)
@JsonRootName("vehicle")
public class Vehicle {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private String description;
    private int mileage;
    private double dollarValue;
    private double recommendedListingPrice;
    private boolean powerSteering;
    private boolean powerWindows;
    private boolean powerLocks;
    private String engineType;
    private String displacement;
    private String configuration;
    private boolean pendingSale;
    private boolean titleHasLean;
    private boolean manufactureWarranty;
    private boolean manualTransmission;
    private double amortizedValue;
    private double taxableValue;
    private double kbbValue;
    private boolean publicListing;

//    private boolean heatedSeats;
//
//    public boolean isHeatedSeats() {
//        return heatedSeats;
//    }
//
//    public void setHeatedSeats(boolean heatedSeats) {
//        this.heatedSeats = heatedSeats;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getDollarValue() {
        return dollarValue;
    }

    public void setDollarValue(double dollarValue) {
        this.dollarValue = dollarValue;
    }

    public double getRecommendedListingPrice() {
        return recommendedListingPrice;
    }

    public void setRecommendedListingPrice(double recommendedListingPrice) {
        this.recommendedListingPrice = recommendedListingPrice;
    }

    public boolean isPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    public boolean isPowerWindows() {
        return powerWindows;
    }

    public void setPowerWindows(boolean powerWindows) {
        this.powerWindows = powerWindows;
    }

    public boolean isPowerLocks() {
        return powerLocks;
    }

    public void setPowerLocks(boolean powerLocks) {
        this.powerLocks = powerLocks;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public boolean isPendingSale() {
        return pendingSale;
    }

    public void setPendingSale(boolean pendingSale) {
        this.pendingSale = pendingSale;
    }

    public boolean isTitleHasLean() {
        return titleHasLean;
    }

    public void setTitleHasLean(boolean titleHasLean) {
        this.titleHasLean = titleHasLean;
    }

    public boolean isManufactureWarranty() {
        return manufactureWarranty;
    }

    public void setManufactureWarranty(boolean manufactureWarranty) {
        this.manufactureWarranty = manufactureWarranty;
    }

    public boolean isManualTransmission() {
        return manualTransmission;
    }

    public void setManualTransmission(boolean manualTransmission) {
        this.manualTransmission = manualTransmission;
    }

    public double getAmortizedValue() {
        return amortizedValue;
    }

    public void setAmortizedValue(double amortizedValue) {
        this.amortizedValue = amortizedValue;
    }

    public double getTaxableValue() {
        return taxableValue;
    }

    public void setTaxableValue(double taxableValue) {
        this.taxableValue = taxableValue;
    }

    public double getKbbValue() {
        return kbbValue;
    }

    public void setKbbValue(double kbbValue) {
        this.kbbValue = kbbValue;
    }

    public boolean isPublicListing() {
        return publicListing;
    }

    public void setPublicListing(boolean publicListing) {
        this.publicListing = publicListing;
    }
}
