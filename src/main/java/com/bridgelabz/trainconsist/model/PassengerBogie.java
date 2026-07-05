package com.bridgelabz.trainconsist.model;

import com.bridgelabz.trainconsist.exception.InvalidBogieException;

public class PassengerBogie {
    private String name;
    private int capacity;

    public PassengerBogie(String name, int capacity) throws InvalidBogieException {

        if (capacity <= 0) {
            throw new InvalidBogieException("Invalid Bogie Capacity! Capacity must be greater than zero.");
        }

        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "PassengerBogie{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

}
