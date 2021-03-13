package com.practice;
/* Things to implement
 * getName
 * addPlayer (most complex)
 * numberOfPlayers
 * gameResult
 *
 * Next, make this class only accept to members only certain type of players (parameterized type)
 * */

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> members;
    private int win, lose, draw, played, numberOfPlayers;

    public Team(String name) {
        this.teamName = name;
        this.members = new ArrayList<>();
    }

    public void addToTeam(Player player) {
        if(members.contains(player)) {
            System.out.println("The player " + player.getName() + " already in team " + this.teamName);
            return;
        }
        members.add(player);
        System.out.println("Player " + player.getName() + " is added to " + this.teamName);
        this.numberOfPlayers++;
    }


    public void gameResult(Team opponentTeam, int ourScore, int theirScore) {
        if(opponentTeam == null || this.teamName == opponentTeam.teamName ) {
            System.out.println("Please, enter a valid opponent!");
            return;
        }
        this.played++;
        opponentTeam.played++;

        if(ourScore > theirScore) {
            this.win++;
            opponentTeam.lose++;
        } else if(ourScore == theirScore) {
            this.draw++;
            opponentTeam.draw++;
        } else {
            this.lose++;
            opponentTeam.win++;
        }
    }

    //    TAKE AWAY
    public String getMembers() {
        String stringMembers = members.toString();

        //getting rid of the square bracket when printing the list entries
        //https://stackoverflow.com/questions/31718178/how-to-remove-the-brackets-from-arraylisttostringx
        return stringMembers.substring(1, (stringMembers.length() - 1)) + '\n';
    }
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String toString() {
        if(this.played == 0){
            return "Your team " + this.teamName + " played no game";
        }

        System.out.println(); //indentation
        System.out.println("Team " + "teamName='" + teamName + '\'' + "\nwin=" + win + "\nlose=" + lose + "\ndraw=" + draw + "\nplayed=" + played + "\nnumberOfPlayers=" + numberOfPlayers);
        System.out.println("Members: ");
        return getMembers();
    }
}
