package com.practice;
/*Implementing teams and players in OOP with generics*/

public class Main {

    public static void main(String[] args) {
        FootballPlayer md = new FootballPlayer("MD", 42);
        BasketballPlayer yk = new BasketballPlayer("YK", 2);

        Team<FootballPlayer> ourTeam = new Team<>("UAM");
        ourTeam.addToTeam(md);
//        ourTeam.addToTeam(yk);
//        System.out.println(csTeam);


//        FootballPlayer player1 = new FootballPlayer("Enemy1",1);
//        FootballPlayer player2 = new FootballPlayer("Enemy2", 2);

        Team <FootballPlayer>politech = new Team<>("Poznańska Politechnika");
        Team<FootballPlayer> ourZbyszko = new Team<>("Zbycha");
        Team<FootballPlayer> theirJagienka = new Team<>("Jaga");
        Team<BasketballPlayer> noName = new Team<>("nonames");
//        politech.addToTeam(player1);
//        politech.addToTeam(player2);

        //game
        ourTeam.gameResult(politech, 1, 0);
        System.out.println(ourTeam);
        System.out.println(politech);




    }
}
