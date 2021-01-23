package pl.sda.javalondek4.java_demo.lambda;

public class TestWorkBalance implements WorkLifeBalance{


    @Override
    public void hardWork() {
        System.out.println("pracuje");
    }

    @Override
    public void sleep() {
        System.out.println("spi");
    }
}
