package com.bridgelabz.trainconsist.app;

import java.util.ArrayList;
import java.util.List;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        // Initialize an empty train consist
        List<String> passengerBogies = new ArrayList<>();

        // Display the initial state
        System.out.println("Train consist initialized successfully.");
        
        System.out.println("Initial Bogie Count : " + passengerBogies.size());

        // Add passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies After Adding:");
        System.out.println(passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger Bogies After Removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        boolean isPresent = passengerBogies.contains("Sleeper");

        System.out.println("\nIs Sleeper Present?");
        System.out.println(isPresent);

        System.out.println("\nFinal Passenger Train Consist:");
        System.out.println(passengerBogies);

    }


}
