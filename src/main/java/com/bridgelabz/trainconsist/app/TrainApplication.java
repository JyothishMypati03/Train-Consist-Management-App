package com.bridgelabz.trainconsist.app;


import com.bridgelabz.trainconsist.model.Bogie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        // Create a List of Bogie objects
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add passenger bogies
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 48));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");

        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }

        // Sort by capacity
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nAfter Sorting by Capacity:");

        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }


    }


}
