package com.esubalew;

/**
 * Created by Esubalew on 23/04/17.
 */

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colors;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }
        else {

            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
