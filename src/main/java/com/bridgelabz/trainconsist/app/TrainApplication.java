package com.bridgelabz.trainconsist.app;
import java.util.*;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        int[] capacities = {72, 48, 24, 56, 90};

        System.out.println("\nBefore Sorting:");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        // Bubble Sort
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nAfter Sorting:");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }
    }

}
