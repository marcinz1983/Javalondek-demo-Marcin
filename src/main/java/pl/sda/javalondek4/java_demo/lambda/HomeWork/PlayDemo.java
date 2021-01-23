package pl.sda.javalondek4.java_demo.lambda.HomeWork;

public class PlayDemo {
    public static void main(String[] args) {


        PlayAble<Double> footBallPlayer = (players) -> {
            System.out.println("to jest interfejs footballplayer");
            return players * 10;
        };

        PlayAble<String> gamesPlayer=  (name)-> name.toUpperCase();

        PlayAble<Integer> losser = (a)-> {
            System.out.println("interface losser");
            return a * 100;
        };

        footBallPlayer.play(6d);
        gamesPlayer.play("Lewy");
        losser.play(25);


    }
}
