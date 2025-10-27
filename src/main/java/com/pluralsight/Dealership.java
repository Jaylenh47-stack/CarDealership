package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.inventory = new ArrayList<>();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        //add vehicles within price range to an array list
       ArrayList<Vehicle> priceMatchVehicles = new ArrayList<>();
        for(Vehicle v : this.inventory) {
            if (min <= v.getPrice() && max > v.getPrice()) {
                priceMatchVehicles.add(v);
            }
        }

        return priceMatchVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> makeModelMatchVehicles = new ArrayList<>();
        for (Vehicle v : this.inventory){
            if (make.equalsIgnoreCase(v.getMake()) && model.equalsIgnoreCase(v.getModel())){
                makeModelMatchVehicles.add(v);
            }
        }

        return makeModelMatchVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        ArrayList<Vehicle> yearMatchVehicles = new ArrayList<>();

        for (Vehicle v: this.inventory){
            if (min < v.getYear() && max > v.getYear()){
                yearMatchVehicles.add(v);
            }
        }
        return yearMatchVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> colorMatchVehicles = new ArrayList<>();

        for (Vehicle v: this.inventory){
            if (color.equalsIgnoreCase(v.getColor())){
                colorMatchVehicles.add(v);
            }
        }
        return colorMatchVehicles;



    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        ArrayList<Vehicle> mileageMatchVehicles = new ArrayList<>();

        for (Vehicle v: this.inventory){
            if (min < v.getOdometer() && max > v.getOdometer()){
                mileageMatchVehicles.add(v);
            }
        }
        return mileageMatchVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return this.inventory;
    }

    public void addVehicle(Vehicle v){
        inventory.add(v);
    }

    public void removeVehicle(Vehicle v){

    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
