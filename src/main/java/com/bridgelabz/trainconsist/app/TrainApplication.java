package com.bridgelabz.trainconsist.app;
import java.util.*;

public class TrainApplication {

    public static  void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        String[] bogieIds = {
                "BG450",
                "BG101",
                "BG512",
                "BG205",
                "BG309"
        };

        // Binary Search needs sorted data
        Arrays.sort(bogieIds);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to Search: ");
        String searchKey = scanner.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int result = searchKey.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                System.out.println("\nBogie Found at Index : " + mid);
                break;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("\nBogie ID Not Found.");
        }

    }
}
