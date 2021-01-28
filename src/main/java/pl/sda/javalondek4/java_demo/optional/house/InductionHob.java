package pl.sda.javalondek4.java_demo.optional.house;

import java.util.Optional;

public class InductionHob {

    private HobDisplay hobDisplay;


    public InductionHob(HobDisplay hobDisplay) {
        this.hobDisplay = hobDisplay;
    }

    public Optional<HobDisplay> getHobDisplay() {
        return Optional.ofNullable(hobDisplay);
    }

    public void setHobDisplay(HobDisplay hobDisplay) {
        this.hobDisplay = hobDisplay;
    }

    @Override
    public String toString() {
        return "InductionHob{" +
                "hobDisplay=" + hobDisplay +
                '}';
    }
}
