package day12_Scanner;

import java.util.Scanner;

public class PickACard {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please pick a card");
        String cards= scan.nextLine();
        /* String cards;
        cards = "Hearts";
        cards = "Clubs";
        cards = "Diamonds";
        cards = "Spade";*/
        int[] deck = new int[52];
        String[] suits = {"Spades", "Diamonds", "Clubs", "Hearts"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};

        System.out.println("Please pick a race ");
        String race = scan.nextLine();
        /*String race;
        race = "Ace";
        race = "1";
        race = "2";
        race = "3";
        race = "4";
        race = "5";
        race = "6";
        race = "7";
        race = "8";
        race = "9";
        race = "10";
        race = "King";
        race = "Queen";
        race = "Jack";*/

        //System.out.println(race + " " + cards);


        if (cards == "Hearts") {
            switch (race) {
                case "ace":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "10":
                case "11":
                case "12":
                case "King":
                case "Queen":
                default:
            }
        } else if (cards == "Clubs") {
            switch (race) {
                case "ace":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "10":
                case "11":
                case "12":
                case "King":
                case "Queen":
                default:
            }
        } else if (cards == "Diamonds") {
            switch (race) {
                case "ace":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "10":
                case "11":
                case "12":
                case "King":
                case "Queen":
                default:
            }
        } else {
            switch (race) {
                case "ace":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "10":
                case "11":
                case "12":
                case "King":
                case "Queen":
                default:
            }

            System.out.println("The card you picked is " + race + " of " + cards);

        }
        scan.close();

    }
}

//kartlar tanimlanmali
//kartlari gostermeli
//karti secebilmeli
// karti scan etmeli
//sonucu gostermeli

//String pickRace= scan.nextLine();




