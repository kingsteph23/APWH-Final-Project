package com.company;
// imports all java util modules

import  java.util.*;

public class APWH {

    public static void main(String[] args) {


       ArrayList<String> apsurvivalguide = new ArrayList<>();
// apwh survival guide tips

 apsurvivalguide.add("•Do ya work");
 apsurvivalguide.add("•Listen to the professors, and try not to get caught lacking by them\n");
 apsurvivalguide.add("•Ask questions if you need too(ya teachers are there for a reason)\n");

 apsurvivalguide.add("•The simpler and straightforward the notes, the better");
 apsurvivalguide.add("•If ya need to quiz yourself as practice\n");
 apsurvivalguide.add("•The night prior to your ap exam, just chill, and don't attempt to cram everything, " +
                     "\nor you’ll regret on the day of you actual exam");

 apsurvivalguide.add("•Learn how to utilize time i.e time what assignments you’re gonna do as AP gives many assignments.");
 apsurvivalguide.add("•Never do anything last minute");
 apsurvivalguide.add("•Don’t stress over assignments, most of the time you just need to put your mind to it\n");
 apsurvivalguide.add("•Don't depend on just class to get all ya info,  go outside of your class, watch or read something history related" +
                    "\n(whether its books other than ya textbooks, or watching yt videos or" +
                     "\nhistory like heimler history,john green, simple history are ya best bets imo)\n");

// Shouting out people who have helped me throughout the year

        String[] homies = {"KS","AR","CY","LL", "Family","Friends"};


        // Intro

        System.out.println("---------------");
        System.out.println(" L'aventurier  ");
        System.out.println("---------------");
// allows user to input
        Scanner scan = new Scanner(System.in);

        // Shoutout
        System.out.println("Before we get started............." +
                "\nWe wanna shout out these people that helped us through this goofy year.\uD83E\uDD27\uD83E\uDD73\uD83E\uDD73" +
                "\n"+Arrays.toString(homies));

        scan.nextLine();

            System.out.println("Whats ya name........");
            String username = scan.nextLine();

            System.out.println("Oh Well than hello,"+username+"!");
            System.out.println();

            System.out.println("Soooo, which topics do you wish to dive into  today?" +
                    "\n•(1)Surviving AP World History" +
                    "\n•(2)Hobbies and Skills" +
                    "\n•(3)Le Rona" +
                    ":");

            String topics = scan.nextLine();
            System.out.println();
            // for those who chose option 1, which was surviving AP WORLD HISTORY
            if (topics.equals("1") || topics.equals("Surviving AP World History")){
                System.out.println("You really want to know how to survive APWH?" +
                        "\nNote this will result in you having to put in dat work" +
                        "\nProceed" +
                        "\nGo back"+
                        "\n:");
                String apwhchoice = scan.nextLine();
                switch (apwhchoice) {
                    case "Proceed", "Go back" -> {
                        System.out.println("Tooo bad"+username+", we still going\uD83D\uDE08\uD83D\uDE08");
                        System.out.println();
                    }
                }
            }if(topics.equals("2") ||  topics.equals("Hobbies and Skills")) {
                System.out.println();
             }if(topics.equals("3") || topics.equals("Le Rona")){
                System.out.println();
        }


                }
            }



