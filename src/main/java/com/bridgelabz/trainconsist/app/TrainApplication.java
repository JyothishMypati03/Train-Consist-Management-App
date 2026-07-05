package com.bridgelabz.trainconsist.app;
import com.bridgelabz.trainconsist.model.GoodsBogie;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainApplication {

    public static  void main(String[] args){

        System.out.println("======================================");
        System.out.println("   Train Consist Management App");
        System.out.println("======================================");

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Cement"));

        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie ->
                        !bogie.getType().equalsIgnoreCase("Cylindrical")
                                || bogie.getCargo().equalsIgnoreCase("Petroleum"));

        System.out.println("\nGoods Bogies:");

        goodsBogies.forEach(System.out::println);

        System.out.println();

        if (isSafe) {
            System.out.println("Train Safety Compliance : PASSED");
        } else {
            System.out.println("Train Safety Compliance : FAILED");
        }
    }

}
