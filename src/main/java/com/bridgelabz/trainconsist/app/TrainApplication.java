package com.bridgelabz.trainconsist.app;
import java.util.*;

public class TrainApplication {

    public static  void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        List<String> bogieIds = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to Search: ");
        String searchId = scanner.nextLine();

        try {
            searchBogieId(bogieIds, searchId);
        } catch (IllegalStateException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        System.out.println("\nProgram Continues Safely...");
        scanner.close();
    }

    private static void searchBogieId(List<String> bogieIds, String searchId) {

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("No bogies available in the train consist.");
        }

        boolean found = false;

        for (String bogieId : bogieIds) {
            if (bogieId.equals(searchId)) {
                found = true;
                System.out.println("\nBogie Found: " + bogieId);
                break;
            }
        }

        if (!found) {
            System.out.println("\nBogie ID Not Found.");
        }
    }
}
