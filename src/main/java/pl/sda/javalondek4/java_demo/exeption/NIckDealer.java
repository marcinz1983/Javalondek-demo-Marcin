package pl.sda.javalondek4.java_demo.exeption;

public class NIckDealer {

    private  ExceptionGenerator exceptionGenerator;

    public NIckDealer(ExceptionGenerator exceptionGenerator) {
        this.exceptionGenerator = exceptionGenerator;
    }

    public String nickFromDealer() throws NoNickCheckedException {
        return  exceptionGenerator.nick();
    }

    public String nick(){
        return exceptionGenerator.nickWithRunTimeException();
    }
}
