package pl.sda.javalondek4.java_demo.lambda.calculator;

public class CalcDemo {

    public static void main(String[] args) {
        System.out.println("playing with calculator lambdas");


        Adder<Integer> adder1 = (Integer a , Integer b) -> a+b;

        Adder<Integer> adder = (a,b) -> a+b;



        StrangeOne strangeOne = (a,b) -> {return 1;};

        StringAdder stringAdder = (one , two) -> {
            return one.concat(two);
        };


        MyAdder myAdder = (a,b,text) -> {
            System.out.println(text);
            return  a+b;};

        myAdder.addWithComment(5,6,"wynik 11");


        Substruction<Integer> substruction = (a,b) -> a-b;
        Division<Double> division = (a, b) -> a/b;

        Mult<Integer> mult = (a,b) ->a*b;

        Operation<Double> divisionOpreation = (a, b) -> a/b;


    }
}
