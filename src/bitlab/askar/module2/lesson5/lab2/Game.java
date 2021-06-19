package bitlab.askar.module2.lesson5.lab2;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
    private String gameName;
    private String ipAddress;
    private int port;
    private ArrayList<Player> players = new ArrayList<Player>();

    public Game() {
    }

    public Game(String gameName, String ipAddress, int port) {
        this.gameName = gameName;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", port=" + port +
                ", players=" + players +
                '}';
    }
}
