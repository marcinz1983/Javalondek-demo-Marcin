package pl.sda.javalondek4.java_demo.lambda;

public class MarcinRunner implements Runner{

    @Override
    public void go() {
        System.out.println("go go");
    }

    @Override
    public void go(int speed) {
        System.out.println("method go speed");
    }

    public  void walk(){
        System.out.println("walk");
    }

}
