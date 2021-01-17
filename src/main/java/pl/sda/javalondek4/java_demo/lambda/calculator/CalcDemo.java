package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calculator lambdas");


        Adder adder1 = (int a, int b) -> a+b;

        Adder adder = (a,b) -> a+b;



        StrangeOne strangeOne = (a,b) -> {return 1;};

        StringAdder stringAdder = (one , two) -> {
            return one.concat(two);
        };


        MyAdder myAdder = (a,b,text) -> {
            System.out.println(text);
            return  a+b;};

        myAdder.addWithComment(5,6,"wynik 11");


        Substruction substruction = (a,b) -> a-b;
        Division division = (a, b) -> a/b;

        Mult mult = (a,b) ->a*b;



    }
}
