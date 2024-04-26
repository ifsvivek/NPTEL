package dev.eas;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name, String type, String countryCode){
    @Override
    public String toString() {
        return name + " (" + type + " in " + countryCode + ")";
    }
}

public class Team<T extends Player, S> {
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public void addTeamMember(T t) {
        if(!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {
//        System.out.println(teamName + " Roster:");
//        System.out.println(teamMembers);
        System.out.print(teamName + " Roster:");
        System.out.println((affiliation == null) ? "" : "AFFLIATION: "+affiliation);
        for(T t: teamMembers) {
            System.out.println(t.name());
        }
    }

    public int rankings() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int outScore, int theirScore) {
        String message = "lost to";
        if(outScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (outScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + rankings() + ")";
    }
}
