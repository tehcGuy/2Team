package com.practice;
/*Implementing teams and players in OOP with generics*/

public class Main {

    public static void main(String[] args) {
        FootballPlayer md = new FootballPlayer("MD", 42);
        BasketballPlayer yk = new BasketballPlayer("YK", 2);

        Team ourTeam = new Team("UAM");
        ourTeam.addToTeam(md);
        ourTeam.addToTeam(yk);
//        System.out.println(csTeam);


//        FootballPlayer player1 = new FootballPlayer("Enemy1",1);
//        FootballPlayer player2 = new FootballPlayer("Enemy2", 2);

        Team politech = new Team("Poznańska Politechnika");
//        politech.addToTeam(player1);
//        politech.addToTeam(player2);

        //game
        ourTeam.gameResult(politech, 1, 0);
        System.out.println(ourTeam);
        System.out.println(politech);

        Team ourZbyszko = new Team("Zbycha");

        Team theirJagienka = new Team("Jaga");

        ourZbyszko.gameResult(theirJagienka, 9, 5);


    }
}
