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
        bogies.add(new Bogie("Cargo", "Goods", 100));
        bogies.add(new Bogie("Oil Tanker", "Goods", 80));

        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + " Bogies:");
            for (Bogie bogie : entry.getValue()) {
                System.out.println(bogie);
            }
        }


    }


}
