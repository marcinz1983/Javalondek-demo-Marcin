package pl.sda.javalondek4.java_demo.optional.java8;

public class Computer {

    private GraphicsCard graphicsCard;

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }


    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "graphicsCard=" + graphicsCard +
                '}';
    }
}
