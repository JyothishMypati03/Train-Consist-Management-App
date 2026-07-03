package com.bridgelabz.trainconsist.app;

import java.util.ArrayList;
import java.util.List;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        // Initialize an empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display the initial state
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial Bogie Count : " + trainConsist.size());

    }


}
