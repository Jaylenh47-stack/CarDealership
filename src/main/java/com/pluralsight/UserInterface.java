package com.pluralsight;

import java.util.ArrayList;

public class UserInterface {
    private Dealership dealership;

    public void init(){
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

    public double processGetByPriceRequest(){
        return 0;
    }

    public String processGetByMakeModelRequest(){
        return "";
    }

    public int processGetByYearRequest(){
        return 0;
    }

    public String processGetByColorRequest(){
        return "";
    }

    public int processGetByMileageRequest(){
        return 0;
    }

    public double processGetByVehicleTypeRequest(){
        return 0;
    }

    public ArrayList<Vehicle> processGetAllVehiclesRequest(){
        return null;
    }

    public Vehicle processAddVehicleRequest(){
        return null;
    }

    public Vehicle processRemoveVehicleRequest(){
        return null;
    }







}
