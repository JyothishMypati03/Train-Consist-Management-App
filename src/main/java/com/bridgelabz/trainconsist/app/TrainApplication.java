package com.bridgelabz.trainconsist.app;
import com.bridgelabz.trainconsist.exception.InvalidBogieException;
import com.bridgelabz.trainconsist.model.Bogie;
import com.bridgelabz.trainconsist.model.PassengerBogie;

import java.util.*;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        try {

            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println(sleeper);

            PassengerBogie acChair = new PassengerBogie("AC Chair", 48);
            System.out.println(acChair);

            // Invalid Capacity
            PassengerBogie firstClass = new PassengerBogie("First Class", 0);
            System.out.println(firstClass);

        } catch (InvalidBogieException e) {

            System.out.println("\nException: " + e.getMessage());

        }

        System.out.println("\nProgram Continues Safely...");
    }

}
