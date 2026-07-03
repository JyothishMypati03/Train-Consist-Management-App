package com.bridgelabz.trainconsist.app;


import java.util.HashMap;
import java.util.Map;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        // Create a HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 48);
        bogieCapacity.put("First Class", 24);

        System.out.println("\nBogie Capacity Details:");

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            System.out.println("Bogie : " + entry.getKey());
            System.out.println("Capacity : " + entry.getValue());
            System.out.println();
        }


    }


}
