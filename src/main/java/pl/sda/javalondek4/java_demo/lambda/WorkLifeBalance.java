package pl.sda.javalondek4.java_demo.lambda;

@FunctionalInterface
public interface WorkLifeBalance {

    void hardWork();
     default void sleep(){};


    public static void main(String[] args) {



        WorkLifeBalance workLifeBalance =new WorkLifeBalance() {
            @Override
            public void hardWork() {
                System.out.println("pracuje");
            }

            @Override
            public void sleep() {
                System.out.println("spi");
            }
        };

        WorkLifeBalance workLifeBalance2 = () -> System.out.println("Normal Job");

        workLifeBalance2.hardWork();
        workLifeBalance2.sleep();
    }
}
