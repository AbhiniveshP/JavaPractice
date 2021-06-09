package udemymasterclass.generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    int played = 0, lost = 0, won = 0, tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) return false;
        members.add(player);
        return true;
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if(ourScore > theirScore) {
            message = " beat ";
            this.won++;
        }
        else if(ourScore == theirScore) {
            message = " tied with ";
            this.tied++;
        }
        else {
            message = " lost to ";
            this.lost++;
        }
        this.played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (this.won * 2) + this.tied;
    }

    @Override
    public int compareTo(Team<T> other){
        if (this.ranking() > other.ranking()) return -1;
        else if (this.ranking() < other.ranking()) return 1;
        else return 0;
    }
}
