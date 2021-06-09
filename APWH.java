package com.company;
// imports all java util modules
import  java.util.*;

public class APWH {

    public static void main(String[] args) {


       ArrayList<String> apsurvivalguide = new ArrayList<>();
// apwh suvrvival guide tips
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
                                "\n(whether its books other than ya textbooks, or watching yt videos o" +
                                "\nhistory like heimler history,john green, simple history are ya best bets imo)\n");


        // Intro

        System.out.println("---------------");
        System.out.println("    APWH       ");
        System.out.println(" Survival Guide");
        System.out.println("---------------");
// allows user to input
        Scanner scan = new Scanner(System.in);
            System.out.println("Before we get started............." +
                    "\nWhats ya name........");
            String username = scan.nextLine();

            System.out.println("Oh Well than hello,"+username+"!");
            System.out.println();
          System.out.println(apsurvivalguide.get(9));

    }
}
