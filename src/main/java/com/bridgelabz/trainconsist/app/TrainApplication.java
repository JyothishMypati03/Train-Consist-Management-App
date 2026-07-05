package com.bridgelabz.trainconsist.app;


import com.bridgelabz.trainconsist.model.Bogie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        // Create a List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 48));
        bogies.add(new Bogie("First Class", "Passenger", 24));

        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\nPassenger Bogies:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        System.out.println("\nTotal Seating Capacity: " + totalSeats);


    }


}
