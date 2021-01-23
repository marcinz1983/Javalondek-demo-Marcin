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
        }

//        System.out.println("my nick is : "+ myNick);
//        String nullString = null;

        //nullString.concat("ma kota");

      //  System.out.println("????");


    }
}
