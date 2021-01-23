package pl.sda.javalondek4.java_demo.exeption;

public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();

        String myNick;
        try {
           myNick = exceptionGenerator.nick();
        } catch (NoNickException e) {
            System.out.println("Problem with nick generator..");
            myNick = "this user has no nick";
        }finally {
            System.out.println("i tak sie wykona");
        }

        System.out.println("Now with runTime exception");

        try {
            myNick= exceptionGenerator.nickWithRunTimeException();
        }catch (NoNickRuntimeException e){
            System.out.println("wyjatek z RuntimeException");
            myNick = "Przypisanie z runtimeExcepion";
        }



//        System.out.println("my nick is : "+ myNick);
//        String nullString = null;

        //nullString.concat("ma kota");

      //  System.out.println("????");


    }
}
