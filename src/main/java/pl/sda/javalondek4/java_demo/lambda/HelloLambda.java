package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {
    public static void main(String[] args) {
        MarcinRunner runnerImplementation = new MarcinRunner();
        Runner runner = new MarcinRunner();
        //runner.go();
       // runnerImplementation.walk();
        handleRunner(runner);

        Runner anonymouseRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("anymouse");
            }
        };
        //anonymouseRunner.go();
        handleRunner(anonymouseRunner);

        handleRunner(new Runner() {
            @Override
            public void go() {
                System.out.println("inside method call");
            }
        });

        //using lambda


        handleRunner(() -> System.out.println("inside lambda call"));
        Runner myFirstLambda = () -> {};
        Runner mySecoundLambda = () -> {
            System.out.println("inside my secoundLambda");
        };

        Runner myThirdLambda =() -> System.out.println("my third lambda");

            Runner myFourthLambda = () -> System.out.println("fourth Lambda");

            myFourthLambda.go();
            myFourthLambda.go(55);
            Runner.walk();


    }

    public  static  void handleRunner(Runner anyRunner){
        System.out.println(" calling handle Runner");
        anyRunner.go();
    }


}
