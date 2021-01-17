package pl.sda.javalondek4.java_demo.lambda.calculator;
@FunctionalInterface
public interface MyAdder {

    long addWithComment( long a, long b , String comment);
}
