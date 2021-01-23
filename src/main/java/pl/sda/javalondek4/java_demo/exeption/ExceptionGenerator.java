package pl.sda.javalondek4.java_demo.exeption;

import java.util.Random;

public class ExceptionGenerator {

    public  String nick() throws NoNickException{

        Random random = new Random();
       if( random.nextInt(100) % 2 == 0){
           return "Marcin";

       }else{
           throw new NoNickException("I have no nick ...yet :p");
       }

    }

    public String nickv2() {
        String myNick;
        try { // first step
            myNick = nick();
        } catch (NoNickException e) { // second - sometimes
            System.out.println("Problem with nick generator...");
            myNick = "this user has no nick";
        } finally { // third // always
            // myNick = "from finally:)"; // it always overrides nick:(
        }
        return myNick;
    }



    public  String nickWithRunTimeException() throws NoNickRuntimeException{
        Random random = new Random();
        if( random.nextInt(100) % 2 == 0){
            return "Marcin";

        }else{
            throw new NoNickRuntimeException("I have no nick ...yet :p");
        }

    }

}
