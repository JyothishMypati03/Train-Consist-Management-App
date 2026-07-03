package com.bridgelabz.trainconsist.app;


import java.util.LinkedHashSet;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        // Create a LinkedHashSet to store train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add a duplicate bogie
        trainFormation.add("Sleeper");

        // Display final train formation
        System.out.println("\nTrain Formation:");
        System.out.println(trainFormation);


    }


}
