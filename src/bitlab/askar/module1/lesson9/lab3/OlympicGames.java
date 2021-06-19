package bitlab.askar.module1.lesson9.lab3;

public class OlympicGames {
    String city;
    int year;
    Sportsman []sportsmen;

    public OlympicGames() {
    }

    public OlympicGames(String city, int year, Sportsman[] sportsmen) {
        this.city = city;
        this.year = year;
        this.sportsmen = sportsmen;
    }

    public void playSportsmen() {
        for (int i=0;i<sportsmen.length;i++){
            sportsmen[i].play();
        }
    }

}
