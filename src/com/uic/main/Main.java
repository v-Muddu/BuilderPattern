package com.uic.main;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        int batteryUnit = 0;
        boolean autoPilot = false;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Welcome to Tesla!");
        System.out.println("We're happy that you choose a car company that's trying to contribute towards the betterment of out environment by manufacturing vehicles that " +
                "are environmental friendly and smart");
        System.out.println("Please select a model that you'd like to purchase/book");
        System.out.println("Model 3");
        System.out.println("Model x");
        System.out.println("Model S");
        System.out.println("Roadster");
        String model = s1.nextLine();
        hm.put("model", model);
        System.out.println("Thank you for selecting "+model.toUpperCase().trim());
        System.out.println("Since the "+model+"'s production has just began, your booking number will be noted" +
                "and we will notify you when we get as estimate delivery date");
        System.out.println("But, we can promise you that we can deliver the vehicle by Summer 2019");
        System.out.println("Are you still interested in this model?");
        Scanner s2 = new Scanner(System.in);
        System.out.println("please select Y or N");
        String interested = s2.next();
        if(interested.toUpperCase().equals("Y") || interested.toUpperCase().equals("YES")){
            Scanner s4 = new Scanner(System.in);
            System.out.println("These are the available options");
            System.out.println("Red");
            System.out.println("White");
            System.out.println("Black");
            System.out.println("Silver");
            System.out.println("Blue");
            String color = s4.next();
            s4.nextLine();
            hm.put("Color", color);
            System.out.println("Oh, you choose "+color.toUpperCase().trim()+ ", that's a great choice!");
        }else{
            System.out.println("Are you in interested in any other models?");
            Scanner s3 = new Scanner(System.in);
            System.out.println("Please select Y or N");
            String otherModels = s3.next();
            if(otherModels.toUpperCase().equals("NO") || otherModels.toUpperCase().equals("N")){
                System.out.println("Thank you visiting Tesla, have a Great Day!");
                System.out.println("We hope to see you soon.");
                System.exit(0);
            }else{
                return;
            }
        }
        VehicleBuilder vehicleBuilder = new VehicleBuilder(hm.get("model"), hm.get("Color"));

        if(model.toUpperCase().equals(Models.MODEL3.toString())){
            System.out.println("Now, let's get onto the next step");
            System.out.println("Please, Choose which Battery Unit you'd like to have?");
            System.out.println("Base with 75D, or the top end with the 90D pack?");
            Scanner s5 = new Scanner(System.in);
            String batteryPack = s5.next();
            if(batteryPack.toUpperCase().equals("75D")){
                batteryUnit = 75;
                vehicleBuilder.setBatteryUnit(batteryUnit);
                System.out.println("Thank you for choosing the base version.");
            }else if(batteryPack.toUpperCase().equals("90D")){
                System.out.println("Thank you for choosing the higher end version.");
                batteryUnit = 90;
                vehicleBuilder.setBatteryUnit(batteryUnit);
            }
            System.out.println("Would you like to have the Auto pilot installed in your car?");
            System.out.println("Please type Y or N");
            Scanner s6 = new Scanner(System.in);
            String autopilotInput = s6.next();
            if(autopilotInput.toUpperCase().equals("YES") || autopilotInput.toUpperCase().equals("Y")){
                autoPilot = true;
                vehicleBuilder.setAutoPilot(autoPilot);
            }
        }

        if(model.toUpperCase().equals(Models.MODELS.toString()) || model.toUpperCase().equals(Models.MODELX.toString()) || model.toUpperCase() == Models.ROADSTER.toString()){
            System.out.println("Since you have selected the "+model+", Autopilot and Higher end version of the battery pack come as default");
            batteryUnit = 90;
            autoPilot = true;
            vehicleBuilder.setBatteryUnit(batteryUnit);
            vehicleBuilder.setAutoPilot(autoPilot);
        }
        Vehicle vehicle = vehicleBuilder.build();
        System.out.println("Thank you Booking your "+model+ "at Tesla");
        System.out.println("You'll receive a confirmation email shortly, and our customer support team will reach out to you soon");
        System.out.println("Your Booking Details: ");
        System.out.println("Model: "+vehicle.getModel());
        System.out.println("Color: "+vehicle.getColor());
        if(batteryUnit == 0){
            System.out.println("Battery Unit: "+ batteryUnit+"D");
        }else{
            System.out.println("Battery Unit: "+ batteryUnit+"D");
        }
        if(!autoPilot){
            System.out.println("AutoPilot Option: Not Selected");
        }else{
            System.out.println("AutoPilot Option: Selected");
        }
        System.out.println("Thank you, once again. We hope you'd enjoy your Ride.");
    }
}
