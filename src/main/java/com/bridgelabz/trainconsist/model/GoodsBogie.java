package com.bridgelabz.trainconsist.model;

import com.bridgelabz.trainconsist.exception.CargoSafetyException;

public class GoodsBogie {

    private String type;
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {

        if (type.equalsIgnoreCase("Rectangular")
                && cargo.equalsIgnoreCase("Petroleum")) {

            throw new CargoSafetyException(
                    "Petroleum cannot be assigned to a Rectangular Bogie.");
        }

        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "GoodsBogie{" +
                "type='" + type + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }

}
