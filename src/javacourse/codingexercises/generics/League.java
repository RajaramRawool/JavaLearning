package javacourse.codingexercises.generics;

import java.util.ArrayList;

public class League {
    private String name;
    private ArrayList<Team> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(Team team) {
        if (this.teams.contains(team)) {
            System.out.println("Team Already exists in League");
            return false;
        } else {
            this.teams.add(team);
            return true;
        }
    }

    public void printTeams() {
        if (this.teams.isEmpty()) {
            System.out.println("There are no teams participated in League");
        }
        for (Team team : this.teams) {
            System.out.println( "*\t"+ team.getName());
        }
    }
}
