package com.bridgelabz.trainconsist.app;
import java.util.*;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "Cargo",
                "Guard"
        };

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogieNames));
    }

}
