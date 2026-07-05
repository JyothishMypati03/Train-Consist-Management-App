package com.bridgelabz.trainconsist.app;
import com.bridgelabz.trainconsist.exception.CargoSafetyException;
import com.bridgelabz.trainconsist.model.GoodsBogie;

import java.util.*;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        GoodsBogie goodsBogie = new GoodsBogie("Rectangular");

        try {

            System.out.println("\nAssigning Cargo...");
            goodsBogie.assignCargo("Petroleum");

            System.out.println(goodsBogie);

        } catch (CargoSafetyException e) {

            System.out.println("Exception: " + e.getMessage());

        } finally {

            System.out.println("Cargo Assignment Process Completed.");

        }

        System.out.println("\nProgram Continues Safely...");
    }

}
