package pl.sda.javalondek4.java_demo.optional.house;

import java.util.Optional;

public class House {

    private Kitchen kitchen;

    public House(Kitchen kitchen) {
        this.kitchen = kitchen;
    }


    public Optional <Kitchen> getKitchen() {
        return Optional.ofNullable(kitchen);
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public String toString() {
        return "House{" +
                "kitchen=" + kitchen +
                '}';
    }
}
