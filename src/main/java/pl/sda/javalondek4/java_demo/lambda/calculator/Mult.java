package pl.sda.javalondek4.java_demo.lambda.calculator;
@FunctionalInterface
public interface Mult<T> {

    T mult(T a, T b);
}
