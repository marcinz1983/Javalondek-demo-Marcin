package pl.sda.javalondek4.java_demo.optional.house;

import java.util.Optional;

public class Kitchen {

    private InductionHob inductionHob;


    public Kitchen(InductionHob inductionHob) {
        this.inductionHob = inductionHob;
    }


    public Optional<InductionHob> getInductionHob() {
        return Optional.ofNullable(inductionHob);
    }

    public void setInductionHob(InductionHob inductionHob) {
        this.inductionHob = inductionHob;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "inductionHob=" + inductionHob +
                '}';
    }
}
