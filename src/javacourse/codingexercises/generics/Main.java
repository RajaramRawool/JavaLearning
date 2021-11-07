package javacourse.codingexercises.generics;

public class Main {
    public static void main(String[] args) {
        League<Team<CricketPlayer>> league = new League<>("IPL");
        System.out.println("======  " + league.getName() + "  ======");
        Team<CricketPlayer> cricket = new Team<>("Mumbai Indians");
        Team<FootballPlayer> football = new Team<>("Legends Team");

        league.addTeam(cricket);

//        league.addTeam(football);

        CricketPlayer rohitSharma = new CricketPlayer("Rohit Sharma");
        CricketPlayer kP = new CricketPlayer("Kieron Pollard");
        CricketPlayer jB = new CricketPlayer("Jasprit Bumrah");
        CricketPlayer sY = new CricketPlayer("Suryakumar Yadav");

        FootballPlayer messi = new FootballPlayer("Messi");
        FootballPlayer ronaldo = new FootballPlayer("Ronaldo");

        cricket.addPlayer(rohitSharma);
        cricket.addPlayer(kP);
        cricket.addPlayer(jB);

        cricket.addPlayer(sY);
        football.addPlayer(messi);
        football.addPlayer(ronaldo);

         league.printTeams();
        cricket.printPlayers();
        football.printPlayers();
    }
}
