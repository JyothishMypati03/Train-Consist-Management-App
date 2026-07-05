package com.bridgelabz.trainconsist.app;
import java.util.*;

public class TrainApplication {

    public static  void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG450",
                "BG512"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Bogie ID to Search: ");
        String searchId = scanner.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchId)) {
                found = true;
                System.out.println("\nBogie Found at Index : " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("\nBogie ID Not Found.");
        }
    }
}
