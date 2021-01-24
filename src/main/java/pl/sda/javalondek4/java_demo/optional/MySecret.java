package pl.sda.javalondek4.java_demo.optional;

import pl.sda.javalondek4.java_demo.lambda.calculator.Operation;

import java.util.Optional;

import static java.util.Objects.nonNull;

public class MySecret<T>{


    private T secret;

    public MySecret(T secret) {
        this.secret = secret;
    }

    public T getSecret() {
        return secret;
    }

    public void setSecret(T secret) {
        this.secret = secret;

    }

    @Override
    public String toString() {
        return "MySecret{" +
                "secret='" + secret + '\'' +
                '}';
    }

    public static void main(String[] args) {

        MySecret<String> realone = new MySecret<>("to jest sekret nie mow nikomu ;)");
         MySecret<String> withNullContent = new MySecret<>(null);
         printSecretLength(realone);
         printSecretLength(withNullContent);


         MySecret<Integer> secretNumber = new MySecret<>(42);
         MySecret<Integer> secreNulltNumber = new MySecret<>(null);

         var secretNumOne = secretNumber.getSecret();
         var secretNull = secreNulltNumber;

         //optional<Integer>
        Optional<Integer> number = Optional.of(42);
        Optional<Integer> nullNumber = Optional.empty();
        Optional<Integer> nullNumber1 = Optional.of(secretNumber.getSecret());
    }


    public static  void printSecretLength(MySecret<String> mySecret){

        int secretLen =  mySecret.getSecret()!=null ? mySecret.getSecret().length() : 0;


        secretLen = nonNull(mySecret.getSecret()) ? mySecret.getSecret().length() : 0;

//        if(mySecret.getSecret()!=null){
//            secretLen = mySecret.getSecret().length();
//
//        }else{
//            secretLen = 0;
//        }

        System.out.println("My secret has : " + secretLen + "characters");
    }


    public  static<T>  void processSecret(T optional){
        Optional<T> opt = Optional.ofNullable(optional);
        int number = 4;
        Optional<Integer> numberInsideOptional = Optional.of(number);

       // T unpacked = opt.get(); don t do it!!

        T unpacked;

        unpacked = opt.orElse(null);
        unpacked = (T) opt.or(() -> null);

        Optional<String> string = Optional.empty();
        Optional<String> fromOptional = string.or(() -> Optional.of("no value"));

    }


}
