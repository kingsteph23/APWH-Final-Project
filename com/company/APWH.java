package com.company;
// imports all java util modules

import java.time.format.DateTimeFormatter;
import  java.util.*;
// allows me to display
import java.time.*;

public class APWH {
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


        // Curriculum of APWH

        String[] curriculum = {"•Networks of exchange and the Global Tapestry :1200-1400(Silk road,mongols,saharan trade routes" +
                "\n•Land Based Empires 1450-1750->*Probably start here*, Learn about manchu's,mughals,Safavid's, and ottoman empires" +
                "\n•Transoceanic Interconnections 1450-1750(Like the colombian exchange, and new maritime empire)" +
                "\n•Revolutions 1750-1900(Enlightenment,industrial revolution,haitian,french,Latin American,and American revolutions)" +
                "\n•Consequences of Industrialization 1750-1900(Rise of imperialism/nationalism,migration patterns)" +
                "\n•Global Conflict 1900-Present(WW1,WW2, Why they happened,mass atrocities like the holocaust" +
                "\n•Cold war and decolonization(post ww2, spread of communism,big empires like britian go bust proxy wars like the Korean/Vietnam wars)" +
                "\n•Globalization(advances in tech,economic changes, reform movements, the modern world in a nutshell"};
// things to expect in fall of sophomore year(regarding APWH)
        String[] prepareforapexam = {"Practice exams",
                "\n•Study sessions with teachers",
                "\n•reviewing" +
                        "\n•The man, the myth, the legend,the man the god sent down to earth: Heimler's history,",
                "\n•Lots of reviewing" +
                        "\n•Praying dat you don't get caught lacking in these review sessions by your teacher" +
                        "\n•Practice,practice,practice" +
                        "\n•Teachers talking about ap exams(about 3hrs, consist of 55 multiple choice(tricky, but not bad),a couple Short response questions(ez),and a long essay"};

        // My tips for getting a good grade on ap world history exam

        String[] apexamtips = {"•When studying, use the pomodoro technique/timer. Small sessions,short breaks" +
                "\n•Dont attempt to study for hrs and hrs on end(especially without breaks). Leads to burnout easily" +
                "\n•If your teachers offer, Attend their practice study sessions(practices on MCQ's,SAQ's,and DBQ'S). " +
                "\n•The Night prior to the exam, don't do anything history related. Or dont cram everything. Do something that makes you happy(coding,riding bike,go for a walk,chill with the homies,etc)" +
                "\n•The day of the exam(whether in person or online), make sure you get the instructions you need" +
                "\n•Practice,practice,practice.  Do practice exams(ones that are short),and practice(especially in the spring) " +
                "\n•Don't stress yourself(prior and during the exam). Take your time."};

        // Warning/before we get start

        String[] warnings = {"•Type everything exactly as you see it, or it will result in a error or a unwanted response" +
                "\n•Don't spam the enter/return button, potentially create some unnecessary problems" +
                "\n•Take your time when writing/typing things" +
                "\n•You can play this text based adventure either on phone or laptop, but it might play a little better on laptop..." +
                "\n•Oh, and if you get a option for a response which consist of something like this\"(A)some question\"" +
                "\nYou basically have the option to choose between with whatever is in the (), or \"some question\"," +
                "\nbut you MUST type it exactly as you see it." +
                "\nHAVE FUN!"};
// warning
        System.out.println("⚠️BEFORE WE GET STARTED⚠️" +
                "\n⚠️Please read the following bellow⚠️" +
                "\n" + Arrays.toString(warnings));


        System.out.println();
        // Intro/title
        System.out.println("---------------------");
        System.out.println(" L'aventurier        ");
        System.out.println("Text Based Adventure ");
        System.out.println("---------------------");

// allows user to input
        Scanner scan = new Scanner(System.in);
        // Shoutout
        System.out.println("Before we  actually get started.............");

