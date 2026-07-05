package com.bridgelabz.trainconsist.app;
import com.bridgelabz.trainconsist.model.Bogie;

import java.util.*;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 48));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Cargo", "Goods", 100));
        bogies.add(new Bogie("Oil Tanker", "Goods", 80));

        // -----------------------------
        // Loop-Based Filtering
        // -----------------------------
        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();

        for (Bogie bogie : bogies) {
            if (bogie.getCapacity() > 50) {
                loopResult.add(bogie);
            }
        }

        long loopEnd = System.nanoTime();

        // -----------------------------
        // Stream-Based Filtering
        // -----------------------------
        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.getCapacity() > 50)
                .toList();

        long streamEnd = System.nanoTime();

        // -----------------------------
        // Display Results
        // -----------------------------
        System.out.println("\nLoop-Based Filtering:");

        for (Bogie bogie : loopResult) {
            System.out.println(bogie);
        }

        System.out.println("\nStream-Based Filtering:");

        for (Bogie bogie : streamResult) {
            System.out.println(bogie);
        }

        // -----------------------------
        // Performance Comparison
        // -----------------------------
        System.out.println("\nPerformance Comparison");

        System.out.println("Loop Execution Time   : "
                + (loopEnd - loopStart) + " ns");

        System.out.println("Stream Execution Time : "
                + (streamEnd - streamStart) + " ns");
    }

}
