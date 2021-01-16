package pl.sda.javalondek4.java_demo.lambda;

public class HelloLambda {
    public static void main(String[] args) {
        RunnerImplementation runnerImplementation = new RunnerImplementation();
        Runner runner = new RunnerImplementation();
        runner.go();
        runnerImplementation.walk();

        Runner anonymouseRunner = new Runner() {
            @Override
            public void go() {
                System.out.println("anymouse");
            }
        };
        anonymouseRunner.go();

    }
}