        scan.nextLine();
// actual start of the game.....
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
        if ("Proceed".equals(apwhchoice) || "Go back".equals(apwhchoice)) {
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

            String summerassignment = scan.nextLine();
            if ("Ofc".equals(summerassignment)) {
                System.out.println("Either that, or you'll get caught lackin by ya teacher\uD83D\uDE0A");
            } else if ("nosir".equals(summerassignment)) {
                System.out.println("NAUGHTY NAUGHTY NAUGHTY");
            }
            System.out.println("Damn, summer already flew......" +
                    "\nNow its time to go back to School............" +
                    "\nYou look at your schedule........." +
                    "\nPeriod 1: AP World History:  Teacher: Foster Mike......");
            System.out.println();
            scan.nextLine();
            // Intro towards el foster
            System.out.println("Oh snap," + username + ",You got senor Foster." +
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
            if ("A".equals(practiceexamquestions) || "The increase of Nationalist and imperialist ideals in Japan".equals(practiceexamquestions)) {
                System.out.println("Correct");
                practiceexamscore += 1;
            } else {
                System.out.println("Incorrect");
            }
            System.out.println();
            System.out.println("Question 2:" +
                    "\nThe result of a increase of nationalism,white man's burden, and increase of interest in raw materials" +
                    "\nby European powers lead to...." +
                    "\n(A)Increase in infighting between European powers" +
                    "\n(B)Increase in imperialist ideals and actions committed by European powers" +
                    "\n(C)Increase in racial discrimination by Europeans towards minorities that occurred in Europe");
            String practiceexamquestions2 = scan.nextLine();

            if ("B".equals(practiceexamquestions2) || "Increase in imperialist ideals and actions committed by European powers".equals(practiceexamquestions2)) {
                System.out.println("Correct");
                practiceexamscore += 1;
            } else {
                System.out.println("Incorrect");
            }
            System.out.println();
            System.out.println("Question 3:" +
                    "\nBetween 1750-1900, which were the four most major revolutions that occurred?" +
                    "\n(A)Haitian Revolution, Russian Revolution,Chinese Revolution,French Revolution" +
                    "\n(B)American Revolution,Iranian Revolution,French Revolution, The Quiet Revolution" +
                    "\n(C)Haitian Revolution, American Revolution,French Revolution,Latin American Revolutions ");

            String practiceexamquestions3 = scan.nextLine();

            if ("C".equals(practiceexamquestions3) || "Haitian Revolution, American Revolution,French Revolution,Latin American Revolutions ".equals(practiceexamquestions3)) {
                System.out.println("Correct!");
                practiceexamscore += 1;
            } else {
                System.out.println("Incorrect");
            }

            System.out.println();
            // Calculates overall average based on users score
            System.out.println("Final score:" + (practiceexamscore) + "/3");
            int overall = practiceexamscore;
            if (overall > 2) {
                System.out.println("That's a pretty good job," + username + "!");
            } else {
                System.out.println("Ehhh, we'll get there, so hold your horses," + username);
            }

            // time skipp/INTRO TO DBQ/SAQ

            System.out.println("And now you receive the list of basically the entire curriculum which consist of" +
                    "\nthe following" +
                    "\n" + Arrays.toString(curriculum));

            scan.nextLine();
            System.out.println("A couple of Hey Bro's,and Whats Up Sister's later.......");
            System.out.println("Uh ooh, now you gotta write the good ol \"DBQ\" and \"Saq\",but before you do that..." +
                    "\nDo you......" +
                    "\n(a)Panic for no reason" +
                    "\n(b)Watch the legendary heimler history" +
                    "\n:");
            String DBQ = scan.nextLine();
            if ("a".equals(DBQ) || "Panic for no reason".equals(DBQ)) {
                System.out.println("That's kinda dumb. No reason to stress," + username);
            } else if ("b".equals(DBQ) || "Watch the legendary heimler history".equals(DBQ)) {
                System.out.println("I like ya style. Better watch them videos," + username);
            }
            scan.nextLine();

            System.out.println("Anyway you spend the period working one a DBQ and a SAQ or two." +
                    "\n\"Maybe just the DBQ if you're lucky\"And basically work your butt off for a entire period," +
                    "\ntill your fingers fall off(literally).");
            System.out.println();
            System.out.println("Anyway, you finish, and than your El Foster wants you to watch a movie over the weekend" +
                    "\nAbout Latin american revolutions, particularly the Haitian revolution." +
                    "\nWill you complete the assignment and learn about how my country\uD83C\uDDED\uD83C\uDDF9 whopped france butt!?" +
                    "\nOFC" +
                    "\nNo, i gotta go out this weekend with my friends" +
                    "\n: ");
            String dochw = scan.nextLine();
            if ("OFC".equals(dochw)) {
                System.out.println("Bon Bagay. BETTER LEARN DAT REVOLUTION");
            } else {
                System.out.println("Wap kon jeorge\uD83D\uDE11");
            }
            System.out.println();
            System.out.println("Some weeks fly by, and it is announced that you have to do a APWH Midterm\uD83D\uDE33" +
                    "\nCovering topics from the beginning of the year(state building)-(the industrial revolution/ beggining of imperialism" +
                    "\nBtw, most of it is going to be multiple choice...But watcha finna do to prepare for this midterm(takes place in January" +
                    "\n(1)Dont study" +
                    "\n(2)Review flashcards based off those periods" +
                    "\n(3)Watch Heimler's history and do flashcards" +
                    "\n(4)Some other study method" +
                    "\n");

            String studymethod = scan.nextLine();
            if ("1".equals(studymethod) || "Dont Study".equals(studymethod)) {
                System.out.println("NAUGHTY NAUGHTY NAUGHTYYYYYYY");
            } else if ("2".equals(studymethod) || "Review flashcards based off those periods".equals(studymethod)) {
                System.out.println("HEY, THAT'S WHAT I DID");
            } else if ("3".equals(studymethod) || "Watch Heimler's history and do flashcards".equals(studymethod)) {
                System.out.println("Good ol heimler... I liked that....");
            } else {
                System.out.println("Really what study method do you use?");
                String othermethod = scan.nextLine();
                System.out.println("So you study via," + othermethod + ",Interesting..... " +
                        "But hey, whatever floats your boat");
            }
            scan.nextLine();
            System.out.println("A couple of hey bro's and hey sister's later......");
            // cold war project
            System.out.println("You have completed your midterms.. but not too long after," +
                    "\nyou're assigned a project....but on conflicts during the cold war." +
                    "\nYou have a few options which consist of the following:" +
                    "\nVietnam war" +
                    "\nKorea war" +
                    "\nSpace Race");

            String coldwarproject = scan.nextLine();
// cold war project types which consist of Vietnam war,Korean war, and the Space race between USSR & US
            if (coldwarproject.equals("Vietnam war")) {
                System.out.println("GOOOOOOOOOOOOOOOOOOODDD MORNING VIETNAM" +
                        "\nSo how would you like to do this assignment?" +
                        "\n(1)Record it like the great Stephen did" +
                        "\n(2)News type way" +
                        "\n(3)Maybe a quizlet on it" +
                        "\n:");
// vietnam war options
                String vietnamwar = scan.nextLine();

                if (vietnamwar.equals("1") || vietnamwar.equals("Record it like the great Stephen did")) {
                    System.out.println("\uD83D\uDC4F\uD83C\uDFFE\uD83D\uDC4F\uD83C\uDFFE\uD83D\uDC4F\uD83C\uDFFE\uD83D\uDE4C" +
                            "\uD83C\uDFFE\uD83D\uDE4C\uD83C\uDFFE\uD83D\uDE4C\uD83C\uDFFEYASSSSSS");
                } else if (vietnamwar.equals("2") || vietnamwar.equals("News type way")) {
                    System.out.println("Not bad\uD83D\uDC81\uD83C\uDFFE\u200D♂️.  Quick n easy....");
                } else if (vietnamwar.equals("3") || vietnamwar.equals("Maybe a quizlet on it")) {
                    System.out.println("\uD83E\uDD71\uD83E\uDD71, could be a tiny more creative, but okay ");
                }
// korean war options
            }
            if (coldwarproject.equals("Korea war")) {
                System.out.println("The forgotten war..........." +
                        "\nHow you finna do this one" + username +
                        "\n(1)News story " +
                        "\n(2)Newspaper");

                String koreanwar = scan.nextLine();

                if (koreanwar.equals("1") || koreanwar.equals("News story")) {
                    System.out.println("Noice, but remember to keep it under 3 minutes!!!");
                } else if (koreanwar.equals("2") || koreanwar.equals("Newspaper")) {
                    System.out.println("Not bad....");
                }


            }
            if (coldwarproject.equals("Space Race")) {
                System.out.println("Soo, how would you like to talk about" +
                        "\nthe biggest flex contest between the USSR and the USA?:" +
                        "\n(1)Record it the way the great Stephen did" +
                        "\n(2)News story" +
                        "\n(3)via a quiz" +
                        "\n(4)Newspaper" +
                        "\n:");
                // Space race options
                String flexcontest = scan.nextLine();
                if (flexcontest.equals("1") || flexcontest.equals("Record it the way the great Stephen did")) {
                    System.out.println("YESSIRRRRRRRRR. I RESPECT DAT\uD83D\uDC4F\uD83C\uDFFE\uD83D\uDC4F\uD83C\uDFFE");
                } else if (flexcontest.equals("2") || flexcontest.equals("News story")) {
                    System.out.println("And in other news, USSR decides to flex in technological superiority" +
                            "\nBy launching a satellite that is the size ");

                } else if (flexcontest.equals("3") || flexcontest.equals("via a quiz")) {
                    System.out.println("I did something, like that once.....");
                } else if (flexcontest.equals("4") || flexcontest.equals("Newspaper")) {
                    System.out.println("Not bad.......");
                }


            }
            // results after doing project
            System.out.println();
            System.out.println("You basically work ya butt off throughout spring break, and come to realize...." +
                    "\nyou damn near got 1-2 months before you gotta take the AP EXAM!" +
                    "\nTimes move fast doesn't it?" +
                    "\nofc" +
                    "\nofc" +
                    "\n:");

            String timemovesfast = scan.nextLine();
            if (timemovesfast.equals("ofc")) {
                System.out.println("Damn right does." +
                        "\nIf you think not, you must be living under a rock");
            }
            // list which consist of what to expected when preparing for ap exam in June
            System.out.println();
            System.out.println("Anyway, your teacher decides to give you a list of things to expect" +
                    "\nin the upcoming weeks which consist of the following:"
                    + Arrays.toString(prepareforapexam));

            System.out.println();
            // reaction based on the list above from prepareforapexam array/list
            System.out.println("Are you a little surprised by this list?" +
                    "\nHELL YESS" +
                    "\nHELL NOOO");
            String surprisedlist = scan.nextLine();
            if (surprisedlist.equals("HELL YESS") || surprisedlist.equals("HELL NOOO")) {
                System.out.println("Dont not fear," + username + "! Because I am here!");
                scan.nextLine();
                System.out.println("I got you with them ap exam tips that's finna help." +
                        "\n-------------------" +
                        "\nMy AP EXAM Tips" +
                        "\n-------------------" +
                        "\n" + Arrays.toString(apexamtips));
            }
            // end of text based adventure
            System.out.println("After studying your butt off for the past few months-the day arrives......" +
                    "\nYou sit in your bed thinking about and chilling before the exam...." +
                    "\nyou go to sleep in your comfy, extra blanket bed....");
            scan.nextLine();
            System.out.println("One Hey Sister and interrogating you on what you did during " +
                    "\nyour weekend or planning on doing later......");
            scan.nextLine();
            System.out.println("Eventually you wake up, and get some motivation for Senor Foster." +
                    "\nHe gives you one last whats up bro or one last hey sister,before you move out.");
            scan.nextLine();
            System.out.println("You go to either some room or hop on your laptop, and see" +
                    "\n------------------------------------------------- " +
                    "\nAP World History Exam-College Board\uD83C\uDF30" +
                    "\n--------------------------------------------------" +
                    "\nYou than proceed to read some documentation,watch a 1min video, and than you hit dat start button....." +
                    "\nAnd begin the exam you spent all year preparing for........");
            System.out.println();
            scan.nextLine();

            //credits
            System.out.println("I hopped these tips helped you," + username + "!" +
                    "\nGood luck in AP WORLD\uD83E\uDD18  ");
            System.out.println();

            //Credits

            String[] creatorsandcredits = {"\n•SP", "\n•AR", "\n•KS"};
            System.out.println("Creators" +
                    Arrays.toString(creatorsandcredits));

        }

    }
}




