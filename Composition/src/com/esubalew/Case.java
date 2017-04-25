package com.esubalew;

import java.awt.*;

/**
 * Created by Esubalew on 25/04/17.
 */
public class Case {
    private String model;
    private String manufacturer;
    private String powerSupplly;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupplly, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupplly = powerSupplly;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button presses");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupplly() {
        return powerSupplly;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
