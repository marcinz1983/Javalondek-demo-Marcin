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

    }

    public  static  void handleRunner(Runner anyRunner){
        System.out.println(" calling handle Runner");
        anyRunner.go();
    }


}
