package pl.sda.javalondek4.java_demo.exeption;

public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();

        String myNick;
        try {
           myNick = exceptionGenerator.nick();
        } catch (NoNickCheckedException e) {
            System.out.println("Problem with nick generator..");
            myNick = "this user has no nick";
        }finally {
            System.out.println("i tak sie wykona");
        }

        System.out.println("Now with runTime exception");

        try {
            myNick= exceptionGenerator.nickWithRunTimeException();
        }catch (NoNickRuntimeExc e){
            System.out.println("wyjatek z RuntimeException");
            myNick = "Przypisanie z runtimeExcepion";
        }



//        System.out.println("my nick is : "+ myNick);
//        String nullString = null;

        //nullString.concat("ma kota");

      //  System.out.println("????");


        System.out.println(" with dealer :)");
        NIckDealer nIckDealer = new NIckDealer( new ExceptionGenerator());
        String myNickDealer;
        try {
            myNickDealer =  nIckDealer.nickFromDealer();
        } catch (NoNickCheckedException e) {
            myNickDealer = "deafoult nick name";
            System.out.println("masege from myDealer");
        }
        System.out.println("here???");

        try {

            myNickDealer =nIckDealer.nick();
        }catch (NoNickRuntimeExc exc){
            myNickDealer = "unexpection value....";
        }
    }
}
