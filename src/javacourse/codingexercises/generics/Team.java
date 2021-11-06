package javacourse.codingexercises.generics;

import java.util.ArrayList;

public class Team<T extends Player> extends League {
    private ArrayList<T> players = new ArrayList<>();

    public Team(String name) {
        super(name);
    }

    public boolean addPlayer(T player) {
        if (this.players.contains(player)) {
            System.out.println("Player " + player.getName() + " already exists in team");
            return false;
        }
        this.players.add(player);
        return true;
    }

    public void printPlayers() {
        if (this.players.isEmpty()) {
            System.out.println("Currently no player available in Team " + this.getName());
        }
        for (Player player : this.players) {
            System.out.println("\t+\t" + player.getName() + " ("+ this.getName()+")");
        }
    }
}
