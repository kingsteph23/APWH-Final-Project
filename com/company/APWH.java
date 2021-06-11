package com.company;
// imports all java util modules

import java.time.format.DateTimeFormatter;
import  java.util.*;
import java.time.*;

public class APWH{
     public static void main(String[] args) {


         // Allows me to display current date based on user's system preferences.  But will be based on UTC when i put game into repl.it

         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
         LocalDate localDate = LocalDate.now();

         ArrayList<String> apsurvivalguide = new ArrayList<>();
// apwh survival guide tips

         apsurvivalguide.add("•Do ya work");
         apsurvivalguide.add("\n•Listen to the professors, and try not to get caught lacking by them");
         apsurvivalguide.add("\n•Ask questions if you need too(ya teachers are there for a reason)");

         apsurvivalguide.add("\n•The simpler and straightforward the notes, the better");
         apsurvivalguide.add("\n•If ya need to quiz yourself as practice");
         apsurvivalguide.add("\n•The night prior to your ap exam, just chill, and don't attempt to cram everything, " +
                 "\nor you’ll regret on the day of you actual exam");

         apsurvivalguide.add("\n•Learn how to utilize time i.e time what assignments you’re gonna do as AP gives many assignments.");
         apsurvivalguide.add("\n•Never do anything last minute");
         apsurvivalguide.add("\n•Don’t stress over assignments, most of the time you just need to put your mind to it");
         apsurvivalguide.add("\n•Don't depend on just class to get all ya info,  go outside of your class, watch or read something history related" +
                 "\n(whether its books, ya textbooks, or watching yt videos on" +
                 "\nhistory like heimler history,john green, simple history are ya best bets imo)");

// Shouting out people who have helped me throughout the year

         String[] homies = {"KS", "AR", "CY", "LL", "Family", "Friends"};

         // Curriculum of APWH

         String[] curriculum = {"•Networks of exchange and the Global Tapestry :1200-1400(Silk road,mongols,saharan trade routes" +
                 "\n•Land Based Empires 1450-1750->*Probably start here*, Learn about manchu's,mughals,Safavid's, and ottoman empires" +
                 "\n•Transoceanic Interconnections 1450-1750(Like the colombian exchange, and new maritime empire)" +
                 "\n•Revolutions 1750-1900(Enlightenment,industrial revolution,haitian,french,Latin American,and American revolutions)" +
                 "\n•Consequences of Industrialization 1750-1900(Rise of imperialism/nationalism,migration patterns)" +
                 "\n•Global Conflict 1900-Present(WW1,WW2, Why they happened,mass atrocities like the holocaust" +
                 "\n•Cold war and decolonization(post ww2, spread of communism,big empires like britian go bust proxy wars like the Korean/Vietnam wars)" +
                 "\n•Globalization(advances in tech,economic changes, reform movements, the modern world in a nutshell"};

         // Intro/title

         System.out.println("---------------");
         System.out.println(" L'aventurier  ");
         System.out.println("---------------");
// allows user to input
         Scanner scan = new Scanner(System.in);

         // Shoutout
         System.out.println("Before we get started............." +
                 "\nWe wanna shout out these people that helped us through this goofy year.\uD83E\uDD27\uD83E\uDD73\uD83E\uDD73" +
                 "\n" + Arrays.toString(homies));

         scan.nextLine();

         System.out.println("Whats ya name........");
         String username = scan.nextLine();

         System.out.println("Oh Well than hello," + username + "!");
         System.out.println();
         // for those who chose option 1, which was surviving AP WORLD HISTORY
             System.out.println("You really want to know how to survive APWH?" +
                     "\nNote this will result in you having to put in dat work" +
                     "\nProceed" +
                     "\nGo back" +
                     "\n:");

             String apwhchoice = scan.nextLine();
             switch (apwhchoice) {
                 case "Proceed", "Go back" -> {
                     System.out.println("Tooo bad," + username + ", we still going\uD83D\uDE08\uD83D\uDE08");
                     System.out.println();
                     scan.nextLine();
                     // summerassignment for topic 1
                     System.out.println("Congratulations, you have just been accepted into APWH for the  2021-2022" +
                             "\nschool year!" +
                             "\nHowever you are required to complete a summer assignment for APWH based " +
                             "\non trade routes, and state building between 1450-1750?" +
                             "\nWill you do the work?" +
                             "\nOfc" +
                             "\nnosir" +
                             "\n: ");
// based on your answer response will result if you are going to past the apwh exam or not

                     String summerassignment = scan.nextLine();
                     switch (summerassignment) {
                         case "Ofc" -> System.out.println("Either that, or you'll get caught lackin by ya teacher\uD83D\uDE0A");
                         case "nosir" -> System.out.println("NAUGHTY NAUGHTY NAUGHTY");

                     }
                     System.out.println("Damn, summer already flew......" +
                             "\nNow its time to go back to School............" +
                             "\nYou look at your schedule........." +
                             "\nPeriod 1: AP World History:  Teacher: Foster Mike......");
                     System.out.println();
                     scan.nextLine();
                     // Intro towards el foster
                     System.out.println("Oh snap" + username + ",You got senor Foster." +
                             "\nThe one and only, the teacher that catches you lacking on the spot." +
                             "\nHowever....Are you ready for  9 months of APWH of CLASS WITH SENOR FOSTER" +
                             "\nLETS GOO" +
                             "\nNO SIR" +
                             "\n:");
                     String elfoster = scan.nextLine();

                     if (elfoster.equals("LETS GOO") || elfoster.equals("NO SIR")) {
                         System.out.println("You ain't going nowhere," + username + ",\uD83D\uDE08\uD83D\uDE08");
                     }
                     scan.nextLine();
                     System.out.println("As you walk into his class, he gives a very important list:" +
                             "\nOne you must guard with your life,soul, and heart." +
                             "\n" + apsurvivalguide +
                             "\nThe holy survival guide of AP World History.....");
                     scan.nextLine();

// First exam(consists of 3questions)

                     System.out.println("But whoops, Senor Foster, has given you a exam" +
                             "\n.Well, more of a practice exam  to see watcha know so far" +
                             "\nBut he is quizzing you on several events which occurred from 1750-1900" +
                             "\nAre you ready?" +
                             "\nyes" +
                             "\nyes" +
                             "\n:");
                     String exam1 = scan.nextLine();

                     if ("yes".equals(exam1)) {
                         System.out.println("LETS GET ITTTTT");
                     }
                     System.out.println();
                     System.out.println("Practice exam 1:" +
                             "\n" + username + "" +
                             "\n" + dtf.format(localDate));
                     System.out.println();


                     System.out.println("Question 1:" +
                             "\nWhich of the following  caused a increase in the modernization of the Japanese military in the mid to late 1800s" +
                             "\n(A)The increase of Nationalist and imperialist ideals in Japan" +
                             "\n(B)Fighting between Japan and other imperialist powers" +
                             "\n(c)Japan's isolation period from the outside world other than the Dutch and the Chinese");

                     String practiceexamquestions = scan.nextLine();
// practice exam 1:question 1
                     int practiceexamscore = 0;
                     switch (practiceexamquestions) {
                         case "A", "The increase of Nationalist and imperialist ideals in Japan" -> {
                             System.out.println("Correct");
                             practiceexamscore += 1;
                         }
                         default -> System.out.println("Incorrect");
                     }
                     System.out.println();
                     System.out.println("Question 2:" +
                             "\nThe result of a increase of nationalism,white man's burden, and increase of interest in raw materials" +
                             "\nby European powers lead to...." +
                             "\n(A)Increase in infighting between European powers" +
                             "\n(B)Increase in imperialist ideals and actions committed by European powers" +
                             "\n(C)Increase in racial discrimination by Europeans towards minorities that occurred in Europe");
                     String practiceexamquestions2 = scan.nextLine();

                     switch (practiceexamquestions2) {
                         case "B", "Increase in imperialist ideals and actions committed by European powers" -> {
                             System.out.println("Correct");
                             practiceexamscore +=1;
                         }
                         default -> System.out.println("Incorrect");
                     }
                     System.out.println();
                     System.out.println("Question 3:" +
                             "\nBetween 1750-1900, which were the four most major revolutions that occurred?" +
                             "\n(A)Haitian Revolution, Russian Revolution,Chinese Revolution,French Revolution" +
                             "\n(B)American Revolution,Iranian Revolution,French Revolution, The Quiet Revolution" +
                             "\n(C)Haitian Revolution, American Revolution,French Revolution,Latin American Revolutions ");

                    String practiceexamquestions3 = scan.nextLine();

                    switch (practiceexamquestions3) {
                        case "C", "Haitian Revolution, American Revolution,French Revolution,Latin American Revolutions " -> {
                            System.out.println("Correct!");
                            practiceexamscore += 1;
                        }
                        default  -> System.out.println("Incorrect");



                        }

                     System.out.println();
                    // Calculates overall average based on users score
                     System.out.println("Final score:" + (practiceexamscore) + "/3");
                     int overall = practiceexamscore;
                     if(overall > 2){
                         System.out.println("That's a pretty good job,"+username+"!");
                     }else{
                         System.out.println("Ehhh, we'll get there, so hold your horses,"+username);
                     }

                     // time skipp

                     System.out.println("And now you receive the list of basically the entire curriculum which consist of" +
                             "\nthe following" +
                            "\n"+Arrays.toString(curriculum));

                    }
                 }
             }

         }




