package com.bridgelabz.trainconsist.app;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        // Train ID Pattern
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");

        // Cargo Code Pattern
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // Read Train ID
        System.out.print("\nEnter Train ID : ");
        Scanner scanner = new Scanner(System.in);
        String trainId = scanner.nextLine();

        // Read Cargo Code
        System.out.print("Enter Cargo Code : ");
        String cargoCode = scanner.nextLine();

        // Create Matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Train ID is Valid.");
        } else {
            System.out.println("Train ID is Invalid.");
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is Valid.");
        } else {
            System.out.println("Cargo Code is Invalid.");
        }



    }


}
