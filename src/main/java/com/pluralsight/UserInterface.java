package com.pluralsight;

import java.util.ArrayList;

public class UserInterface {
    private Dealership dealership;

    private void init(){
        //Create dealership from DealershipFileManager
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealership = dealershipFileManager.getDealership();

    }

    public UserInterface() {
        init();
    }

    public int displayMenu(){
        int userInput = ConsoleHelper.promptForInt("""
                Dealership
                --------------
                1) Search By Price
                2) Search By Make And Model
                3) Search By Year
                4) Search By Color
                5) Search By Mileage
                6) Search By Vehicle Type
                7) Display All Vehicles
                8) Add Vehicle
                9) Remove Vehicle
                0) Exit
                """);

        return userInput;
    }

    //call displayMenu, read user input and call corresponding method
    public void display(){
        //while loop
        while(true) {
            switch (displayMenu()) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid input, please enter a whole number 0-9");
            }
        }
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles){
        for (Vehicle v : vehicles){
            System.out.println(v);
        }
    }

    public void processGetByPriceRequest(){
        double minPrice = ConsoleHelper.promptForDouble("Minimum price of Vehicle");
        double maxPrice = ConsoleHelper.promptForDouble("Maximum price of Vehicle");
        displayVehicles(dealership.getVehiclesByPrice(minPrice, maxPrice));
        //for (Vehicle v : dealership.getVehiclesByPrice(minPrice, maxPrice)) {
           // System.out.println(v);
           // System.out.println(this.dealership.getVehiclesByPrice(minPrice, maxPrice));
        //}

    }

    public void processGetByMakeModelRequest(){
        String make = ConsoleHelper.promptForString("Enter the make of the vehicle");
        String model = ConsoleHelper.promptForString("Enter the model of the vehicle");
        for (Vehicle v : dealership.getVehiclesByMakeModel(make, model)){
            System.out.println(v);
        }
    }

    public void processGetByYearRequest(){
        int minYear = ConsoleHelper.promptForInt("Enter the earliest year of the vehicles you want to see");
        int maxYear = ConsoleHelper.promptForInt("Enter the latest year of the vehicles you want to see");
        for (Vehicle v : dealership.getVehiclesByYear(minYear, maxYear)){
            System.out.println(v);
        }


    }

    public void processGetByColorRequest(){
        String color = ConsoleHelper.promptForString("Enter the color of the vehicle you want to see");
        for (Vehicle v : dealership.getVehiclesByColor(color)){
            System.out.println(v);
        }
    }

    public void processGetByMileageRequest(){
        int minMileage = ConsoleHelper.promptForInt("Enter the minimum miles of the vehicles you want to see ");
        int maxMileage = ConsoleHelper.promptForInt("Enter the maximum miles of the vehicles you want to see ");
        for (Vehicle v : dealership.getVehiclesByYear(minMileage, maxMileage)) {
            System.out.println(v);
        }
    }

    public void processGetByVehicleTypeRequest(){

    }

    public void processGetAllVehiclesRequest(){

        for (Vehicle v: this.dealership.getAllVehicles()){
            System.out.println(v);
        }


    }

    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){

    }







}
