package pl.sda.javalondek4.java_demo.optional.java7;

import java.util.Optional;

public class ComputerUtils {
    private ComputerUtils() {
        throw new UnsupportedOperationException("This class shouldn't be instantiated!!!");
    }

    public static String getGraphicsCardModelFirstNaiveApproach(Computer computer) {
        return computer.getGraphicsCard().getModel();
    }

    public static String getGraphicsCardGoodApproach(Computer computer) {
//        Optional<String> optModel = Optional.ofNullable(computer.getGraphicsCard().getModel());
//        return optModel.orElseGet(() -> "no graphic card");
        String result = null;
        if (computer != null) {
            GraphicsCard graphicsCard = computer.getGraphicsCard();
            if (graphicsCard != null) {
                result = graphicsCard.getModel();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Computer withoutGraphicsCard = new Computer(null);
        Computer withUnknownModel = new Computer(new GraphicsCard(null));
        Computer personalComputer = new Computer(new GraphicsCard("nVidia RTX 380"));
        getGraphicsCardModelFirstNaiveApproach(withoutGraphicsCard);
        getGraphicsCardModelFirstNaiveApproach(withUnknownModel);
        getGraphicsCardModelFirstNaiveApproach(personalComputer);
    }
}