package pl.sda.javalondek4.java_demo.optional.house;

import java.util.Optional;

public class HobDisplay {

    private  String DisplayMessage;

    public HobDisplay(String displayMessage) {
        DisplayMessage = displayMessage;
    }

    public Optional<String> getDisplayMessage() {
        return Optional.ofNullable(DisplayMessage);
    }

    public void setDisplayMessage(String displayMessage) {
        DisplayMessage = displayMessage;
    }

    @Override
    public String toString() {
        return "HobDisplay{" +
                "DisplayMessage='" + DisplayMessage + '\'' +
                '}';
    }
}
